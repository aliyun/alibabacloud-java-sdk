// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnDomainCSRCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDcdnDomainCSRCertificateResponseBody body;

    public static SetDcdnDomainCSRCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnDomainCSRCertificateResponse self = new SetDcdnDomainCSRCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SetDcdnDomainCSRCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDcdnDomainCSRCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDcdnDomainCSRCertificateResponse setBody(SetDcdnDomainCSRCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDcdnDomainCSRCertificateResponseBody getBody() {
        return this.body;
    }

}
