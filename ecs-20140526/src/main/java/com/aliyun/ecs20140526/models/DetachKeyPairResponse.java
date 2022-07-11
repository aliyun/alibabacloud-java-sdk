// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachKeyPairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetachKeyPairResponseBody body;

    public static DetachKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachKeyPairResponse self = new DetachKeyPairResponse();
        return TeaModel.build(map, self);
    }

    public DetachKeyPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachKeyPairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachKeyPairResponse setBody(DetachKeyPairResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachKeyPairResponseBody getBody() {
        return this.body;
    }

}
