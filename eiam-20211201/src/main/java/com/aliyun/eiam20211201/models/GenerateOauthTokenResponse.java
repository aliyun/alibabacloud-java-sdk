// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GenerateOauthTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateOauthTokenResponseBody body;

    public static GenerateOauthTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateOauthTokenResponse self = new GenerateOauthTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateOauthTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateOauthTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateOauthTokenResponse setBody(GenerateOauthTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateOauthTokenResponseBody getBody() {
        return this.body;
    }

}
