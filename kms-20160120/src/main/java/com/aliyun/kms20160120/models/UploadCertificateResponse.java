// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UploadCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadCertificateResponseBody body;

    public static UploadCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadCertificateResponse self = new UploadCertificateResponse();
        return TeaModel.build(map, self);
    }

    public UploadCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadCertificateResponse setBody(UploadCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadCertificateResponseBody getBody() {
        return this.body;
    }

}
