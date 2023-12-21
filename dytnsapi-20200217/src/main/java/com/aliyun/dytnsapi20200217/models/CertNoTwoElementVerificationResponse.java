// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CertNoTwoElementVerificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CertNoTwoElementVerificationResponseBody body;

    public static CertNoTwoElementVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        CertNoTwoElementVerificationResponse self = new CertNoTwoElementVerificationResponse();
        return TeaModel.build(map, self);
    }

    public CertNoTwoElementVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CertNoTwoElementVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CertNoTwoElementVerificationResponse setBody(CertNoTwoElementVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public CertNoTwoElementVerificationResponseBody getBody() {
        return this.body;
    }

}
