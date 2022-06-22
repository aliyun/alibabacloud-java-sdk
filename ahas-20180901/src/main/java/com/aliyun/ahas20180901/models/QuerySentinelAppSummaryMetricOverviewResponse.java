// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySentinelAppSummaryMetricOverviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySentinelAppSummaryMetricOverviewResponseBody body;

    public static QuerySentinelAppSummaryMetricOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySentinelAppSummaryMetricOverviewResponse self = new QuerySentinelAppSummaryMetricOverviewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySentinelAppSummaryMetricOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySentinelAppSummaryMetricOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySentinelAppSummaryMetricOverviewResponse setBody(QuerySentinelAppSummaryMetricOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySentinelAppSummaryMetricOverviewResponseBody getBody() {
        return this.body;
    }

}
