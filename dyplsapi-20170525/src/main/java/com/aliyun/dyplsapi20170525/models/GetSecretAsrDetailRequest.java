// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetSecretAsrDetailRequest extends TeaModel {
    /**
     * <p>The ID of the call record.</p>
     * <p>You can log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view <strong>Call Record ID</strong> on the <strong>Call Record Query</strong> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>225625****</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>The call initiation time in the call record.</p>
     * <p>You can log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a>. View <strong>Call Initiated At</strong> on the <strong>Call Record Query</strong> page, or view the call_time field in the Call Detail Record (CDR) receipt.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-03-05 12:00:00</p>
     */
    @NameInMap("CallTime")
    public String callTime;

    /**
     * <p>The key of the phone number pool.</p>
     * <p>You can log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC2267****</p>
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
