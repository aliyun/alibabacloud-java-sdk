// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class CreateLabSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLabSessionResponseBody body;

    public static CreateLabSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLabSessionResponse self = new CreateLabSessionResponse();
        return TeaModel.build(map, self);
    }

    public CreateLabSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLabSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLabSessionResponse setBody(CreateLabSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLabSessionResponseBody getBody() {
        return this.body;
    }

}
