// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelMetricListTopNResourcesMetricSimpleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelMetricListTopNResourcesMetricSimpleResponseBody body;

    public static SentinelMetricListTopNResourcesMetricSimpleResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelMetricListTopNResourcesMetricSimpleResponse self = new SentinelMetricListTopNResourcesMetricSimpleResponse();
        return TeaModel.build(map, self);
    }

    public SentinelMetricListTopNResourcesMetricSimpleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelMetricListTopNResourcesMetricSimpleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelMetricListTopNResourcesMetricSimpleResponse setBody(SentinelMetricListTopNResourcesMetricSimpleResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelMetricListTopNResourcesMetricSimpleResponseBody getBody() {
        return this.body;
    }

}
