// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryPackageDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPackageDetailResponseBody body;

    public static QueryPackageDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPackageDetailResponse self = new QueryPackageDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryPackageDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPackageDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPackageDetailResponse setBody(QueryPackageDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPackageDetailResponseBody getBody() {
        return this.body;
    }

}
