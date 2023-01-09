// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntElementVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EntElementVerifyResponseBody body;

    public static EntElementVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        EntElementVerifyResponse self = new EntElementVerifyResponse();
        return TeaModel.build(map, self);
    }

    public EntElementVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EntElementVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EntElementVerifyResponse setBody(EntElementVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public EntElementVerifyResponseBody getBody() {
        return this.body;
    }

}
