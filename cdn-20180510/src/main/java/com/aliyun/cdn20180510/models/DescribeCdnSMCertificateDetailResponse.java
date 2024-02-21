// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSMCertificateDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnSMCertificateDetailResponseBody body;

    public static DescribeCdnSMCertificateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnSMCertificateDetailResponse self = new DescribeCdnSMCertificateDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnSMCertificateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnSMCertificateDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnSMCertificateDetailResponse setBody(DescribeCdnSMCertificateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnSMCertificateDetailResponseBody getBody() {
        return this.body;
    }

}
