// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageAsyncScanResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageAsyncScanResultsResponseBody body;

    public static ImageAsyncScanResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageAsyncScanResultsResponse self = new ImageAsyncScanResultsResponse();
        return TeaModel.build(map, self);
    }

    public ImageAsyncScanResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageAsyncScanResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageAsyncScanResultsResponse setBody(ImageAsyncScanResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageAsyncScanResultsResponseBody getBody() {
        return this.body;
    }

}
