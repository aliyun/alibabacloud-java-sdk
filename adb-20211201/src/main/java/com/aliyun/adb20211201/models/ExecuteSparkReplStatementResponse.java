// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ExecuteSparkReplStatementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteSparkReplStatementResponseBody body;

    public static ExecuteSparkReplStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSparkReplStatementResponse self = new ExecuteSparkReplStatementResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteSparkReplStatementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteSparkReplStatementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteSparkReplStatementResponse setBody(ExecuteSparkReplStatementResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteSparkReplStatementResponseBody getBody() {
        return this.body;
    }

}
