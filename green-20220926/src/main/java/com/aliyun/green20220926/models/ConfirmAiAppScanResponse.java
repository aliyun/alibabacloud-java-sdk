// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ConfirmAiAppScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmAiAppScanResponseBody body;

    public static ConfirmAiAppScanResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAiAppScanResponse self = new ConfirmAiAppScanResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmAiAppScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmAiAppScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmAiAppScanResponse setBody(ConfirmAiAppScanResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmAiAppScanResponseBody getBody() {
        return this.body;
    }

}
