// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageAsyncManualScanResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageAsyncManualScanResultsResponseBody body;

    public static ImageAsyncManualScanResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageAsyncManualScanResultsResponse self = new ImageAsyncManualScanResultsResponse();
        return TeaModel.build(map, self);
    }

    public ImageAsyncManualScanResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageAsyncManualScanResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageAsyncManualScanResultsResponse setBody(ImageAsyncManualScanResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageAsyncManualScanResultsResponseBody getBody() {
        return this.body;
    }

}
