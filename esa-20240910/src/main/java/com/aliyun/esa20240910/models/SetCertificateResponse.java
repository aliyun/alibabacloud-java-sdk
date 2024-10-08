// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetCertificateResponseBody body;

    public static SetCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCertificateResponse self = new SetCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SetCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCertificateResponse setBody(SetCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCertificateResponseBody getBody() {
        return this.body;
    }

}
