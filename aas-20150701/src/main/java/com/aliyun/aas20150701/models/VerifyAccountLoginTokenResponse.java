// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class VerifyAccountLoginTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyAccountLoginTokenResponseBody body;

    public static VerifyAccountLoginTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAccountLoginTokenResponse self = new VerifyAccountLoginTokenResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAccountLoginTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyAccountLoginTokenResponse setBody(VerifyAccountLoginTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyAccountLoginTokenResponseBody getBody() {
        return this.body;
    }

}
