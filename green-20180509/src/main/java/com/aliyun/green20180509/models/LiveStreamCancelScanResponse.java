// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class LiveStreamCancelScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LiveStreamCancelScanResponseBody body;

    public static LiveStreamCancelScanResponse build(java.util.Map<String, ?> map) throws Exception {
        LiveStreamCancelScanResponse self = new LiveStreamCancelScanResponse();
        return TeaModel.build(map, self);
    }

    public LiveStreamCancelScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LiveStreamCancelScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LiveStreamCancelScanResponse setBody(LiveStreamCancelScanResponseBody body) {
        this.body = body;
        return this;
    }
    public LiveStreamCancelScanResponseBody getBody() {
        return this.body;
    }

}
