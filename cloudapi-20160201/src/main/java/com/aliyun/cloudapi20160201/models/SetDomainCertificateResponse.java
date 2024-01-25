// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetDomainCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDomainCertificateResponseBody body;

    public static SetDomainCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDomainCertificateResponse self = new SetDomainCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SetDomainCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDomainCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDomainCertificateResponse setBody(SetDomainCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDomainCertificateResponseBody getBody() {
        return this.body;
    }

}
