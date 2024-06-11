// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DetachKeyPairResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
