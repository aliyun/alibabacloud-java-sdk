// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112.models;

import com.aliyun.tea.*;

public class ScanDocumentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ScanDocumentResponseBody body;

    public static ScanDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanDocumentResponse self = new ScanDocumentResponse();
        return TeaModel.build(map, self);
    }

    public ScanDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScanDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScanDocumentResponse setBody(ScanDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public ScanDocumentResponseBody getBody() {
        return this.body;
    }

}
