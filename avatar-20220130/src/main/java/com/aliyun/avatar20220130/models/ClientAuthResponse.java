// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class ClientAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClientAuthResponseBody body;

    public static ClientAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        ClientAuthResponse self = new ClientAuthResponse();
        return TeaModel.build(map, self);
    }

    public ClientAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClientAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClientAuthResponse setBody(ClientAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public ClientAuthResponseBody getBody() {
        return this.body;
    }

}
