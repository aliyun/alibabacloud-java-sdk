// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDomainListResponseBody body;

    public static QueryDomainListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainListResponse self = new QueryDomainListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDomainListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDomainListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDomainListResponse setBody(QueryDomainListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDomainListResponseBody getBody() {
        return this.body;
    }

}
