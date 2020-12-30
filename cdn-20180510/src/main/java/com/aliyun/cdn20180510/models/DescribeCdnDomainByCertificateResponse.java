// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainByCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCdnDomainByCertificateResponseBody body;

    public static DescribeCdnDomainByCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainByCertificateResponse self = new DescribeCdnDomainByCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainByCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnDomainByCertificateResponse setBody(DescribeCdnDomainByCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnDomainByCertificateResponseBody getBody() {
        return this.body;
    }

}
