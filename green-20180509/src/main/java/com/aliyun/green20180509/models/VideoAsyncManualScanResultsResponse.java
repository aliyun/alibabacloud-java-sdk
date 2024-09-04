// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoAsyncManualScanResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VideoAsyncManualScanResultsResponseBody body;

    public static VideoAsyncManualScanResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        VideoAsyncManualScanResultsResponse self = new VideoAsyncManualScanResultsResponse();
        return TeaModel.build(map, self);
    }

    public VideoAsyncManualScanResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VideoAsyncManualScanResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VideoAsyncManualScanResultsResponse setBody(VideoAsyncManualScanResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public VideoAsyncManualScanResultsResponseBody getBody() {
        return this.body;
    }

}
