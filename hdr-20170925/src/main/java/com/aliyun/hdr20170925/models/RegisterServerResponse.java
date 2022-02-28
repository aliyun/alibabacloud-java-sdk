// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class RegisterServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterServerResponseBody body;

    public static RegisterServerResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterServerResponse self = new RegisterServerResponse();
        return TeaModel.build(map, self);
    }

    public RegisterServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterServerResponse setBody(RegisterServerResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterServerResponseBody getBody() {
        return this.body;
    }

}
