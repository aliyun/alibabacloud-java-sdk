// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryHistoryMetricDistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryHistoryMetricDistributionResponseBody body;

    public static QueryHistoryMetricDistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoryMetricDistributionResponse self = new QueryHistoryMetricDistributionResponse();
        return TeaModel.build(map, self);
    }

    public QueryHistoryMetricDistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHistoryMetricDistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHistoryMetricDistributionResponse setBody(QueryHistoryMetricDistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHistoryMetricDistributionResponseBody getBody() {
        return this.body;
    }

}
