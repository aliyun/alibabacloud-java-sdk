// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ResetAntChainCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetAntChainCertificateResponseBody body;

    public static ResetAntChainCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAntChainCertificateResponse self = new ResetAntChainCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ResetAntChainCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAntChainCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAntChainCertificateResponse setBody(ResetAntChainCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAntChainCertificateResponseBody getBody() {
        return this.body;
    }

}
