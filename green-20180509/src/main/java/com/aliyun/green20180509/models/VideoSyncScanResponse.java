// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoSyncScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VideoSyncScanResponseBody body;

    public static VideoSyncScanResponse build(java.util.Map<String, ?> map) throws Exception {
        VideoSyncScanResponse self = new VideoSyncScanResponse();
        return TeaModel.build(map, self);
    }

    public VideoSyncScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VideoSyncScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VideoSyncScanResponse setBody(VideoSyncScanResponseBody body) {
        this.body = body;
        return this;
    }
    public VideoSyncScanResponseBody getBody() {
        return this.body;
    }

}
