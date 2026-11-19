// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEventsResponseBody body;

    public static CreateEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEventsResponse self = new CreateEventsResponse();
        return TeaModel.build(map, self);
    }

    public CreateEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEventsResponse setBody(CreateEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEventsResponseBody getBody() {
        return this.body;
    }

}
