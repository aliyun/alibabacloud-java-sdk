// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateMessageQueueNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMessageQueueNewResponseBody body;

    public static CreateMessageQueueNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageQueueNewResponse self = new CreateMessageQueueNewResponse();
        return TeaModel.build(map, self);
    }

    public CreateMessageQueueNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMessageQueueNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMessageQueueNewResponse setBody(CreateMessageQueueNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMessageQueueNewResponseBody getBody() {
        return this.body;
    }

}
