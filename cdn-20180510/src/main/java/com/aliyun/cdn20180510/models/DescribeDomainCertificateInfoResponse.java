// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCertificateInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainCertificateInfoResponseBody body;

    public static DescribeDomainCertificateInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCertificateInfoResponse self = new DescribeDomainCertificateInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCertificateInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainCertificateInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainCertificateInfoResponse setBody(DescribeDomainCertificateInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainCertificateInfoResponseBody getBody() {
        return this.body;
    }

}
