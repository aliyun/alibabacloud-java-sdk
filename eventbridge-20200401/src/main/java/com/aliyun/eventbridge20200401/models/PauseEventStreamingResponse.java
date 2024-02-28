// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class PauseEventStreamingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PauseEventStreamingResponseBody body;

    public static PauseEventStreamingResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseEventStreamingResponse self = new PauseEventStreamingResponse();
        return TeaModel.build(map, self);
    }

    public PauseEventStreamingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseEventStreamingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PauseEventStreamingResponse setBody(PauseEventStreamingResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseEventStreamingResponseBody getBody() {
        return this.body;
    }

}
