// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryPnsPackageDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPnsPackageDetailResponseBody body;

    public static QueryPnsPackageDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPnsPackageDetailResponse self = new QueryPnsPackageDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryPnsPackageDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPnsPackageDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPnsPackageDetailResponse setBody(QueryPnsPackageDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPnsPackageDetailResponseBody getBody() {
        return this.body;
    }

}
