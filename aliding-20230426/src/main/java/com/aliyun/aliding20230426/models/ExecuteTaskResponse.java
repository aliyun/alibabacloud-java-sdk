// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ExecuteTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteTaskResponseBody body;

    public static ExecuteTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTaskResponse self = new ExecuteTaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteTaskResponse setBody(ExecuteTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteTaskResponseBody getBody() {
        return this.body;
    }

}
