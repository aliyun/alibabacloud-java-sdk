// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ExecuteTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
