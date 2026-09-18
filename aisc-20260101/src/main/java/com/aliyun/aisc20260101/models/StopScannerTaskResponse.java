// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class StopScannerTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopScannerTaskResponseBody body;

    public static StopScannerTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopScannerTaskResponse self = new StopScannerTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopScannerTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopScannerTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopScannerTaskResponse setBody(StopScannerTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopScannerTaskResponseBody getBody() {
        return this.body;
    }

}
