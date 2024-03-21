// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnDomainSSLCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDcdnDomainSSLCertificateResponseBody body;

    public static SetDcdnDomainSSLCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnDomainSSLCertificateResponse self = new SetDcdnDomainSSLCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SetDcdnDomainSSLCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDcdnDomainSSLCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDcdnDomainSSLCertificateResponse setBody(SetDcdnDomainSSLCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDcdnDomainSSLCertificateResponseBody getBody() {
        return this.body;
    }

}
