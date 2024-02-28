// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventStreamingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEventStreamingResponseBody body;

    public static UpdateEventStreamingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventStreamingResponse self = new UpdateEventStreamingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEventStreamingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEventStreamingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEventStreamingResponse setBody(UpdateEventStreamingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEventStreamingResponseBody getBody() {
        return this.body;
    }

}
