// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateTodoTaskExecutorStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTodoTaskExecutorStatusResponseBody body;

    public static UpdateTodoTaskExecutorStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTodoTaskExecutorStatusResponse self = new UpdateTodoTaskExecutorStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTodoTaskExecutorStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTodoTaskExecutorStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTodoTaskExecutorStatusResponse setBody(UpdateTodoTaskExecutorStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTodoTaskExecutorStatusResponseBody getBody() {
        return this.body;
    }

}
