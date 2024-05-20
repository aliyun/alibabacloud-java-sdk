// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateUserSuppressionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUserSuppressionResponseBody body;

    public static CreateUserSuppressionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserSuppressionResponse self = new CreateUserSuppressionResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserSuppressionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserSuppressionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserSuppressionResponse setBody(CreateUserSuppressionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserSuppressionResponseBody getBody() {
        return this.body;
    }

}
