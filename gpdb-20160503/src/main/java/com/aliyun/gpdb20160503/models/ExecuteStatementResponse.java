// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ExecuteStatementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteStatementResponseBody body;

    public static ExecuteStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteStatementResponse self = new ExecuteStatementResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteStatementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteStatementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteStatementResponse setBody(ExecuteStatementResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteStatementResponseBody getBody() {
        return this.body;
    }

}
