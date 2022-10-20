// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DetachEaiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetachEaiResponseBody body;

    public static DetachEaiResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachEaiResponse self = new DetachEaiResponse();
        return TeaModel.build(map, self);
    }

    public DetachEaiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachEaiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachEaiResponse setBody(DetachEaiResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachEaiResponseBody getBody() {
        return this.body;
    }

}
