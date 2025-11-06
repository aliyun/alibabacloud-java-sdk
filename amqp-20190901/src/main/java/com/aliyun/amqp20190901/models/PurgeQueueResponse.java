// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class PurgeQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PurgeQueueResponseBody body;

    public static PurgeQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        PurgeQueueResponse self = new PurgeQueueResponse();
        return TeaModel.build(map, self);
    }

    public PurgeQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PurgeQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PurgeQueueResponse setBody(PurgeQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public PurgeQueueResponseBody getBody() {
        return this.body;
    }

}
