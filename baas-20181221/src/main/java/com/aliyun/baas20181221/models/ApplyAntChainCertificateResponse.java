// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ApplyAntChainCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ApplyAntChainCertificateResponse setBody(ApplyAntChainCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyAntChainCertificateResponseBody getBody() {
        return this.body;
    }

}
