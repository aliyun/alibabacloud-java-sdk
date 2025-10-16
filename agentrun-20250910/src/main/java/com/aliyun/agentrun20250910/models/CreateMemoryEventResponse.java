// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateMemoryEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMemoryEventResponseBody body;

    public static CreateMemoryEventResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryEventResponse self = new CreateMemoryEventResponse();
        return TeaModel.build(map, self);
    }

    public CreateMemoryEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMemoryEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMemoryEventResponse setBody(CreateMemoryEventResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMemoryEventResponseBody getBody() {
        return this.body;
    }

}
