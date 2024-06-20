// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ResetAntChainUserCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ResetAntChainUserCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAntChainUserCertificateResponse setBody(ResetAntChainUserCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAntChainUserCertificateResponseBody getBody() {
        return this.body;
    }

}
