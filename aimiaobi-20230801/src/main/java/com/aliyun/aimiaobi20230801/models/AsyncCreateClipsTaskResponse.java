// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncCreateClipsTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AsyncCreateClipsTaskResponseBody body;

    public static AsyncCreateClipsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AsyncCreateClipsTaskResponse self = new AsyncCreateClipsTaskResponse();
        return TeaModel.build(map, self);
    }

    public AsyncCreateClipsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AsyncCreateClipsTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AsyncCreateClipsTaskResponse setBody(AsyncCreateClipsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public AsyncCreateClipsTaskResponseBody getBody() {
        return this.body;
    }

}
