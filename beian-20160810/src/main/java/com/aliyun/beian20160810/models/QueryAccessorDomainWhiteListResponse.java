// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class QueryAccessorDomainWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAccessorDomainWhiteListResponseBody body;

    public static QueryAccessorDomainWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccessorDomainWhiteListResponse self = new QueryAccessorDomainWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccessorDomainWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccessorDomainWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccessorDomainWhiteListResponse setBody(QueryAccessorDomainWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccessorDomainWhiteListResponseBody getBody() {
        return this.body;
    }

}
