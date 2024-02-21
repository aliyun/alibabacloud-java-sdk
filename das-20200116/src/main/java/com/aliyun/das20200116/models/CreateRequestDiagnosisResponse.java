// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateRequestDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRequestDiagnosisResponseBody body;

    public static CreateRequestDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRequestDiagnosisResponse self = new CreateRequestDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public CreateRequestDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRequestDiagnosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRequestDiagnosisResponse setBody(CreateRequestDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRequestDiagnosisResponseBody getBody() {
        return this.body;
    }

}
