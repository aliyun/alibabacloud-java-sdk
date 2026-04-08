// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePADiagnosisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePADiagnosisTaskResponseBody body;

    public static CreatePADiagnosisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePADiagnosisTaskResponse self = new CreatePADiagnosisTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreatePADiagnosisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePADiagnosisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePADiagnosisTaskResponse setBody(CreatePADiagnosisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePADiagnosisTaskResponseBody getBody() {
        return this.body;
    }

}
