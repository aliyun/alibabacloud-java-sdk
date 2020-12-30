// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetDomainServerCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetDomainServerCertificateResponse setBody(SetDomainServerCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDomainServerCertificateResponseBody getBody() {
        return this.body;
    }

}
