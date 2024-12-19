// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RegisterUserAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterUserAccountResponseBody body;

    public static RegisterUserAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterUserAccountResponse self = new RegisterUserAccountResponse();
        return TeaModel.build(map, self);
    }

    public RegisterUserAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterUserAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterUserAccountResponse setBody(RegisterUserAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterUserAccountResponseBody getBody() {
        return this.body;
    }

}
