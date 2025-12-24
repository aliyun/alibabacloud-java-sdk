// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class QueryHistoricalMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryHistoricalMetricResponseBody body;

    public static QueryHistoricalMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoricalMetricResponse self = new QueryHistoricalMetricResponse();
        return TeaModel.build(map, self);
    }

    public QueryHistoricalMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHistoricalMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHistoricalMetricResponse setBody(QueryHistoricalMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHistoricalMetricResponseBody getBody() {
        return this.body;
    }

}
