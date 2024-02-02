// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CompanyThreeElementsVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CompanyThreeElementsVerificationResponseBody body;

    public static CompanyThreeElementsVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        CompanyThreeElementsVerificationResponse self = new CompanyThreeElementsVerificationResponse();
        return TeaModel.build(map, self);
    }

    public CompanyThreeElementsVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompanyThreeElementsVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompanyThreeElementsVerificationResponse setBody(CompanyThreeElementsVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public CompanyThreeElementsVerificationResponseBody getBody() {
        return this.body;
    }

}
