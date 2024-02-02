// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDiagnosticMetricSetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDiagnosticMetricSetsResponseBody body;

    public static DeleteDiagnosticMetricSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiagnosticMetricSetsResponse self = new DeleteDiagnosticMetricSetsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDiagnosticMetricSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDiagnosticMetricSetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDiagnosticMetricSetsResponse setBody(DeleteDiagnosticMetricSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDiagnosticMetricSetsResponseBody getBody() {
        return this.body;
    }

}
