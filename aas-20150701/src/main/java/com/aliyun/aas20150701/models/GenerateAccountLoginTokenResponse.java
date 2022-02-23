// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class GenerateAccountLoginTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateAccountLoginTokenResponseBody body;

    public static GenerateAccountLoginTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAccountLoginTokenResponse self = new GenerateAccountLoginTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAccountLoginTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAccountLoginTokenResponse setBody(GenerateAccountLoginTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAccountLoginTokenResponseBody getBody() {
        return this.body;
    }

}
