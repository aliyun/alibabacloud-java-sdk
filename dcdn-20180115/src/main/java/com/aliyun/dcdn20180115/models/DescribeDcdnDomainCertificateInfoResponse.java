// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainCertificateInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainCertificateInfoResponseBody body;

    public static DescribeDcdnDomainCertificateInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainCertificateInfoResponse self = new DescribeDcdnDomainCertificateInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainCertificateInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainCertificateInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainCertificateInfoResponse setBody(DescribeDcdnDomainCertificateInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainCertificateInfoResponseBody getBody() {
        return this.body;
    }

}
