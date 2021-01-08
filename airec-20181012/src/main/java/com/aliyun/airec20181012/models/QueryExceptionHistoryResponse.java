// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class QueryExceptionHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryExceptionHistoryResponse setBody(QueryExceptionHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExceptionHistoryResponseBody getBody() {
        return this.body;
    }

}
