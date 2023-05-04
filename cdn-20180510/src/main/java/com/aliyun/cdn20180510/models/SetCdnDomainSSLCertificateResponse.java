// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainSSLCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetCdnDomainSSLCertificateResponseBody body;

    public static SetCdnDomainSSLCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCdnDomainSSLCertificateResponse self = new SetCdnDomainSSLCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SetCdnDomainSSLCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCdnDomainSSLCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCdnDomainSSLCertificateResponse setBody(SetCdnDomainSSLCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCdnDomainSSLCertificateResponseBody getBody() {
        return this.body;
    }

}
