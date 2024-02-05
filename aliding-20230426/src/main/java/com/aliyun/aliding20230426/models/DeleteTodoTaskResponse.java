// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteTodoTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTodoTaskResponseBody body;

    public static DeleteTodoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTodoTaskResponse self = new DeleteTodoTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTodoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTodoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTodoTaskResponse setBody(DeleteTodoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTodoTaskResponseBody getBody() {
        return this.body;
    }

}
