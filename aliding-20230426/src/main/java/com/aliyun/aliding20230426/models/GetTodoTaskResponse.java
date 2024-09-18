// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetTodoTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTodoTaskResponseBody body;

    public static GetTodoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTodoTaskResponse self = new GetTodoTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetTodoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTodoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTodoTaskResponse setBody(GetTodoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTodoTaskResponseBody getBody() {
        return this.body;
    }

}
