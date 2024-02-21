// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InterruptLogstashTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InterruptLogstashTaskResponseBody body;

    public static InterruptLogstashTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        InterruptLogstashTaskResponse self = new InterruptLogstashTaskResponse();
        return TeaModel.build(map, self);
    }

    public InterruptLogstashTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InterruptLogstashTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InterruptLogstashTaskResponse setBody(InterruptLogstashTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public InterruptLogstashTaskResponseBody getBody() {
        return this.body;
    }

}
