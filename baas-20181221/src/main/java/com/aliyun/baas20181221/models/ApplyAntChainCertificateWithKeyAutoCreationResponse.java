// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ApplyAntChainCertificateWithKeyAutoCreationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyAntChainCertificateWithKeyAutoCreationResponseBody body;

    public static ApplyAntChainCertificateWithKeyAutoCreationResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntChainCertificateWithKeyAutoCreationResponse self = new ApplyAntChainCertificateWithKeyAutoCreationResponse();
        return TeaModel.build(map, self);
    }

    public ApplyAntChainCertificateWithKeyAutoCreationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyAntChainCertificateWithKeyAutoCreationResponse setBody(ApplyAntChainCertificateWithKeyAutoCreationResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyAntChainCertificateWithKeyAutoCreationResponseBody getBody() {
        return this.body;
    }

}
