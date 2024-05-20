// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class StopAppSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopAppSessionResponseBody body;

    public static StopAppSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAppSessionResponse self = new StopAppSessionResponse();
        return TeaModel.build(map, self);
    }

    public StopAppSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAppSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopAppSessionResponse setBody(StopAppSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAppSessionResponseBody getBody() {
        return this.body;
    }

}
