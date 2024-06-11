// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class QueryAccessorDomainListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAccessorDomainListResponseBody body;

    public static QueryAccessorDomainListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccessorDomainListResponse self = new QueryAccessorDomainListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccessorDomainListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccessorDomainListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccessorDomainListResponse setBody(QueryAccessorDomainListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccessorDomainListResponseBody getBody() {
        return this.body;
    }

}
