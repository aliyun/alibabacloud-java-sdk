// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class SendAsyncMobileCaptchaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendAsyncMobileCaptchaResponseBody body;

    public static SendAsyncMobileCaptchaResponse build(java.util.Map<String, ?> map) throws Exception {
        SendAsyncMobileCaptchaResponse self = new SendAsyncMobileCaptchaResponse();
        return TeaModel.build(map, self);
    }

    public SendAsyncMobileCaptchaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendAsyncMobileCaptchaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendAsyncMobileCaptchaResponse setBody(SendAsyncMobileCaptchaResponseBody body) {
        this.body = body;
        return this;
    }
    public SendAsyncMobileCaptchaResponseBody getBody() {
        return this.body;
    }

}
