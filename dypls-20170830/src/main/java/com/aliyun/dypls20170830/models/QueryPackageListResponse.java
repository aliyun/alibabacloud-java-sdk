// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryPackageListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPackageListResponseBody body;

    public static QueryPackageListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPackageListResponse self = new QueryPackageListResponse();
        return TeaModel.build(map, self);
    }

    public QueryPackageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPackageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPackageListResponse setBody(QueryPackageListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPackageListResponseBody getBody() {
        return this.body;
    }

}
