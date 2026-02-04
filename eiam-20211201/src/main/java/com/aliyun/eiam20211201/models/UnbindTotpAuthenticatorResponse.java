// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UnbindTotpAuthenticatorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindTotpAuthenticatorResponseBody body;

    public static UnbindTotpAuthenticatorResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindTotpAuthenticatorResponse self = new UnbindTotpAuthenticatorResponse();
        return TeaModel.build(map, self);
    }

    public UnbindTotpAuthenticatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindTotpAuthenticatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindTotpAuthenticatorResponse setBody(UnbindTotpAuthenticatorResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindTotpAuthenticatorResponseBody getBody() {
        return this.body;
    }

}
