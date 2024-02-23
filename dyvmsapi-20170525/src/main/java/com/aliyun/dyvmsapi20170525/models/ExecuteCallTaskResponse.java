// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ExecuteCallTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteCallTaskResponseBody body;

    public static ExecuteCallTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteCallTaskResponse self = new ExecuteCallTaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteCallTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteCallTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteCallTaskResponse setBody(ExecuteCallTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteCallTaskResponseBody getBody() {
        return this.body;
    }

}
