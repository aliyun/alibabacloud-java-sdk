// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteClientCaCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteClientCaCertificateResponseBody body;

    public static DeleteClientCaCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientCaCertificateResponse self = new DeleteClientCaCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClientCaCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClientCaCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteClientCaCertificateResponse setBody(DeleteClientCaCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClientCaCertificateResponseBody getBody() {
        return this.body;
    }

}
