// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class TextScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TextScanResponseBody body;

    public static TextScanResponse build(java.util.Map<String, ?> map) throws Exception {
        TextScanResponse self = new TextScanResponse();
        return TeaModel.build(map, self);
    }

    public TextScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TextScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TextScanResponse setBody(TextScanResponseBody body) {
        this.body = body;
        return this;
    }
    public TextScanResponseBody getBody() {
        return this.body;
    }

}
