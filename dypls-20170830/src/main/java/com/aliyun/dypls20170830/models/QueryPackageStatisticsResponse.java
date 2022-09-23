// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryPackageStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPackageStatisticsResponseBody body;

    public static QueryPackageStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPackageStatisticsResponse self = new QueryPackageStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryPackageStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPackageStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPackageStatisticsResponse setBody(QueryPackageStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPackageStatisticsResponseBody getBody() {
        return this.body;
    }

}
