// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.captcha20230305.models;

import com.aliyun.tea.*;

public class VerifyIntelligentCaptchaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyIntelligentCaptchaResponseBody body;

    public static VerifyIntelligentCaptchaResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyIntelligentCaptchaResponse self = new VerifyIntelligentCaptchaResponse();
        return TeaModel.build(map, self);
    }

    public VerifyIntelligentCaptchaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyIntelligentCaptchaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyIntelligentCaptchaResponse setBody(VerifyIntelligentCaptchaResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyIntelligentCaptchaResponseBody getBody() {
        return this.body;
    }

}
