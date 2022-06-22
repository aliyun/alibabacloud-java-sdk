// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelListTopNAppsSummaryMetricOfAppTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelListTopNAppsSummaryMetricOfAppTypeResponseBody body;

    public static SentinelListTopNAppsSummaryMetricOfAppTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelListTopNAppsSummaryMetricOfAppTypeResponse self = new SentinelListTopNAppsSummaryMetricOfAppTypeResponse();
        return TeaModel.build(map, self);
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeResponse setBody(SentinelListTopNAppsSummaryMetricOfAppTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelListTopNAppsSummaryMetricOfAppTypeResponseBody getBody() {
        return this.body;
    }

}
