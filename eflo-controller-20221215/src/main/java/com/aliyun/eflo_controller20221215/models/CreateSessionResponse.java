// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSessionResponseBody body;

    public static CreateSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionResponse self = new CreateSessionResponse();
        return TeaModel.build(map, self);
    }

    public CreateSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSessionResponse setBody(CreateSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSessionResponseBody getBody() {
        return this.body;
    }

}
