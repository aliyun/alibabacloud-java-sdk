// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class QueryExceptionHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryExceptionHistoryResponseBody body;

    public static QueryExceptionHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExceptionHistoryResponse self = new QueryExceptionHistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryExceptionHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExceptionHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExceptionHistoryResponse setBody(QueryExceptionHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExceptionHistoryResponseBody getBody() {
        return this.body;
    }

}
