// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportScanResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportScanResultResponseBody body;

    public static ExportScanResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportScanResultResponse self = new ExportScanResultResponse();
        return TeaModel.build(map, self);
    }

    public ExportScanResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportScanResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportScanResultResponse setBody(ExportScanResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportScanResultResponseBody getBody() {
        return this.body;
    }

}
