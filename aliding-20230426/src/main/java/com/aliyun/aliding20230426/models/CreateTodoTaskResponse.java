// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateTodoTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTodoTaskResponseBody body;

    public static CreateTodoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTodoTaskResponse self = new CreateTodoTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateTodoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTodoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTodoTaskResponse setBody(CreateTodoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTodoTaskResponseBody getBody() {
        return this.body;
    }

}
