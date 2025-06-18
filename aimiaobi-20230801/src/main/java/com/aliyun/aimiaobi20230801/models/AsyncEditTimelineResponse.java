// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncEditTimelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AsyncEditTimelineResponseBody body;

    public static AsyncEditTimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        AsyncEditTimelineResponse self = new AsyncEditTimelineResponse();
        return TeaModel.build(map, self);
    }

    public AsyncEditTimelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AsyncEditTimelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AsyncEditTimelineResponse setBody(AsyncEditTimelineResponseBody body) {
        this.body = body;
        return this;
    }
    public AsyncEditTimelineResponseBody getBody() {
        return this.body;
    }

}
