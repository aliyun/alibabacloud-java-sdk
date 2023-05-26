// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112.models;

import com.aliyun.tea.*;

public class IdDetectionAndScanDocumentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public IdDetectionAndScanDocumentResponseBody body;

    public static IdDetectionAndScanDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        IdDetectionAndScanDocumentResponse self = new IdDetectionAndScanDocumentResponse();
        return TeaModel.build(map, self);
    }

    public IdDetectionAndScanDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IdDetectionAndScanDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IdDetectionAndScanDocumentResponse setBody(IdDetectionAndScanDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public IdDetectionAndScanDocumentResponseBody getBody() {
        return this.body;
    }

}
