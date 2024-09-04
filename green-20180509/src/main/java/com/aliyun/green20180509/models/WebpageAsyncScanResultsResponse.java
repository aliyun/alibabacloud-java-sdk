// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class WebpageAsyncScanResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebpageAsyncScanResultsResponseBody body;

    public static WebpageAsyncScanResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        WebpageAsyncScanResultsResponse self = new WebpageAsyncScanResultsResponse();
        return TeaModel.build(map, self);
    }

    public WebpageAsyncScanResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WebpageAsyncScanResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WebpageAsyncScanResultsResponse setBody(WebpageAsyncScanResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public WebpageAsyncScanResultsResponseBody getBody() {
        return this.body;
    }

}
