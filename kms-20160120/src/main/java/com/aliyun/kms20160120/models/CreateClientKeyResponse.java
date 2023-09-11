// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateClientKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateClientKeyResponseBody body;

    public static CreateClientKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClientKeyResponse self = new CreateClientKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateClientKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClientKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateClientKeyResponse setBody(CreateClientKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClientKeyResponseBody getBody() {
        return this.body;
    }

}
