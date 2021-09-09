// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InterruptElasticsearchTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public InterruptElasticsearchTaskResponse setBody(InterruptElasticsearchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public InterruptElasticsearchTaskResponseBody getBody() {
        return this.body;
    }

}
