// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class InstantiateChaincodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstantiateChaincodeResponseBody body;

    public static InstantiateChaincodeResponse build(java.util.Map<String, ?> map) throws Exception {
        InstantiateChaincodeResponse self = new InstantiateChaincodeResponse();
        return TeaModel.build(map, self);
    }

    public InstantiateChaincodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstantiateChaincodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstantiateChaincodeResponse setBody(InstantiateChaincodeResponseBody body) {
        this.body = body;
        return this;
    }
    public InstantiateChaincodeResponseBody getBody() {
        return this.body;
    }

}
