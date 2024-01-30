// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class CancelDomainVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelDomainVerificationResponseBody body;

    public static CancelDomainVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelDomainVerificationResponse self = new CancelDomainVerificationResponse();
        return TeaModel.build(map, self);
    }

    public CancelDomainVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelDomainVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelDomainVerificationResponse setBody(CancelDomainVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelDomainVerificationResponseBody getBody() {
        return this.body;
    }

}
