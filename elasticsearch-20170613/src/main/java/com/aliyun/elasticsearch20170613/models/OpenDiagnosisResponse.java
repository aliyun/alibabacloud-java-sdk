// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class OpenDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenDiagnosisResponseBody body;

    public static OpenDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenDiagnosisResponse self = new OpenDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public OpenDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenDiagnosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenDiagnosisResponse setBody(OpenDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenDiagnosisResponseBody getBody() {
        return this.body;
    }

}
