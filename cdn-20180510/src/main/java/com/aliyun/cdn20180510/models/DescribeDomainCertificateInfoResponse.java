// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCertificateInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDomainCertificateInfoResponse setBody(DescribeDomainCertificateInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainCertificateInfoResponseBody getBody() {
        return this.body;
    }

}
