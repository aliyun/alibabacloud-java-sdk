// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class GenerateAcccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateAcccessTokenResponseBody body;

    public static GenerateAcccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAcccessTokenResponse self = new GenerateAcccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAcccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAcccessTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateAcccessTokenResponse setBody(GenerateAcccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAcccessTokenResponseBody getBody() {
        return this.body;
    }

}
