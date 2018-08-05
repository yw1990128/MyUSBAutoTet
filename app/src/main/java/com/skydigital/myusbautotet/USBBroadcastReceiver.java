package com.skydigital.myusbautotet;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class USBBroadcastReceiver extends BroadcastReceiver {

    private static final String TAG = "USBBroadcastReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        Log.d(TAG, "onReceive: ");


        switch (intent.getAction()) {
            case Intent.ACTION_MEDIA_MOUNTED: {
                Toast.makeText(context, "插入", Toast.LENGTH_LONG).show();
                break;
            }
            case Intent.ACTION_MEDIA_UNMOUNTED: {
                Toast.makeText(context, "拔出", Toast.LENGTH_LONG).show();
                break;
            }
            default:
                break;
        }




//        if(intent.getAction().equals(Intent.ACTION_MEDIA_MOUNTED)){
//            if (intent.getExtras().getBoolean("connected")){
//                // usb 插入
//                Toast.makeText(context, "插入", Toast.LENGTH_LONG).show();
//            }else{
//                //   usb 拔出
//                Toast.makeText(context, "拔出", Toast.LENGTH_LONG).show();
//            }
//        }

//        throw new UnsupportedOperationException("Not yet implemented");
    }
}
