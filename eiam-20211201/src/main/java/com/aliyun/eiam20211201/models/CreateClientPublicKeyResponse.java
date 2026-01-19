// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateClientPublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateClientPublicKeyResponseBody body;

    public static CreateClientPublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClientPublicKeyResponse self = new CreateClientPublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateClientPublicKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClientPublicKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateClientPublicKeyResponse setBody(CreateClientPublicKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClientPublicKeyResponseBody getBody() {
        return this.body;
    }

}
