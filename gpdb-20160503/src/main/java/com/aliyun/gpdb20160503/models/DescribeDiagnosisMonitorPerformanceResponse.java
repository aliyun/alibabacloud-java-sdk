// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisMonitorPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiagnosisMonitorPerformanceResponseBody body;

    public static DescribeDiagnosisMonitorPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisMonitorPerformanceResponse self = new DescribeDiagnosisMonitorPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisMonitorPerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiagnosisMonitorPerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiagnosisMonitorPerformanceResponse setBody(DescribeDiagnosisMonitorPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnosisMonitorPerformanceResponseBody getBody() {
        return this.body;
    }

}
