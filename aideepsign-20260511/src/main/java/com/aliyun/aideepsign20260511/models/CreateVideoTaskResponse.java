// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateVideoTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVideoTaskResponseBody body;

    public static CreateVideoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoTaskResponse self = new CreateVideoTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVideoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVideoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVideoTaskResponse setBody(CreateVideoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVideoTaskResponseBody getBody() {
        return this.body;
    }

}
