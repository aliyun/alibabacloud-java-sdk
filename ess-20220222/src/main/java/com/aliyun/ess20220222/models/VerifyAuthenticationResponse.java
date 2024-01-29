// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class VerifyAuthenticationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyAuthenticationResponseBody body;

    public static VerifyAuthenticationResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAuthenticationResponse self = new VerifyAuthenticationResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAuthenticationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyAuthenticationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyAuthenticationResponse setBody(VerifyAuthenticationResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyAuthenticationResponseBody getBody() {
        return this.body;
    }

}
