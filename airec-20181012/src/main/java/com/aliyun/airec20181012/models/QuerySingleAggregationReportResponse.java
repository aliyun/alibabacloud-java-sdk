// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class QuerySingleAggregationReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QuerySingleAggregationReportResponse setBody(QuerySingleAggregationReportResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySingleAggregationReportResponseBody getBody() {
        return this.body;
    }

}
