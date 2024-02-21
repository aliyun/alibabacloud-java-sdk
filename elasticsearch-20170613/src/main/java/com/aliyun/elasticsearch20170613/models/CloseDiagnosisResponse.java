// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CloseDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseDiagnosisResponseBody body;

    public static CloseDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseDiagnosisResponse self = new CloseDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public CloseDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseDiagnosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseDiagnosisResponse setBody(CloseDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseDiagnosisResponseBody getBody() {
        return this.body;
    }

}
