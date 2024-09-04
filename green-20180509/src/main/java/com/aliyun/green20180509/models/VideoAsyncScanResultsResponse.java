// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoAsyncScanResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VideoAsyncScanResultsResponseBody body;

    public static VideoAsyncScanResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        VideoAsyncScanResultsResponse self = new VideoAsyncScanResultsResponse();
        return TeaModel.build(map, self);
    }

    public VideoAsyncScanResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VideoAsyncScanResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VideoAsyncScanResultsResponse setBody(VideoAsyncScanResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public VideoAsyncScanResultsResponseBody getBody() {
        return this.body;
    }

}
