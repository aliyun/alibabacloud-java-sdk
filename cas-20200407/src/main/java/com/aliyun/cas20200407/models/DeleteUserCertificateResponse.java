// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteUserCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserCertificateResponseBody body;

    public static DeleteUserCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserCertificateResponse self = new DeleteUserCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserCertificateResponse setBody(DeleteUserCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserCertificateResponseBody getBody() {
        return this.body;
    }

}
