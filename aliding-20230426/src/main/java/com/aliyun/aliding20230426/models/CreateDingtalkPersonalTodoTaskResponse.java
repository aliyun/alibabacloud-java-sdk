// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateDingtalkPersonalTodoTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDingtalkPersonalTodoTaskResponseBody body;

    public static CreateDingtalkPersonalTodoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDingtalkPersonalTodoTaskResponse self = new CreateDingtalkPersonalTodoTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDingtalkPersonalTodoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDingtalkPersonalTodoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDingtalkPersonalTodoTaskResponse setBody(CreateDingtalkPersonalTodoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDingtalkPersonalTodoTaskResponseBody getBody() {
        return this.body;
    }

}
