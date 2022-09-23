// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class GetSecretAsrInfoRequest extends TeaModel {
    @NameInMap("CallId")
    public String callId;

    @NameInMap("CallTime")
    public String callTime;

    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ProdCode")
    public String prodCode;

    public static GetSecretAsrInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecretAsrInfoRequest self = new GetSecretAsrInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetSecretAsrInfoRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public GetSecretAsrInfoRequest setCallTime(String callTime) {
        this.callTime = callTime;
        return this;
    }
    public String getCallTime() {
        return this.callTime;
    }

    public GetSecretAsrInfoRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public GetSecretAsrInfoRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

}
