// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GenerateAuthCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateAuthCodeResponseBody body;

    public static GenerateAuthCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAuthCodeResponse self = new GenerateAuthCodeResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAuthCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAuthCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateAuthCodeResponse setBody(GenerateAuthCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAuthCodeResponseBody getBody() {
        return this.body;
    }

}
