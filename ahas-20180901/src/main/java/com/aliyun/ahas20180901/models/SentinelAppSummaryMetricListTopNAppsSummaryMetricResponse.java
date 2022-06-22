// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppSummaryMetricListTopNAppsSummaryMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelAppSummaryMetricListTopNAppsSummaryMetricResponseBody body;

    public static SentinelAppSummaryMetricListTopNAppsSummaryMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppSummaryMetricListTopNAppsSummaryMetricResponse self = new SentinelAppSummaryMetricListTopNAppsSummaryMetricResponse();
        return TeaModel.build(map, self);
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricResponse setBody(SentinelAppSummaryMetricListTopNAppsSummaryMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelAppSummaryMetricListTopNAppsSummaryMetricResponseBody getBody() {
        return this.body;
    }

}
