// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountBalanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAccountBalanceResponseBody body;

    public static QueryAccountBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountBalanceResponse self = new QueryAccountBalanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountBalanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccountBalanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccountBalanceResponse setBody(QueryAccountBalanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccountBalanceResponseBody getBody() {
        return this.body;
    }

}
