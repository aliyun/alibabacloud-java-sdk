// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class QueryAccessorDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAccessorDomainResponseBody body;

    public static QueryAccessorDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccessorDomainResponse self = new QueryAccessorDomainResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccessorDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccessorDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccessorDomainResponse setBody(QueryAccessorDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccessorDomainResponseBody getBody() {
        return this.body;
    }

}
