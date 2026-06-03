// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryPnsPackageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPnsPackageListResponseBody body;

    public static QueryPnsPackageListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPnsPackageListResponse self = new QueryPnsPackageListResponse();
        return TeaModel.build(map, self);
    }

    public QueryPnsPackageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPnsPackageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPnsPackageListResponse setBody(QueryPnsPackageListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPnsPackageListResponseBody getBody() {
        return this.body;
    }

}
