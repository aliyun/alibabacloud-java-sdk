// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCertificateResponseBody body;

    public static DeleteCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCertificateResponse self = new DeleteCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCertificateResponse setBody(DeleteCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCertificateResponseBody getBody() {
        return this.body;
    }

}
