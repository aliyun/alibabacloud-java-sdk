// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ValidateAuthenticationTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateAuthenticationTokenResponseBody body;

    public static ValidateAuthenticationTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateAuthenticationTokenResponse self = new ValidateAuthenticationTokenResponse();
        return TeaModel.build(map, self);
    }

    public ValidateAuthenticationTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateAuthenticationTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateAuthenticationTokenResponse setBody(ValidateAuthenticationTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateAuthenticationTokenResponseBody getBody() {
        return this.body;
    }

}
