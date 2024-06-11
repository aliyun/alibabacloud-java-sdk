// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class QueryAccessorDomainsStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAccessorDomainsStatusResponseBody body;

    public static QueryAccessorDomainsStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccessorDomainsStatusResponse self = new QueryAccessorDomainsStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccessorDomainsStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccessorDomainsStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccessorDomainsStatusResponse setBody(QueryAccessorDomainsStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccessorDomainsStatusResponseBody getBody() {
        return this.body;
    }

}
