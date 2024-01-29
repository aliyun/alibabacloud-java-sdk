// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class RegisterMediaInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RegisterMediaInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterMediaInfoResponse setBody(RegisterMediaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterMediaInfoResponseBody getBody() {
        return this.body;
    }

}
