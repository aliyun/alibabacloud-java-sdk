// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSimulatedSystemEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateSimulatedSystemEventsResponse setBody(CreateSimulatedSystemEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSimulatedSystemEventsResponseBody getBody() {
        return this.body;
    }

}
