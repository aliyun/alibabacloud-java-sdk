// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class CreateMessageQueueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMessageQueueResponseBody body;

    public static CreateMessageQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageQueueResponse self = new CreateMessageQueueResponse();
        return TeaModel.build(map, self);
    }

    public CreateMessageQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMessageQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMessageQueueResponse setBody(CreateMessageQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMessageQueueResponseBody getBody() {
        return this.body;
    }

}
