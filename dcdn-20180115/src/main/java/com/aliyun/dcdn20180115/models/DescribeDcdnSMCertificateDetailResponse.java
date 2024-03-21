// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSMCertificateDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnSMCertificateDetailResponseBody body;

    public static DescribeDcdnSMCertificateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSMCertificateDetailResponse self = new DescribeDcdnSMCertificateDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSMCertificateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnSMCertificateDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnSMCertificateDetailResponse setBody(DescribeDcdnSMCertificateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnSMCertificateDetailResponseBody getBody() {
        return this.body;
    }

}
