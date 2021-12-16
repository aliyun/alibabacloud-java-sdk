// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnDomainSMCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetDcdnDomainSMCertificateResponse setBody(SetDcdnDomainSMCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDcdnDomainSMCertificateResponseBody getBody() {
        return this.body;
    }

}
