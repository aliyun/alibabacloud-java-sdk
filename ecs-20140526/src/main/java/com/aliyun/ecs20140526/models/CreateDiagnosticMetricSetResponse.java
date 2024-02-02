// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiagnosticMetricSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDiagnosticMetricSetResponseBody body;

    public static CreateDiagnosticMetricSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosticMetricSetResponse self = new CreateDiagnosticMetricSetResponse();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosticMetricSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDiagnosticMetricSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDiagnosticMetricSetResponse setBody(CreateDiagnosticMetricSetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDiagnosticMetricSetResponseBody getBody() {
        return this.body;
    }

}
