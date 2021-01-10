// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class RegisterMediaDetailPersonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterMediaDetailPersonResponseBody body;

    public static RegisterMediaDetailPersonResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaDetailPersonResponse self = new RegisterMediaDetailPersonResponse();
        return TeaModel.build(map, self);
    }

    public RegisterMediaDetailPersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterMediaDetailPersonResponse setBody(RegisterMediaDetailPersonResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterMediaDetailPersonResponseBody getBody() {
        return this.body;
    }

}
