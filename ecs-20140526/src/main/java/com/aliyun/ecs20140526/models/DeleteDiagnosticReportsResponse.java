// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDiagnosticReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDiagnosticReportsResponseBody body;

    public static DeleteDiagnosticReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiagnosticReportsResponse self = new DeleteDiagnosticReportsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDiagnosticReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDiagnosticReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDiagnosticReportsResponse setBody(DeleteDiagnosticReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDiagnosticReportsResponseBody getBody() {
        return this.body;
    }

}
