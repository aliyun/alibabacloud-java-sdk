// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TranslateCertificateResponseBody body;

    public static TranslateCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        TranslateCertificateResponse self = new TranslateCertificateResponse();
        return TeaModel.build(map, self);
    }

    public TranslateCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TranslateCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TranslateCertificateResponse setBody(TranslateCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public TranslateCertificateResponseBody getBody() {
        return this.body;
    }

}
