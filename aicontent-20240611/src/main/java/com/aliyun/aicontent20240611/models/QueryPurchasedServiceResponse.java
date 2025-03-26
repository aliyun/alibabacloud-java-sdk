// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class QueryPurchasedServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPurchasedServiceResponseBody body;

    public static QueryPurchasedServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPurchasedServiceResponse self = new QueryPurchasedServiceResponse();
        return TeaModel.build(map, self);
    }

    public QueryPurchasedServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPurchasedServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPurchasedServiceResponse setBody(QueryPurchasedServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPurchasedServiceResponseBody getBody() {
        return this.body;
    }

}
