// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiagnosticReportListResponseBody body;

    public static DescribeDiagnosticReportListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticReportListResponse self = new DescribeDiagnosticReportListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticReportListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiagnosticReportListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiagnosticReportListResponse setBody(DescribeDiagnosticReportListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnosticReportListResponseBody getBody() {
        return this.body;
    }

}
