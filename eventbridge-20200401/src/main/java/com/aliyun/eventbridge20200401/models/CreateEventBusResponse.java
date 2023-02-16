// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventBusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEventBusResponseBody body;

    public static CreateEventBusResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEventBusResponse self = new CreateEventBusResponse();
        return TeaModel.build(map, self);
    }

    public CreateEventBusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEventBusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEventBusResponse setBody(CreateEventBusResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEventBusResponseBody getBody() {
        return this.body;
    }

}
