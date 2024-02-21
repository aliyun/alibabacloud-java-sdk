// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InterruptElasticsearchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InterruptElasticsearchTaskResponseBody body;

    public static InterruptElasticsearchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        InterruptElasticsearchTaskResponse self = new InterruptElasticsearchTaskResponse();
        return TeaModel.build(map, self);
    }

    public InterruptElasticsearchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InterruptElasticsearchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InterruptElasticsearchTaskResponse setBody(InterruptElasticsearchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public InterruptElasticsearchTaskResponseBody getBody() {
        return this.body;
    }

}
