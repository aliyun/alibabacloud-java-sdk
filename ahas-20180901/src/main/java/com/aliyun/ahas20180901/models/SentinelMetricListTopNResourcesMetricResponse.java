// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelMetricListTopNResourcesMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelMetricListTopNResourcesMetricResponseBody body;

    public static SentinelMetricListTopNResourcesMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelMetricListTopNResourcesMetricResponse self = new SentinelMetricListTopNResourcesMetricResponse();
        return TeaModel.build(map, self);
    }

    public SentinelMetricListTopNResourcesMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelMetricListTopNResourcesMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelMetricListTopNResourcesMetricResponse setBody(SentinelMetricListTopNResourcesMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelMetricListTopNResourcesMetricResponseBody getBody() {
        return this.body;
    }

}
