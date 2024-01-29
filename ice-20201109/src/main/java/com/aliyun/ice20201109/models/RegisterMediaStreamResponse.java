// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class RegisterMediaStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterMediaStreamResponseBody body;

    public static RegisterMediaStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaStreamResponse self = new RegisterMediaStreamResponse();
        return TeaModel.build(map, self);
    }

    public RegisterMediaStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterMediaStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterMediaStreamResponse setBody(RegisterMediaStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterMediaStreamResponseBody getBody() {
        return this.body;
    }

}
