// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitCardVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitCardVerifyResponseBody body;

    public static InitCardVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        InitCardVerifyResponse self = new InitCardVerifyResponse();
        return TeaModel.build(map, self);
    }

    public InitCardVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitCardVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitCardVerifyResponse setBody(InitCardVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public InitCardVerifyResponseBody getBody() {
        return this.body;
    }

}
