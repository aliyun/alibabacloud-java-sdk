// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteOriginCaCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOriginCaCertificateResponseBody body;

    public static DeleteOriginCaCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOriginCaCertificateResponse self = new DeleteOriginCaCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOriginCaCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOriginCaCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOriginCaCertificateResponse setBody(DeleteOriginCaCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOriginCaCertificateResponseBody getBody() {
        return this.body;
    }

}
