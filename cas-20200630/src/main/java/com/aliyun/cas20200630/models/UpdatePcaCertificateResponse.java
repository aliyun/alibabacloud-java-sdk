// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class UpdatePcaCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePcaCertificateResponseBody body;

    public static UpdatePcaCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePcaCertificateResponse self = new UpdatePcaCertificateResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePcaCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePcaCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePcaCertificateResponse setBody(UpdatePcaCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePcaCertificateResponseBody getBody() {
        return this.body;
    }

}
