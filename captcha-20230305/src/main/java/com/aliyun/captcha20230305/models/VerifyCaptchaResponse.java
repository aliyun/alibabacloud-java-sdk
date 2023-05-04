// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.captcha20230305.models;

import com.aliyun.tea.*;

public class VerifyCaptchaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyCaptchaResponseBody body;

    public static VerifyCaptchaResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyCaptchaResponse self = new VerifyCaptchaResponse();
        return TeaModel.build(map, self);
    }

    public VerifyCaptchaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyCaptchaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyCaptchaResponse setBody(VerifyCaptchaResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyCaptchaResponseBody getBody() {
        return this.body;
    }

}
