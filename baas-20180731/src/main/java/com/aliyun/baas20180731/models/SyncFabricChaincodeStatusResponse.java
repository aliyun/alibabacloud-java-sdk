// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class SyncFabricChaincodeStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncFabricChaincodeStatusResponseBody body;

    public static SyncFabricChaincodeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncFabricChaincodeStatusResponse self = new SyncFabricChaincodeStatusResponse();
        return TeaModel.build(map, self);
    }

    public SyncFabricChaincodeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncFabricChaincodeStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncFabricChaincodeStatusResponse setBody(SyncFabricChaincodeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncFabricChaincodeStatusResponseBody getBody() {
        return this.body;
    }

}
