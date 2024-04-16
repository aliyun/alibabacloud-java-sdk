// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GenerateAuthTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateAuthTokenResponseBody body;

    public static GenerateAuthTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAuthTokenResponse self = new GenerateAuthTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAuthTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAuthTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateAuthTokenResponse setBody(GenerateAuthTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAuthTokenResponseBody getBody() {
        return this.body;
    }

}
