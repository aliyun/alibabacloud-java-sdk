// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RegisterUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RegisterUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterUserResponse setBody(RegisterUserResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterUserResponseBody getBody() {
        return this.body;
    }

}
