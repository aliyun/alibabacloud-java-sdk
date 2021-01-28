// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainCertificateInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDcdnDomainCertificateInfoResponse setBody(DescribeDcdnDomainCertificateInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainCertificateInfoResponseBody getBody() {
        return this.body;
    }

}
