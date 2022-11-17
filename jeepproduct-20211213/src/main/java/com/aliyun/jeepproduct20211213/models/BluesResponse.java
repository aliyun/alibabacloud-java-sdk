// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class BluesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BluesResponseBody body;

    public static BluesResponse build(java.util.Map<String, ?> map) throws Exception {
        BluesResponse self = new BluesResponse();
        return TeaModel.build(map, self);
    }

    public BluesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BluesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BluesResponse setBody(BluesResponseBody body) {
        this.body = body;
        return this;
    }
    public BluesResponseBody getBody() {
        return this.body;
    }

}
