// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveDomainCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetLiveDomainCertificateResponseBody body;

    public static SetLiveDomainCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveDomainCertificateResponse self = new SetLiveDomainCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveDomainCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLiveDomainCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLiveDomainCertificateResponse setBody(SetLiveDomainCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLiveDomainCertificateResponseBody getBody() {
        return this.body;
    }

}
