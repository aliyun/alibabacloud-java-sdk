// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainSMCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetCdnDomainSMCertificateResponseBody body;

    public static SetCdnDomainSMCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCdnDomainSMCertificateResponse self = new SetCdnDomainSMCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SetCdnDomainSMCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCdnDomainSMCertificateResponse setBody(SetCdnDomainSMCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCdnDomainSMCertificateResponseBody getBody() {
        return this.body;
    }

}
