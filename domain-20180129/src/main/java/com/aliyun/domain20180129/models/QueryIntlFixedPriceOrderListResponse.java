// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryIntlFixedPriceOrderListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryIntlFixedPriceOrderListResponseBody body;

    public static QueryIntlFixedPriceOrderListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIntlFixedPriceOrderListResponse self = new QueryIntlFixedPriceOrderListResponse();
        return TeaModel.build(map, self);
    }

    public QueryIntlFixedPriceOrderListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIntlFixedPriceOrderListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIntlFixedPriceOrderListResponse setBody(QueryIntlFixedPriceOrderListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIntlFixedPriceOrderListResponseBody getBody() {
        return this.body;
    }

}
