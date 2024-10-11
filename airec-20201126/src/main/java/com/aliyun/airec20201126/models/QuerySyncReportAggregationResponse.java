// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class QuerySyncReportAggregationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySyncReportAggregationResponseBody body;

    public static QuerySyncReportAggregationResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySyncReportAggregationResponse self = new QuerySyncReportAggregationResponse();
        return TeaModel.build(map, self);
    }

    public QuerySyncReportAggregationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySyncReportAggregationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySyncReportAggregationResponse setBody(QuerySyncReportAggregationResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySyncReportAggregationResponseBody getBody() {
        return this.body;
    }

}
