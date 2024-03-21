// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainByCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainByCertificateResponseBody body;

    public static DescribeDcdnDomainByCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainByCertificateResponse self = new DescribeDcdnDomainByCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainByCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainByCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainByCertificateResponse setBody(DescribeDcdnDomainByCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainByCertificateResponseBody getBody() {
        return this.body;
    }

}
