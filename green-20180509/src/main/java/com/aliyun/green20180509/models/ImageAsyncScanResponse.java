// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageAsyncScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageAsyncScanResponseBody body;

    public static ImageAsyncScanResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageAsyncScanResponse self = new ImageAsyncScanResponse();
        return TeaModel.build(map, self);
    }

    public ImageAsyncScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageAsyncScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageAsyncScanResponse setBody(ImageAsyncScanResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageAsyncScanResponseBody getBody() {
        return this.body;
    }

}
