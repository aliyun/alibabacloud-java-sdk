// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreatePersonalTodoTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePersonalTodoTaskResponseBody body;

    public static CreatePersonalTodoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalTodoTaskResponse self = new CreatePersonalTodoTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersonalTodoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersonalTodoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePersonalTodoTaskResponse setBody(CreatePersonalTodoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersonalTodoTaskResponseBody getBody() {
        return this.body;
    }

}
