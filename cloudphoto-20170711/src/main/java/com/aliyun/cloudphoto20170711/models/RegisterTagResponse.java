// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class RegisterTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterTagResponseBody body;

    public static RegisterTagResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterTagResponse self = new RegisterTagResponse();
        return TeaModel.build(map, self);
    }

    public RegisterTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterTagResponse setBody(RegisterTagResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterTagResponseBody getBody() {
        return this.body;
    }

}
