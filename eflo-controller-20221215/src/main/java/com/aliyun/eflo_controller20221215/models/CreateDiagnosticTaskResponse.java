// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateDiagnosticTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDiagnosticTaskResponseBody body;

    public static CreateDiagnosticTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosticTaskResponse self = new CreateDiagnosticTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosticTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDiagnosticTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDiagnosticTaskResponse setBody(CreateDiagnosticTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDiagnosticTaskResponseBody getBody() {
        return this.body;
    }

}
