// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ResetAntChainUserCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetAntChainUserCertificateResponseBody body;

    public static ResetAntChainUserCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAntChainUserCertificateResponse self = new ResetAntChainUserCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ResetAntChainUserCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAntChainUserCertificateResponse setBody(ResetAntChainUserCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAntChainUserCertificateResponseBody getBody() {
        return this.body;
    }

}
