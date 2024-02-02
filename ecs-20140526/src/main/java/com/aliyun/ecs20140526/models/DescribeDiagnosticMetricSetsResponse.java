// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticMetricSetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiagnosticMetricSetsResponseBody body;

    public static DescribeDiagnosticMetricSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticMetricSetsResponse self = new DescribeDiagnosticMetricSetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticMetricSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiagnosticMetricSetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiagnosticMetricSetsResponse setBody(DescribeDiagnosticMetricSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnosticMetricSetsResponseBody getBody() {
        return this.body;
    }

}
