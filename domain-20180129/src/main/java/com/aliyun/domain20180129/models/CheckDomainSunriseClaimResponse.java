// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckDomainSunriseClaimResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckDomainSunriseClaimResponseBody body;

    public static CheckDomainSunriseClaimResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainSunriseClaimResponse self = new CheckDomainSunriseClaimResponse();
        return TeaModel.build(map, self);
    }

    public CheckDomainSunriseClaimResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDomainSunriseClaimResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDomainSunriseClaimResponse setBody(CheckDomainSunriseClaimResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDomainSunriseClaimResponseBody getBody() {
        return this.body;
    }

}
