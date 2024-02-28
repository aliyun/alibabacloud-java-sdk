// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventStreamingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEventStreamingResponseBody body;

    public static CreateEventStreamingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEventStreamingResponse self = new CreateEventStreamingResponse();
        return TeaModel.build(map, self);
    }

    public CreateEventStreamingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEventStreamingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEventStreamingResponse setBody(CreateEventStreamingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEventStreamingResponseBody getBody() {
        return this.body;
    }

}
