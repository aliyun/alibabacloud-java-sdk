// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetDomainServerCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDomainServerCertificateResponseBody body;

    public static SetDomainServerCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDomainServerCertificateResponse self = new SetDomainServerCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SetDomainServerCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDomainServerCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDomainServerCertificateResponse setBody(SetDomainServerCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDomainServerCertificateResponseBody getBody() {
        return this.body;
    }

}
