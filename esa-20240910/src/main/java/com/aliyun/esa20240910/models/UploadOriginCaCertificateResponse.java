// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UploadOriginCaCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadOriginCaCertificateResponseBody body;

    public static UploadOriginCaCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadOriginCaCertificateResponse self = new UploadOriginCaCertificateResponse();
        return TeaModel.build(map, self);
    }

    public UploadOriginCaCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadOriginCaCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadOriginCaCertificateResponse setBody(UploadOriginCaCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadOriginCaCertificateResponseBody getBody() {
        return this.body;
    }

}
