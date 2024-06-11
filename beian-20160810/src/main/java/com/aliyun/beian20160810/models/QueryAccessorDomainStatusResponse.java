// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class QueryAccessorDomainStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAccessorDomainStatusResponseBody body;

    public static QueryAccessorDomainStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccessorDomainStatusResponse self = new QueryAccessorDomainStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccessorDomainStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccessorDomainStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccessorDomainStatusResponse setBody(QueryAccessorDomainStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccessorDomainStatusResponseBody getBody() {
        return this.body;
    }

}
