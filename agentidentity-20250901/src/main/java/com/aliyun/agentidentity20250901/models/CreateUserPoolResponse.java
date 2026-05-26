// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateUserPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUserPoolResponseBody body;

    public static CreateUserPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserPoolResponse self = new CreateUserPoolResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserPoolResponse setBody(CreateUserPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserPoolResponseBody getBody() {
        return this.body;
    }

}
