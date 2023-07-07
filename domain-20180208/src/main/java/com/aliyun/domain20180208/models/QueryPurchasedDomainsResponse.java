// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryPurchasedDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPurchasedDomainsResponseBody body;

    public static QueryPurchasedDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPurchasedDomainsResponse self = new QueryPurchasedDomainsResponse();
        return TeaModel.build(map, self);
    }

    public QueryPurchasedDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPurchasedDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPurchasedDomainsResponse setBody(QueryPurchasedDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPurchasedDomainsResponseBody getBody() {
        return this.body;
    }

}
