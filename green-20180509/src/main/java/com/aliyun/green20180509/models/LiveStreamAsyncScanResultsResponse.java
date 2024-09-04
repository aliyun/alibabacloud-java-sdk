// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class LiveStreamAsyncScanResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LiveStreamAsyncScanResultsResponseBody body;

    public static LiveStreamAsyncScanResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        LiveStreamAsyncScanResultsResponse self = new LiveStreamAsyncScanResultsResponse();
        return TeaModel.build(map, self);
    }

    public LiveStreamAsyncScanResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LiveStreamAsyncScanResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LiveStreamAsyncScanResultsResponse setBody(LiveStreamAsyncScanResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public LiveStreamAsyncScanResultsResponseBody getBody() {
        return this.body;
    }

}
