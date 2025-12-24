// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteWebAuthnAuthenticatorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWebAuthnAuthenticatorResponseBody body;

    public static DeleteWebAuthnAuthenticatorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebAuthnAuthenticatorResponse self = new DeleteWebAuthnAuthenticatorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWebAuthnAuthenticatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWebAuthnAuthenticatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWebAuthnAuthenticatorResponse setBody(DeleteWebAuthnAuthenticatorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWebAuthnAuthenticatorResponseBody getBody() {
        return this.body;
    }

}
