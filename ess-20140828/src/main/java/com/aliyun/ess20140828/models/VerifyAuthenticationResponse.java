// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class VerifyAuthenticationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public VerifyAuthenticationResponse setBody(VerifyAuthenticationResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyAuthenticationResponseBody getBody() {
        return this.body;
    }

}
