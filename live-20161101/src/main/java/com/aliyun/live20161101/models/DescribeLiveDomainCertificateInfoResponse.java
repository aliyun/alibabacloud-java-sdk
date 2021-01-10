// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainCertificateInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainCertificateInfoResponseBody body;

    public static DescribeLiveDomainCertificateInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainCertificateInfoResponse self = new DescribeLiveDomainCertificateInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainCertificateInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainCertificateInfoResponse setBody(DescribeLiveDomainCertificateInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainCertificateInfoResponseBody getBody() {
        return this.body;
    }

}
