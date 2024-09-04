// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class WebpageSyncScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebpageSyncScanResponseBody body;

    public static WebpageSyncScanResponse build(java.util.Map<String, ?> map) throws Exception {
        WebpageSyncScanResponse self = new WebpageSyncScanResponse();
        return TeaModel.build(map, self);
    }

    public WebpageSyncScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WebpageSyncScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WebpageSyncScanResponse setBody(WebpageSyncScanResponseBody body) {
        this.body = body;
        return this;
    }
    public WebpageSyncScanResponseBody getBody() {
        return this.body;
    }

}
