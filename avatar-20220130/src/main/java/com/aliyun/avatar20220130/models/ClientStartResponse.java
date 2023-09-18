// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class ClientStartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ClientStartResponseBody body;

    public static ClientStartResponse build(java.util.Map<String, ?> map) throws Exception {
        ClientStartResponse self = new ClientStartResponse();
        return TeaModel.build(map, self);
    }

    public ClientStartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClientStartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClientStartResponse setBody(ClientStartResponseBody body) {
        this.body = body;
        return this;
    }
    public ClientStartResponseBody getBody() {
        return this.body;
    }

}
