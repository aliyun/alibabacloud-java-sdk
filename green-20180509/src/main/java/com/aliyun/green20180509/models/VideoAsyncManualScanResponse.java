// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoAsyncManualScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VideoAsyncManualScanResponseBody body;

    public static VideoAsyncManualScanResponse build(java.util.Map<String, ?> map) throws Exception {
        VideoAsyncManualScanResponse self = new VideoAsyncManualScanResponse();
        return TeaModel.build(map, self);
    }

    public VideoAsyncManualScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VideoAsyncManualScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VideoAsyncManualScanResponse setBody(VideoAsyncManualScanResponseBody body) {
        this.body = body;
        return this;
    }
    public VideoAsyncManualScanResponseBody getBody() {
        return this.body;
    }

}
