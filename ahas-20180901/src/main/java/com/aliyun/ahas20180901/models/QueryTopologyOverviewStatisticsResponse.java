// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyOverviewStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopologyOverviewStatisticsResponseBody body;

    public static QueryTopologyOverviewStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyOverviewStatisticsResponse self = new QueryTopologyOverviewStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopologyOverviewStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopologyOverviewStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopologyOverviewStatisticsResponse setBody(QueryTopologyOverviewStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopologyOverviewStatisticsResponseBody getBody() {
        return this.body;
    }

}
