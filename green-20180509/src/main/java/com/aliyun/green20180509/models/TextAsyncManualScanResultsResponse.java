// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class TextAsyncManualScanResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TextAsyncManualScanResultsResponseBody body;

    public static TextAsyncManualScanResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        TextAsyncManualScanResultsResponse self = new TextAsyncManualScanResultsResponse();
        return TeaModel.build(map, self);
    }

    public TextAsyncManualScanResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TextAsyncManualScanResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TextAsyncManualScanResultsResponse setBody(TextAsyncManualScanResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public TextAsyncManualScanResultsResponseBody getBody() {
        return this.body;
    }

}
