// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetEventStreamingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetEventStreamingResponseBody body;

    public static GetEventStreamingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventStreamingResponse self = new GetEventStreamingResponse();
        return TeaModel.build(map, self);
    }

    public GetEventStreamingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventStreamingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEventStreamingResponse setBody(GetEventStreamingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventStreamingResponseBody getBody() {
        return this.body;
    }

}
