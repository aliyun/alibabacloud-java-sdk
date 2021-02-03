// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class RegisterMediaInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterMediaInfoResponseBody body;

    public static RegisterMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaInfoResponse self = new RegisterMediaInfoResponse();
        return TeaModel.build(map, self);
    }

    public RegisterMediaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterMediaInfoResponse setBody(RegisterMediaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterMediaInfoResponseBody getBody() {
        return this.body;
    }

}
