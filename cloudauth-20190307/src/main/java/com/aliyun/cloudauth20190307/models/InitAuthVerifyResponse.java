// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitAuthVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitAuthVerifyResponseBody body;

    public static InitAuthVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        InitAuthVerifyResponse self = new InitAuthVerifyResponse();
        return TeaModel.build(map, self);
    }

    public InitAuthVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitAuthVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitAuthVerifyResponse setBody(InitAuthVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public InitAuthVerifyResponseBody getBody() {
        return this.body;
    }

}
