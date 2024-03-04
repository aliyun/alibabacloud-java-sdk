// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class QueryAsyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAsyncTaskResponseBody body;

    public static QueryAsyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAsyncTaskResponse self = new QueryAsyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryAsyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAsyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAsyncTaskResponse setBody(QueryAsyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAsyncTaskResponseBody getBody() {
        return this.body;
    }

}
