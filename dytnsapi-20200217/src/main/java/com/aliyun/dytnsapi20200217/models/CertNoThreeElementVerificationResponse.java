// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CertNoThreeElementVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CertNoThreeElementVerificationResponseBody body;

    public static CertNoThreeElementVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        CertNoThreeElementVerificationResponse self = new CertNoThreeElementVerificationResponse();
        return TeaModel.build(map, self);
    }

    public CertNoThreeElementVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CertNoThreeElementVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CertNoThreeElementVerificationResponse setBody(CertNoThreeElementVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public CertNoThreeElementVerificationResponseBody getBody() {
        return this.body;
    }

}
