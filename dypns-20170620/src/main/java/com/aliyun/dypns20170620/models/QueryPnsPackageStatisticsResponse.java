// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryPnsPackageStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPnsPackageStatisticsResponseBody body;

    public static QueryPnsPackageStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPnsPackageStatisticsResponse self = new QueryPnsPackageStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryPnsPackageStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPnsPackageStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPnsPackageStatisticsResponse setBody(QueryPnsPackageStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPnsPackageStatisticsResponseBody getBody() {
        return this.body;
    }

}
