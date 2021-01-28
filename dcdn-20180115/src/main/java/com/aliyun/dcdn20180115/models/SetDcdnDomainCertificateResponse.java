// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnDomainCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDcdnDomainCertificateResponseBody body;

    public static SetDcdnDomainCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnDomainCertificateResponse self = new SetDcdnDomainCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SetDcdnDomainCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDcdnDomainCertificateResponse setBody(SetDcdnDomainCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDcdnDomainCertificateResponseBody getBody() {
        return this.body;
    }

}
