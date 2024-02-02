// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class ThreeElementsVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ThreeElementsVerificationResponseBody body;

    public static ThreeElementsVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        ThreeElementsVerificationResponse self = new ThreeElementsVerificationResponse();
        return TeaModel.build(map, self);
    }

    public ThreeElementsVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ThreeElementsVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ThreeElementsVerificationResponse setBody(ThreeElementsVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public ThreeElementsVerificationResponseBody getBody() {
        return this.body;
    }

}
