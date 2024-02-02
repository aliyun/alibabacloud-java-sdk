// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiagnosticMetricsResponseBody body;

    public static DescribeDiagnosticMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticMetricsResponse self = new DescribeDiagnosticMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiagnosticMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiagnosticMetricsResponse setBody(DescribeDiagnosticMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnosticMetricsResponseBody getBody() {
        return this.body;
    }

}
