// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class UpdateCACertificateStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCACertificateStatusResponseBody body;

    public static UpdateCACertificateStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCACertificateStatusResponse self = new UpdateCACertificateStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCACertificateStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCACertificateStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCACertificateStatusResponse setBody(UpdateCACertificateStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCACertificateStatusResponseBody getBody() {
        return this.body;
    }

}
