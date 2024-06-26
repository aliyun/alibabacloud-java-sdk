// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class SynchronizeChaincodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SynchronizeChaincodeResponseBody body;

    public static SynchronizeChaincodeResponse build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeChaincodeResponse self = new SynchronizeChaincodeResponse();
        return TeaModel.build(map, self);
    }

    public SynchronizeChaincodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SynchronizeChaincodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SynchronizeChaincodeResponse setBody(SynchronizeChaincodeResponseBody body) {
        this.body = body;
        return this;
    }
    public SynchronizeChaincodeResponseBody getBody() {
        return this.body;
    }

}
