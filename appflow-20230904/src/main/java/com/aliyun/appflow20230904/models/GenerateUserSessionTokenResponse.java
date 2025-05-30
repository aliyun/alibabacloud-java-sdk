// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class GenerateUserSessionTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateUserSessionTokenResponseBody body;

    public static GenerateUserSessionTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateUserSessionTokenResponse self = new GenerateUserSessionTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateUserSessionTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateUserSessionTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateUserSessionTokenResponse setBody(GenerateUserSessionTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateUserSessionTokenResponseBody getBody() {
        return this.body;
    }

}
