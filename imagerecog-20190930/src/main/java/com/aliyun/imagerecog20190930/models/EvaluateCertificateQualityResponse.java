// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class EvaluateCertificateQualityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public EvaluateCertificateQualityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EvaluateCertificateQualityResponse setBody(EvaluateCertificateQualityResponseBody body) {
        this.body = body;
        return this;
    }
    public EvaluateCertificateQualityResponseBody getBody() {
        return this.body;
    }

}
