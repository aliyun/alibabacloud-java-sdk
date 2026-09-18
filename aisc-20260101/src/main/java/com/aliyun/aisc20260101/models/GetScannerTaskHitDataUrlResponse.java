// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class GetScannerTaskHitDataUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScannerTaskHitDataUrlResponseBody body;

    public static GetScannerTaskHitDataUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScannerTaskHitDataUrlResponse self = new GetScannerTaskHitDataUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetScannerTaskHitDataUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScannerTaskHitDataUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScannerTaskHitDataUrlResponse setBody(GetScannerTaskHitDataUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScannerTaskHitDataUrlResponseBody getBody() {
        return this.body;
    }

}
