// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDiagnosticReportsResponseBody body;

    public static DescribeDiagnosticReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticReportsResponse self = new DescribeDiagnosticReportsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiagnosticReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiagnosticReportsResponse setBody(DescribeDiagnosticReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnosticReportsResponseBody getBody() {
        return this.body;
    }

}
