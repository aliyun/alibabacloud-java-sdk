// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class TextAsyncManualScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TextAsyncManualScanResponseBody body;

    public static TextAsyncManualScanResponse build(java.util.Map<String, ?> map) throws Exception {
        TextAsyncManualScanResponse self = new TextAsyncManualScanResponse();
        return TeaModel.build(map, self);
    }

    public TextAsyncManualScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TextAsyncManualScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TextAsyncManualScanResponse setBody(TextAsyncManualScanResponseBody body) {
        this.body = body;
        return this;
    }
    public TextAsyncManualScanResponseBody getBody() {
        return this.body;
    }

}
