// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class LiveStreamAsyncScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LiveStreamAsyncScanResponseBody body;

    public static LiveStreamAsyncScanResponse build(java.util.Map<String, ?> map) throws Exception {
        LiveStreamAsyncScanResponse self = new LiveStreamAsyncScanResponse();
        return TeaModel.build(map, self);
    }

    public LiveStreamAsyncScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LiveStreamAsyncScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LiveStreamAsyncScanResponse setBody(LiveStreamAsyncScanResponseBody body) {
        this.body = body;
        return this;
    }
    public LiveStreamAsyncScanResponseBody getBody() {
        return this.body;
    }

}
