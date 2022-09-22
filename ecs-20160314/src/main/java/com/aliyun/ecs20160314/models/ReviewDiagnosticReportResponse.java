// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ReviewDiagnosticReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReviewDiagnosticReportResponseBody body;

    public static ReviewDiagnosticReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ReviewDiagnosticReportResponse self = new ReviewDiagnosticReportResponse();
        return TeaModel.build(map, self);
    }

    public ReviewDiagnosticReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReviewDiagnosticReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReviewDiagnosticReportResponse setBody(ReviewDiagnosticReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ReviewDiagnosticReportResponseBody getBody() {
        return this.body;
    }

}
