// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UploadUserCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadUserCertificateResponseBody body;

    public static UploadUserCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadUserCertificateResponse self = new UploadUserCertificateResponse();
        return TeaModel.build(map, self);
    }

    public UploadUserCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadUserCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadUserCertificateResponse setBody(UploadUserCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadUserCertificateResponseBody getBody() {
        return this.body;
    }

}
