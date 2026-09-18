// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class GetScannerTaskResultHtmlUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScannerTaskResultHtmlUrlResponseBody body;

    public static GetScannerTaskResultHtmlUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScannerTaskResultHtmlUrlResponse self = new GetScannerTaskResultHtmlUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetScannerTaskResultHtmlUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScannerTaskResultHtmlUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScannerTaskResultHtmlUrlResponse setBody(GetScannerTaskResultHtmlUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScannerTaskResultHtmlUrlResponseBody getBody() {
        return this.body;
    }

}
