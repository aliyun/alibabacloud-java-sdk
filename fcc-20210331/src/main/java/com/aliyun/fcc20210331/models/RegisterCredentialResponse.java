// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class RegisterCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterCredentialResponseBody body;

    public static RegisterCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterCredentialResponse self = new RegisterCredentialResponse();
        return TeaModel.build(map, self);
    }

    public RegisterCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterCredentialResponse setBody(RegisterCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterCredentialResponseBody getBody() {
        return this.body;
    }

}
