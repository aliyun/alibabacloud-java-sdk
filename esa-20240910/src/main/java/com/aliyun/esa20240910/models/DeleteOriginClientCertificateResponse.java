// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteOriginClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOriginClientCertificateResponseBody body;

    public static DeleteOriginClientCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOriginClientCertificateResponse self = new DeleteOriginClientCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOriginClientCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOriginClientCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOriginClientCertificateResponse setBody(DeleteOriginClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOriginClientCertificateResponseBody getBody() {
        return this.body;
    }

}
