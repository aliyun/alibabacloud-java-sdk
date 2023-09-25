// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CompanyTwoElementsVerificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CompanyTwoElementsVerificationResponseBody body;

    public static CompanyTwoElementsVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        CompanyTwoElementsVerificationResponse self = new CompanyTwoElementsVerificationResponse();
        return TeaModel.build(map, self);
    }

    public CompanyTwoElementsVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompanyTwoElementsVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompanyTwoElementsVerificationResponse setBody(CompanyTwoElementsVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public CompanyTwoElementsVerificationResponseBody getBody() {
        return this.body;
    }

}
