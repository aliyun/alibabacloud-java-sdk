// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiagnosticReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDiagnosticReportResponseBody body;

    public static CreateDiagnosticReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosticReportResponse self = new CreateDiagnosticReportResponse();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosticReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDiagnosticReportResponse setBody(CreateDiagnosticReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDiagnosticReportResponseBody getBody() {
        return this.body;
    }

}
