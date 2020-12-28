// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateQueueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateQueueResponseBody body;

    public static CreateQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQueueResponse self = new CreateQueueResponse();
        return TeaModel.build(map, self);
    }

    public CreateQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQueueResponse setBody(CreateQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQueueResponseBody getBody() {
        return this.body;
    }

}
