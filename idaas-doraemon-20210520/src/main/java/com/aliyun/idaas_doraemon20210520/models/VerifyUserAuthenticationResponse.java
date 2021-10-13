// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class VerifyUserAuthenticationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyUserAuthenticationResponseBody body;

    public static VerifyUserAuthenticationResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyUserAuthenticationResponse self = new VerifyUserAuthenticationResponse();
        return TeaModel.build(map, self);
    }

    public VerifyUserAuthenticationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyUserAuthenticationResponse setBody(VerifyUserAuthenticationResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyUserAuthenticationResponseBody getBody() {
        return this.body;
    }

}
