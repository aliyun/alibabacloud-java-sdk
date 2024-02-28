// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class StartEventStreamingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartEventStreamingResponseBody body;

    public static StartEventStreamingResponse build(java.util.Map<String, ?> map) throws Exception {
        StartEventStreamingResponse self = new StartEventStreamingResponse();
        return TeaModel.build(map, self);
    }

    public StartEventStreamingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartEventStreamingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartEventStreamingResponse setBody(StartEventStreamingResponseBody body) {
        this.body = body;
        return this;
    }
    public StartEventStreamingResponseBody getBody() {
        return this.body;
    }

}
