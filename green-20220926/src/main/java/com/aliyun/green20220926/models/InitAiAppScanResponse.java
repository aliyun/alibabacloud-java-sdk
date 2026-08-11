// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class InitAiAppScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitAiAppScanResponseBody body;

    public static InitAiAppScanResponse build(java.util.Map<String, ?> map) throws Exception {
        InitAiAppScanResponse self = new InitAiAppScanResponse();
        return TeaModel.build(map, self);
    }

    public InitAiAppScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitAiAppScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitAiAppScanResponse setBody(InitAiAppScanResponseBody body) {
        this.body = body;
        return this;
    }
    public InitAiAppScanResponseBody getBody() {
        return this.body;
    }

}
