// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnCertificateDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnCertificateDetailResponseBody body;

    public static DescribeCdnCertificateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnCertificateDetailResponse self = new DescribeCdnCertificateDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnCertificateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnCertificateDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnCertificateDetailResponse setBody(DescribeCdnCertificateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnCertificateDetailResponseBody getBody() {
        return this.body;
    }

}
