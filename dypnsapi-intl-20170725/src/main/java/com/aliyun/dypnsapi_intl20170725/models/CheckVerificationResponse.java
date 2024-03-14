// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi_intl20170725.models;

import com.aliyun.tea.*;

public class CheckVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckVerificationResponseBody body;

    public static CheckVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckVerificationResponse self = new CheckVerificationResponse();
        return TeaModel.build(map, self);
    }

    public CheckVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckVerificationResponse setBody(CheckVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckVerificationResponseBody getBody() {
        return this.body;
    }

}
