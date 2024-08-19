// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportTextScanResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportTextScanResultResponseBody body;

    public static ExportTextScanResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportTextScanResultResponse self = new ExportTextScanResultResponse();
        return TeaModel.build(map, self);
    }

    public ExportTextScanResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportTextScanResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportTextScanResultResponse setBody(ExportTextScanResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportTextScanResultResponseBody getBody() {
        return this.body;
    }

}
