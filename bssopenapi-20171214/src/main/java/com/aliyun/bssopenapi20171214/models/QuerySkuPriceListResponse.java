// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySkuPriceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySkuPriceListResponseBody body;

    public static QuerySkuPriceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySkuPriceListResponse self = new QuerySkuPriceListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySkuPriceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySkuPriceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySkuPriceListResponse setBody(QuerySkuPriceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySkuPriceListResponseBody getBody() {
        return this.body;
    }

}
