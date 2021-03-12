// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class CertificateQualityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CertificateQualityResponseBody body;

    public static CertificateQualityResponse build(java.util.Map<String, ?> map) throws Exception {
        CertificateQualityResponse self = new CertificateQualityResponse();
        return TeaModel.build(map, self);
    }

    public CertificateQualityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CertificateQualityResponse setBody(CertificateQualityResponseBody body) {
        this.body = body;
        return this;
    }
    public CertificateQualityResponseBody getBody() {
        return this.body;
    }

}
