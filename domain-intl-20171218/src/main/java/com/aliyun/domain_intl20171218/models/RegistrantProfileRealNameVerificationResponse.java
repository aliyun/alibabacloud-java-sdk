// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class RegistrantProfileRealNameVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegistrantProfileRealNameVerificationResponseBody body;

    public static RegistrantProfileRealNameVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        RegistrantProfileRealNameVerificationResponse self = new RegistrantProfileRealNameVerificationResponse();
        return TeaModel.build(map, self);
    }

    public RegistrantProfileRealNameVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegistrantProfileRealNameVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegistrantProfileRealNameVerificationResponse setBody(RegistrantProfileRealNameVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public RegistrantProfileRealNameVerificationResponseBody getBody() {
        return this.body;
    }

}
