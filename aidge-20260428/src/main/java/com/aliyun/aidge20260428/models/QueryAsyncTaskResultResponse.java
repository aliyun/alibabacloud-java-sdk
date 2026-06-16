// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class QueryAsyncTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAsyncTaskResultResponseBody body;

    public static QueryAsyncTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAsyncTaskResultResponse self = new QueryAsyncTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryAsyncTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAsyncTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAsyncTaskResultResponse setBody(QueryAsyncTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAsyncTaskResultResponseBody getBody() {
        return this.body;
    }

}
