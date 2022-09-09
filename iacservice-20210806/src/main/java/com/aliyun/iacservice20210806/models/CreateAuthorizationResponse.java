// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAuthorizationResponseBody body;

    public static CreateAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationResponse self = new CreateAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAuthorizationResponse setBody(CreateAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAuthorizationResponseBody getBody() {
        return this.body;
    }

}
