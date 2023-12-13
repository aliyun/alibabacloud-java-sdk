// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class UAIDVerificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UAIDVerificationResponseBody body;

    public static UAIDVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        UAIDVerificationResponse self = new UAIDVerificationResponse();
        return TeaModel.build(map, self);
    }

    public UAIDVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UAIDVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UAIDVerificationResponse setBody(UAIDVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public UAIDVerificationResponseBody getBody() {
        return this.body;
    }

}
