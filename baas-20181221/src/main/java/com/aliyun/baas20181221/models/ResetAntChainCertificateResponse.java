// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ResetAntChainCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ResetAntChainCertificateResponse setBody(ResetAntChainCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAntChainCertificateResponseBody getBody() {
        return this.body;
    }

}
