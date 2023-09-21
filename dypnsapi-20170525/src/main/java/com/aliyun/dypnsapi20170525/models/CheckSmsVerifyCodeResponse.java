// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class CheckSmsVerifyCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckSmsVerifyCodeResponseBody body;

    public static CheckSmsVerifyCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSmsVerifyCodeResponse self = new CheckSmsVerifyCodeResponse();
        return TeaModel.build(map, self);
    }

    public CheckSmsVerifyCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSmsVerifyCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckSmsVerifyCodeResponse setBody(CheckSmsVerifyCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSmsVerifyCodeResponseBody getBody() {
        return this.body;
    }

}
