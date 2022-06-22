// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelMetricListTopNResourceNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelMetricListTopNResourceNameResponseBody body;

    public static SentinelMetricListTopNResourceNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelMetricListTopNResourceNameResponse self = new SentinelMetricListTopNResourceNameResponse();
        return TeaModel.build(map, self);
    }

    public SentinelMetricListTopNResourceNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelMetricListTopNResourceNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelMetricListTopNResourceNameResponse setBody(SentinelMetricListTopNResourceNameResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelMetricListTopNResourceNameResponseBody getBody() {
        return this.body;
    }

}
