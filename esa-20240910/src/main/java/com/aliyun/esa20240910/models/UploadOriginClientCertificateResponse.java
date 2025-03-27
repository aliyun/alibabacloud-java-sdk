// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UploadOriginClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadOriginClientCertificateResponseBody body;

    public static UploadOriginClientCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadOriginClientCertificateResponse self = new UploadOriginClientCertificateResponse();
        return TeaModel.build(map, self);
    }

    public UploadOriginClientCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadOriginClientCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadOriginClientCertificateResponse setBody(UploadOriginClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadOriginClientCertificateResponseBody getBody() {
        return this.body;
    }

}
