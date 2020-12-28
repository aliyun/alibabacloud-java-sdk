// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteQueueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteQueueResponseBody body;

    public static DeleteQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQueueResponse self = new DeleteQueueResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQueueResponse setBody(DeleteQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQueueResponseBody getBody() {
        return this.body;
    }

}
