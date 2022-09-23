// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryBuyResInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBuyResInfoResponseBody body;

    public static QueryBuyResInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuyResInfoResponse self = new QueryBuyResInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuyResInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBuyResInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBuyResInfoResponse setBody(QueryBuyResInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBuyResInfoResponseBody getBody() {
        return this.body;
    }

}
