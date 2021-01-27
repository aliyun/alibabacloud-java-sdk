// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountTransactionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryAccountTransactionsResponse setBody(QueryAccountTransactionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccountTransactionsResponseBody getBody() {
        return this.body;
    }

}
