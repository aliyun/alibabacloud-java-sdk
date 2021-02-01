// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class EvaluateCertificateQualityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EvaluateCertificateQualityResponseBody body;

    public static EvaluateCertificateQualityResponse build(java.util.Map<String, ?> map) throws Exception {
        EvaluateCertificateQualityResponse self = new EvaluateCertificateQualityResponse();
        return TeaModel.build(map, self);
    }

    public EvaluateCertificateQualityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EvaluateCertificateQualityResponse setBody(EvaluateCertificateQualityResponseBody body) {
        this.body = body;
        return this;
    }
    public EvaluateCertificateQualityResponseBody getBody() {
        return this.body;
    }

}
