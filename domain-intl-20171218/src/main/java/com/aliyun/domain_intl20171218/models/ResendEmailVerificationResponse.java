// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class ResendEmailVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResendEmailVerificationResponseBody body;

    public static ResendEmailVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        ResendEmailVerificationResponse self = new ResendEmailVerificationResponse();
        return TeaModel.build(map, self);
    }

    public ResendEmailVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResendEmailVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResendEmailVerificationResponse setBody(ResendEmailVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public ResendEmailVerificationResponseBody getBody() {
        return this.body;
    }

}
