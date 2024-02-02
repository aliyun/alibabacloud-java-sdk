// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSimulatedSystemEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSimulatedSystemEventsResponseBody body;

    public static CreateSimulatedSystemEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSimulatedSystemEventsResponse self = new CreateSimulatedSystemEventsResponse();
        return TeaModel.build(map, self);
    }

    public CreateSimulatedSystemEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSimulatedSystemEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSimulatedSystemEventsResponse setBody(CreateSimulatedSystemEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSimulatedSystemEventsResponseBody getBody() {
        return this.body;
    }

}
