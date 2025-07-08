// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateCardMessageQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCardMessageQueueResponseBody body;

    public static CreateCardMessageQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCardMessageQueueResponse self = new CreateCardMessageQueueResponse();
        return TeaModel.build(map, self);
    }

    public CreateCardMessageQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCardMessageQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCardMessageQueueResponse setBody(CreateCardMessageQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCardMessageQueueResponseBody getBody() {
        return this.body;
    }

}
