// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryCloseoutDomainListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCloseoutDomainListResponseBody body;

    public static QueryCloseoutDomainListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCloseoutDomainListResponse self = new QueryCloseoutDomainListResponse();
        return TeaModel.build(map, self);
    }

    public QueryCloseoutDomainListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCloseoutDomainListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCloseoutDomainListResponse setBody(QueryCloseoutDomainListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCloseoutDomainListResponseBody getBody() {
        return this.body;
    }

}
