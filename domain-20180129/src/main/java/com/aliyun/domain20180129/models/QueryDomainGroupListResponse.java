// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainGroupListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDomainGroupListResponseBody body;

    public static QueryDomainGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainGroupListResponse self = new QueryDomainGroupListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDomainGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDomainGroupListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDomainGroupListResponse setBody(QueryDomainGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDomainGroupListResponseBody getBody() {
        return this.body;
    }

}
