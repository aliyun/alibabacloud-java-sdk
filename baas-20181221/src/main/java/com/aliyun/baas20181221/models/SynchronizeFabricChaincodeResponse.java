// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class SynchronizeFabricChaincodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SynchronizeFabricChaincodeResponseBody body;

    public static SynchronizeFabricChaincodeResponse build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeFabricChaincodeResponse self = new SynchronizeFabricChaincodeResponse();
        return TeaModel.build(map, self);
    }

    public SynchronizeFabricChaincodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SynchronizeFabricChaincodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SynchronizeFabricChaincodeResponse setBody(SynchronizeFabricChaincodeResponseBody body) {
        this.body = body;
        return this;
    }
    public SynchronizeFabricChaincodeResponseBody getBody() {
        return this.body;
    }

}
