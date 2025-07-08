// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsPackageDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsPackageDetailResponseBody body;

    public static QuerySmsPackageDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsPackageDetailResponse self = new QuerySmsPackageDetailResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsPackageDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsPackageDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsPackageDetailResponse setBody(QuerySmsPackageDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsPackageDetailResponseBody getBody() {
        return this.body;
    }

}
