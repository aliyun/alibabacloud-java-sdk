// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ApplyAntChainCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyAntChainCertificateResponseBody body;

    public static ApplyAntChainCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntChainCertificateResponse self = new ApplyAntChainCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ApplyAntChainCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyAntChainCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyAntChainCertificateResponse setBody(ApplyAntChainCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyAntChainCertificateResponseBody getBody() {
        return this.body;
    }

}
