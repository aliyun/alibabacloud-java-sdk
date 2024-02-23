// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteCertificateRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCertificateRequestResponseBody body;

    public static DeleteCertificateRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCertificateRequestResponse self = new DeleteCertificateRequestResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCertificateRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCertificateRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCertificateRequestResponse setBody(DeleteCertificateRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCertificateRequestResponseBody getBody() {
        return this.body;
    }

}
