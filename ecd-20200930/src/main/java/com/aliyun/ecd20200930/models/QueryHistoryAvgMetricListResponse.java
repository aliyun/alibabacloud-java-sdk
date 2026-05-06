// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryHistoryAvgMetricListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryHistoryAvgMetricListResponseBody body;

    public static QueryHistoryAvgMetricListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoryAvgMetricListResponse self = new QueryHistoryAvgMetricListResponse();
        return TeaModel.build(map, self);
    }

    public QueryHistoryAvgMetricListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHistoryAvgMetricListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHistoryAvgMetricListResponse setBody(QueryHistoryAvgMetricListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHistoryAvgMetricListResponseBody getBody() {
        return this.body;
    }

}
