// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DetachEndUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachEndUserResponseBody body;

    public static DetachEndUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachEndUserResponse self = new DetachEndUserResponse();
        return TeaModel.build(map, self);
    }

    public DetachEndUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachEndUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachEndUserResponse setBody(DetachEndUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachEndUserResponseBody getBody() {
        return this.body;
    }

}
