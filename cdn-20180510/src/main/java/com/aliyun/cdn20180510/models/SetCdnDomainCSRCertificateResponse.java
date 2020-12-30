// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainCSRCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetCdnDomainCSRCertificateResponseBody body;

    public static SetCdnDomainCSRCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCdnDomainCSRCertificateResponse self = new SetCdnDomainCSRCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SetCdnDomainCSRCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCdnDomainCSRCertificateResponse setBody(SetCdnDomainCSRCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCdnDomainCSRCertificateResponseBody getBody() {
        return this.body;
    }

}
