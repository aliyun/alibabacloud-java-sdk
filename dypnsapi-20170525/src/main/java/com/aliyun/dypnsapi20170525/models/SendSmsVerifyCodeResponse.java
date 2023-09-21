// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class SendSmsVerifyCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendSmsVerifyCodeResponseBody body;

    public static SendSmsVerifyCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        SendSmsVerifyCodeResponse self = new SendSmsVerifyCodeResponse();
        return TeaModel.build(map, self);
    }

    public SendSmsVerifyCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendSmsVerifyCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendSmsVerifyCodeResponse setBody(SendSmsVerifyCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public SendSmsVerifyCodeResponseBody getBody() {
        return this.body;
    }

}
