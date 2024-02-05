// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEventResponseBody body;

    public static CreateEventResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEventResponse self = new CreateEventResponse();
        return TeaModel.build(map, self);
    }

    public CreateEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEventResponse setBody(CreateEventResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEventResponseBody getBody() {
        return this.body;
    }

}
