// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetSecretAsrDetailRequest extends TeaModel {
    /**
     * <p>The ID of the call record.</p>
     * <br>
     * <p>You can log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view **Call Record ID** on the **Call Record Query** page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>The call initiation time in the call record.</p>
     * <br>
     * <p>You can log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account). View **Call Initiated At** on the **Call Record Query** page, or view the call_time field in the Call Detail Record (CDR) receipt.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CallTime")
    public String callTime;

    /**
     * <p>The key of the phone number pool.</p>
     * <br>
     * <p>You can log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view the key of the phone number pool on the **Number Pool Management** page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    public static GetSecretAsrDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecretAsrDetailRequest self = new GetSecretAsrDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetSecretAsrDetailRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public GetSecretAsrDetailRequest setCallTime(String callTime) {
        this.callTime = callTime;
        return this;
    }
    public String getCallTime() {
        return this.callTime;
    }

    public GetSecretAsrDetailRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

}
