// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class GenerateCdnDiagnoseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateCdnDiagnoseResponseBody body;

    public static GenerateCdnDiagnoseResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateCdnDiagnoseResponse self = new GenerateCdnDiagnoseResponse();
        return TeaModel.build(map, self);
    }

    public GenerateCdnDiagnoseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateCdnDiagnoseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateCdnDiagnoseResponse setBody(GenerateCdnDiagnoseResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateCdnDiagnoseResponseBody getBody() {
        return this.body;
    }

}
