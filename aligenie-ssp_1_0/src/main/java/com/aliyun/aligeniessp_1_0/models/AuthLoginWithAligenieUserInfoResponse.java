// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AuthLoginWithAligenieUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AuthLoginWithAligenieUserInfoResponseBody body;

    public static AuthLoginWithAligenieUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthLoginWithAligenieUserInfoResponse self = new AuthLoginWithAligenieUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public AuthLoginWithAligenieUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthLoginWithAligenieUserInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthLoginWithAligenieUserInfoResponse setBody(AuthLoginWithAligenieUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthLoginWithAligenieUserInfoResponseBody getBody() {
        return this.body;
    }

}
