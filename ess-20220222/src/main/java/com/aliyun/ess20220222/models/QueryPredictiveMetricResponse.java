// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class QueryPredictiveMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPredictiveMetricResponseBody body;

    public static QueryPredictiveMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPredictiveMetricResponse self = new QueryPredictiveMetricResponse();
        return TeaModel.build(map, self);
    }

    public QueryPredictiveMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPredictiveMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPredictiveMetricResponse setBody(QueryPredictiveMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPredictiveMetricResponseBody getBody() {
        return this.body;
    }

}
