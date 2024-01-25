// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPriceResponseBody body;

    public static QueryPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPriceResponse self = new QueryPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPriceResponse setBody(QueryPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPriceResponseBody getBody() {
        return this.body;
    }

}
