// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class TwoElementsVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TwoElementsVerificationResponseBody body;

    public static TwoElementsVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        TwoElementsVerificationResponse self = new TwoElementsVerificationResponse();
        return TeaModel.build(map, self);
    }

    public TwoElementsVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TwoElementsVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TwoElementsVerificationResponse setBody(TwoElementsVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public TwoElementsVerificationResponseBody getBody() {
        return this.body;
    }

}
