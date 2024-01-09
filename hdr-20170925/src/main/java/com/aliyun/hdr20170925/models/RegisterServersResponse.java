// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class RegisterServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterServersResponseBody body;

    public static RegisterServersResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterServersResponse self = new RegisterServersResponse();
        return TeaModel.build(map, self);
    }

    public RegisterServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterServersResponse setBody(RegisterServersResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterServersResponseBody getBody() {
        return this.body;
    }

}
