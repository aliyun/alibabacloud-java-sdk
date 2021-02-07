// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetSecretAsrDetailRequest extends TeaModel {
    @NameInMap("CallId")
    @Validation(required = true)
    public String callId;

    @NameInMap("CallTime")
    @Validation(required = true)
    public String callTime;

    @NameInMap("PoolKey")
    @Validation(required = true)
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
