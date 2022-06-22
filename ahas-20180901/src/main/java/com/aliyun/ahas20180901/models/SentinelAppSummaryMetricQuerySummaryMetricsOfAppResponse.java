// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBody body;

    public static SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponse self = new SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponse();
        return TeaModel.build(map, self);
    }

    public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponse setBody(SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelAppSummaryMetricQuerySummaryMetricsOfAppResponseBody getBody() {
        return this.body;
    }

}
