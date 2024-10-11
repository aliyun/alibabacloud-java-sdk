// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class QuerySingleAggregationReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySingleAggregationReportResponseBody body;

    public static QuerySingleAggregationReportResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySingleAggregationReportResponse self = new QuerySingleAggregationReportResponse();
        return TeaModel.build(map, self);
    }

    public QuerySingleAggregationReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySingleAggregationReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySingleAggregationReportResponse setBody(QuerySingleAggregationReportResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySingleAggregationReportResponseBody getBody() {
        return this.body;
    }

}
