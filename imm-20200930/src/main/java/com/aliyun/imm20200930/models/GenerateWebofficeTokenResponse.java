// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateWebofficeTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateWebofficeTokenResponseBody body;

    public static GenerateWebofficeTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateWebofficeTokenResponse self = new GenerateWebofficeTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateWebofficeTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateWebofficeTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateWebofficeTokenResponse setBody(GenerateWebofficeTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateWebofficeTokenResponseBody getBody() {
        return this.body;
    }

}
