// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountTransactionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAccountTransactionsResponseBody body;

    public static QueryAccountTransactionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountTransactionsResponse self = new QueryAccountTransactionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountTransactionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccountTransactionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccountTransactionsResponse setBody(QueryAccountTransactionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccountTransactionsResponseBody getBody() {
        return this.body;
    }

}
