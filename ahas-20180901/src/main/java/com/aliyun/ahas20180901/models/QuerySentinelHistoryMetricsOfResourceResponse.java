// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySentinelHistoryMetricsOfResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySentinelHistoryMetricsOfResourceResponseBody body;

    public static QuerySentinelHistoryMetricsOfResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySentinelHistoryMetricsOfResourceResponse self = new QuerySentinelHistoryMetricsOfResourceResponse();
        return TeaModel.build(map, self);
    }

    public QuerySentinelHistoryMetricsOfResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySentinelHistoryMetricsOfResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySentinelHistoryMetricsOfResourceResponse setBody(QuerySentinelHistoryMetricsOfResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySentinelHistoryMetricsOfResourceResponseBody getBody() {
        return this.body;
    }

}
