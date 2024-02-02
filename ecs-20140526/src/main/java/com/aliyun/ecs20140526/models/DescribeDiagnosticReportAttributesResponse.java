// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiagnosticReportAttributesResponseBody body;

    public static DescribeDiagnosticReportAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticReportAttributesResponse self = new DescribeDiagnosticReportAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticReportAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiagnosticReportAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiagnosticReportAttributesResponse setBody(DescribeDiagnosticReportAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnosticReportAttributesResponseBody getBody() {
        return this.body;
    }

}
