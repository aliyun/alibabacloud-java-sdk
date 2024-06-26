// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class QueryTransactionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTransactionResponseBody body;

    public static QueryTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTransactionResponse self = new QueryTransactionResponse();
        return TeaModel.build(map, self);
    }

    public QueryTransactionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTransactionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTransactionResponse setBody(QueryTransactionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTransactionResponseBody getBody() {
        return this.body;
    }

}
