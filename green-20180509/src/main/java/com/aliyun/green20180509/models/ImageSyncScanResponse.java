// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageSyncScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageSyncScanResponseBody body;

    public static ImageSyncScanResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageSyncScanResponse self = new ImageSyncScanResponse();
        return TeaModel.build(map, self);
    }

    public ImageSyncScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageSyncScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageSyncScanResponse setBody(ImageSyncScanResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageSyncScanResponseBody getBody() {
        return this.body;
    }

}
