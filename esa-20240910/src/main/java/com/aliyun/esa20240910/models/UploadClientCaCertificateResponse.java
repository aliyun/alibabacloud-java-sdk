// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UploadClientCaCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadClientCaCertificateResponseBody body;

    public static UploadClientCaCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadClientCaCertificateResponse self = new UploadClientCaCertificateResponse();
        return TeaModel.build(map, self);
    }

    public UploadClientCaCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadClientCaCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadClientCaCertificateResponse setBody(UploadClientCaCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadClientCaCertificateResponseBody getBody() {
        return this.body;
    }

}
