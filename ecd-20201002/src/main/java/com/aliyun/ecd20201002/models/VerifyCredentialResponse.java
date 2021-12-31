// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class VerifyCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyCredentialResponseBody body;

    public static VerifyCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyCredentialResponse self = new VerifyCredentialResponse();
        return TeaModel.build(map, self);
    }

    public VerifyCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyCredentialResponse setBody(VerifyCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyCredentialResponseBody getBody() {
        return this.body;
    }

}
