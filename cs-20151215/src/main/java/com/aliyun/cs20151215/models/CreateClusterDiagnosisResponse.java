// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateClusterDiagnosisResponseBody body;

    public static CreateClusterDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterDiagnosisResponse self = new CreateClusterDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public CreateClusterDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClusterDiagnosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateClusterDiagnosisResponse setBody(CreateClusterDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClusterDiagnosisResponseBody getBody() {
        return this.body;
    }

}
