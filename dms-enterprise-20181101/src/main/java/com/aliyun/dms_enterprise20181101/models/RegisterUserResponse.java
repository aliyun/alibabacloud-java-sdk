// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RegisterUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterUserResponseBody body;

    public static RegisterUserResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterUserResponse self = new RegisterUserResponse();
        return TeaModel.build(map, self);
    }

    public RegisterUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterUserResponse setBody(RegisterUserResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterUserResponseBody getBody() {
        return this.body;
    }

}
