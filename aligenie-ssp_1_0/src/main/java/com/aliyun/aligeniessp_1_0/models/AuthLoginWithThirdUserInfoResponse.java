// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AuthLoginWithThirdUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AuthLoginWithThirdUserInfoResponseBody body;

    public static AuthLoginWithThirdUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthLoginWithThirdUserInfoResponse self = new AuthLoginWithThirdUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public AuthLoginWithThirdUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthLoginWithThirdUserInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthLoginWithThirdUserInfoResponse setBody(AuthLoginWithThirdUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthLoginWithThirdUserInfoResponseBody getBody() {
        return this.body;
    }

}
