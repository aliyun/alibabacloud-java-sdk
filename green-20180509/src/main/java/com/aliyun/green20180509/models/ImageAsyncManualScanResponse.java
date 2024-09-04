// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageAsyncManualScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageAsyncManualScanResponseBody body;

    public static ImageAsyncManualScanResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageAsyncManualScanResponse self = new ImageAsyncManualScanResponse();
        return TeaModel.build(map, self);
    }

    public ImageAsyncManualScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageAsyncManualScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageAsyncManualScanResponse setBody(ImageAsyncManualScanResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageAsyncManualScanResponseBody getBody() {
        return this.body;
    }

}
