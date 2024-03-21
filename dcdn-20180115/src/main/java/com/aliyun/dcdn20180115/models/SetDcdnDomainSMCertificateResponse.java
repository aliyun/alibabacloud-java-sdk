// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnDomainSMCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDcdnDomainSMCertificateResponseBody body;

    public static SetDcdnDomainSMCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnDomainSMCertificateResponse self = new SetDcdnDomainSMCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SetDcdnDomainSMCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDcdnDomainSMCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDcdnDomainSMCertificateResponse setBody(SetDcdnDomainSMCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDcdnDomainSMCertificateResponseBody getBody() {
        return this.body;
    }

}
