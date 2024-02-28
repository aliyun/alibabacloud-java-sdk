// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteEventStreamingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEventStreamingResponseBody body;

    public static DeleteEventStreamingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventStreamingResponse self = new DeleteEventStreamingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEventStreamingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEventStreamingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEventStreamingResponse setBody(DeleteEventStreamingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventStreamingResponseBody getBody() {
        return this.body;
    }

}
