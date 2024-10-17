// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryExchangeRateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryExchangeRateResponseBody body;

    public static QueryExchangeRateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExchangeRateResponse self = new QueryExchangeRateResponse();
        return TeaModel.build(map, self);
    }

    public QueryExchangeRateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExchangeRateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExchangeRateResponse setBody(QueryExchangeRateResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExchangeRateResponseBody getBody() {
        return this.body;
    }

}
