// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoAsyncScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VideoAsyncScanResponseBody body;

    public static VideoAsyncScanResponse build(java.util.Map<String, ?> map) throws Exception {
        VideoAsyncScanResponse self = new VideoAsyncScanResponse();
        return TeaModel.build(map, self);
    }

    public VideoAsyncScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VideoAsyncScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VideoAsyncScanResponse setBody(VideoAsyncScanResponseBody body) {
        this.body = body;
        return this;
    }
    public VideoAsyncScanResponseBody getBody() {
        return this.body;
    }

}
