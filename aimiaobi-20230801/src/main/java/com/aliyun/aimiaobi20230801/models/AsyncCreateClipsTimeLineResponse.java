// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncCreateClipsTimeLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AsyncCreateClipsTimeLineResponseBody body;

    public static AsyncCreateClipsTimeLineResponse build(java.util.Map<String, ?> map) throws Exception {
        AsyncCreateClipsTimeLineResponse self = new AsyncCreateClipsTimeLineResponse();
        return TeaModel.build(map, self);
    }

    public AsyncCreateClipsTimeLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AsyncCreateClipsTimeLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AsyncCreateClipsTimeLineResponse setBody(AsyncCreateClipsTimeLineResponseBody body) {
        this.body = body;
        return this;
    }
    public AsyncCreateClipsTimeLineResponseBody getBody() {
        return this.body;
    }

}
