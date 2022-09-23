// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryPurchasedResListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPurchasedResListResponseBody body;

    public static QueryPurchasedResListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPurchasedResListResponse self = new QueryPurchasedResListResponse();
        return TeaModel.build(map, self);
    }

    public QueryPurchasedResListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPurchasedResListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPurchasedResListResponse setBody(QueryPurchasedResListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPurchasedResListResponseBody getBody() {
        return this.body;
    }

}
