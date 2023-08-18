// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class UnbindQueueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindQueueResponseBody body;

    public static UnbindQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindQueueResponse self = new UnbindQueueResponse();
        return TeaModel.build(map, self);
    }

    public UnbindQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindQueueResponse setBody(UnbindQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindQueueResponseBody getBody() {
        return this.body;
    }

}
