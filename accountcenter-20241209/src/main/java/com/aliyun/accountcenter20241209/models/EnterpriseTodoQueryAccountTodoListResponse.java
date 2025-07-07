// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseTodoQueryAccountTodoListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseTodoQueryAccountTodoListResponseBody body;

    public static EnterpriseTodoQueryAccountTodoListResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseTodoQueryAccountTodoListResponse self = new EnterpriseTodoQueryAccountTodoListResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseTodoQueryAccountTodoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseTodoQueryAccountTodoListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseTodoQueryAccountTodoListResponse setBody(EnterpriseTodoQueryAccountTodoListResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseTodoQueryAccountTodoListResponseBody getBody() {
        return this.body;
    }

}
