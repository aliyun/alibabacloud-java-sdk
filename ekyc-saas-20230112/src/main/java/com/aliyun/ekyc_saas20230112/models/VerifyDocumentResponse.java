// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112.models;

import com.aliyun.tea.*;

public class VerifyDocumentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyDocumentResponseBody body;

    public static VerifyDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyDocumentResponse self = new VerifyDocumentResponse();
        return TeaModel.build(map, self);
    }

    public VerifyDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyDocumentResponse setBody(VerifyDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyDocumentResponseBody getBody() {
        return this.body;
    }

}
