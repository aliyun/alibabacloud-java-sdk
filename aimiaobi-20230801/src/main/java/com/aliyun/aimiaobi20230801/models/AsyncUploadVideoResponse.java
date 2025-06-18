// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncUploadVideoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AsyncUploadVideoResponseBody body;

    public static AsyncUploadVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        AsyncUploadVideoResponse self = new AsyncUploadVideoResponse();
        return TeaModel.build(map, self);
    }

    public AsyncUploadVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AsyncUploadVideoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AsyncUploadVideoResponse setBody(AsyncUploadVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public AsyncUploadVideoResponseBody getBody() {
        return this.body;
    }

}
