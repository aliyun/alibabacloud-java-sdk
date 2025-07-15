// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainByCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveDomainByCertificateResponseBody body;

    public static DescribeLiveDomainByCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainByCertificateResponse self = new DescribeLiveDomainByCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainByCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainByCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainByCertificateResponse setBody(DescribeLiveDomainByCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainByCertificateResponseBody getBody() {
        return this.body;
    }

}
