// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class CreateTlogTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTlogTaskResponseBody body;

    public static CreateTlogTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTlogTaskResponse self = new CreateTlogTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateTlogTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTlogTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTlogTaskResponse setBody(CreateTlogTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTlogTaskResponseBody getBody() {
        return this.body;
    }

}
