// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class WebpageAsyncScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebpageAsyncScanResponseBody body;

    public static WebpageAsyncScanResponse build(java.util.Map<String, ?> map) throws Exception {
        WebpageAsyncScanResponse self = new WebpageAsyncScanResponse();
        return TeaModel.build(map, self);
    }

    public WebpageAsyncScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WebpageAsyncScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WebpageAsyncScanResponse setBody(WebpageAsyncScanResponseBody body) {
        this.body = body;
        return this;
    }
    public WebpageAsyncScanResponseBody getBody() {
        return this.body;
    }

}
