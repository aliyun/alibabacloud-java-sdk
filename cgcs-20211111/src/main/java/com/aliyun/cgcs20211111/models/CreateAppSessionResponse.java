// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppSessionResponseBody body;

    public static CreateAppSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSessionResponse self = new CreateAppSessionResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppSessionResponse setBody(CreateAppSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppSessionResponseBody getBody() {
        return this.body;
    }

}
