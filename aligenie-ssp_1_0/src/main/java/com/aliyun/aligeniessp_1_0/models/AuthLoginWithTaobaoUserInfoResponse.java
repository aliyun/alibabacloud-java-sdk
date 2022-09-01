// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AuthLoginWithTaobaoUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AuthLoginWithTaobaoUserInfoResponseBody body;

    public static AuthLoginWithTaobaoUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthLoginWithTaobaoUserInfoResponse self = new AuthLoginWithTaobaoUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public AuthLoginWithTaobaoUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthLoginWithTaobaoUserInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthLoginWithTaobaoUserInfoResponse setBody(AuthLoginWithTaobaoUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthLoginWithTaobaoUserInfoResponseBody getBody() {
        return this.body;
    }

}
