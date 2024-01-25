// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveRegistrantProfileRealNameVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveRegistrantProfileRealNameVerificationResponseBody body;

    public static SaveRegistrantProfileRealNameVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveRegistrantProfileRealNameVerificationResponse self = new SaveRegistrantProfileRealNameVerificationResponse();
        return TeaModel.build(map, self);
    }

    public SaveRegistrantProfileRealNameVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveRegistrantProfileRealNameVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveRegistrantProfileRealNameVerificationResponse setBody(SaveRegistrantProfileRealNameVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveRegistrantProfileRealNameVerificationResponseBody getBody() {
        return this.body;
    }

}
