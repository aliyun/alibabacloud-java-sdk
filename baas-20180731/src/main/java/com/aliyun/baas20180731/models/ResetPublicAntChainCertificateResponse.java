// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ResetPublicAntChainCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetPublicAntChainCertificateResponseBody body;

    public static ResetPublicAntChainCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetPublicAntChainCertificateResponse self = new ResetPublicAntChainCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ResetPublicAntChainCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetPublicAntChainCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetPublicAntChainCertificateResponse setBody(ResetPublicAntChainCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetPublicAntChainCertificateResponseBody getBody() {
        return this.body;
    }

}
