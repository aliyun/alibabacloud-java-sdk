// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryDomainListNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDomainListNewResponseBody body;

    public static QueryDomainListNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainListNewResponse self = new QueryDomainListNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryDomainListNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDomainListNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDomainListNewResponse setBody(QueryDomainListNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDomainListNewResponseBody getBody() {
        return this.body;
    }

}
