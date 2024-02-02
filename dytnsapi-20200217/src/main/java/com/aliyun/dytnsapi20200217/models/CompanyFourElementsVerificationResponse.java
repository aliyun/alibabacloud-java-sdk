// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CompanyFourElementsVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CompanyFourElementsVerificationResponseBody body;

    public static CompanyFourElementsVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        CompanyFourElementsVerificationResponse self = new CompanyFourElementsVerificationResponse();
        return TeaModel.build(map, self);
    }

    public CompanyFourElementsVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompanyFourElementsVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompanyFourElementsVerificationResponse setBody(CompanyFourElementsVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public CompanyFourElementsVerificationResponseBody getBody() {
        return this.body;
    }

}
