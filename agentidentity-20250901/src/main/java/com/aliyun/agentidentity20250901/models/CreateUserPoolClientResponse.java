// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateUserPoolClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUserPoolClientResponseBody body;

    public static CreateUserPoolClientResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserPoolClientResponse self = new CreateUserPoolClientResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserPoolClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserPoolClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserPoolClientResponse setBody(CreateUserPoolClientResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserPoolClientResponseBody getBody() {
        return this.body;
    }

}
