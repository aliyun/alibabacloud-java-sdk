// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ExecuteAsyncSqlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteAsyncSqlResponseBody body;

    public static ExecuteAsyncSqlResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAsyncSqlResponse self = new ExecuteAsyncSqlResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteAsyncSqlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteAsyncSqlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteAsyncSqlResponse setBody(ExecuteAsyncSqlResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteAsyncSqlResponseBody getBody() {
        return this.body;
    }

}
