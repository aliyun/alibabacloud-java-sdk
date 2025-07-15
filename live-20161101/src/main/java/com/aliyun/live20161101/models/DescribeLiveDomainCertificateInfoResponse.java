// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainCertificateInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeLiveDomainCertificateInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainCertificateInfoResponse setBody(DescribeLiveDomainCertificateInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainCertificateInfoResponseBody getBody() {
        return this.body;
    }

}
