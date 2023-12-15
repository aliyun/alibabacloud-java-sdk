// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20181219.models;

import com.aliyun.tea.*;

public class MetricQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MetricQueryResponseBody body;

    public static MetricQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        MetricQueryResponse self = new MetricQueryResponse();
        return TeaModel.build(map, self);
    }

    public MetricQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MetricQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MetricQueryResponse setBody(MetricQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public MetricQueryResponseBody getBody() {
        return this.body;
    }

}
