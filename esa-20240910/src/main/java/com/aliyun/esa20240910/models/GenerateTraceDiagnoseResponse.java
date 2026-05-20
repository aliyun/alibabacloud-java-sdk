// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GenerateTraceDiagnoseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateTraceDiagnoseResponseBody body;

    public static GenerateTraceDiagnoseResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateTraceDiagnoseResponse self = new GenerateTraceDiagnoseResponse();
        return TeaModel.build(map, self);
    }

    public GenerateTraceDiagnoseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateTraceDiagnoseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateTraceDiagnoseResponse setBody(GenerateTraceDiagnoseResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateTraceDiagnoseResponseBody getBody() {
        return this.body;
    }

}
