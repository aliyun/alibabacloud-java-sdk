// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryAdvancedDomainListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAdvancedDomainListResponseBody body;

    public static QueryAdvancedDomainListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAdvancedDomainListResponse self = new QueryAdvancedDomainListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAdvancedDomainListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAdvancedDomainListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAdvancedDomainListResponse setBody(QueryAdvancedDomainListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAdvancedDomainListResponseBody getBody() {
        return this.body;
    }

}
