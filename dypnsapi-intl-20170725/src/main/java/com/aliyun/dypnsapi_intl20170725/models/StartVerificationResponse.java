// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi_intl20170725.models;

import com.aliyun.tea.*;

public class StartVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartVerificationResponseBody body;

    public static StartVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        StartVerificationResponse self = new StartVerificationResponse();
        return TeaModel.build(map, self);
    }

    public StartVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartVerificationResponse setBody(StartVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public StartVerificationResponseBody getBody() {
        return this.body;
    }

}
