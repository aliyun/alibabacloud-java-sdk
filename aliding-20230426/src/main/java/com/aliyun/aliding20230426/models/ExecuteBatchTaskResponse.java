// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ExecuteBatchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteBatchTaskResponseBody body;

    public static ExecuteBatchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteBatchTaskResponse self = new ExecuteBatchTaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteBatchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteBatchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteBatchTaskResponse setBody(ExecuteBatchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteBatchTaskResponseBody getBody() {
        return this.body;
    }

}
