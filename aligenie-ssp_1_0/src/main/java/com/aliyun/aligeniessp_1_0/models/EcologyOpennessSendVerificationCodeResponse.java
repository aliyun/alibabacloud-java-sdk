// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class EcologyOpennessSendVerificationCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EcologyOpennessSendVerificationCodeResponseBody body;

    public static EcologyOpennessSendVerificationCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        EcologyOpennessSendVerificationCodeResponse self = new EcologyOpennessSendVerificationCodeResponse();
        return TeaModel.build(map, self);
    }

    public EcologyOpennessSendVerificationCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EcologyOpennessSendVerificationCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EcologyOpennessSendVerificationCodeResponse setBody(EcologyOpennessSendVerificationCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public EcologyOpennessSendVerificationCodeResponseBody getBody() {
        return this.body;
    }

}
