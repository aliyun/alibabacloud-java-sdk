// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class DescribeSSLCertificateMatchDomainListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSSLCertificateMatchDomainListResponseBody body;

    public static DescribeSSLCertificateMatchDomainListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSSLCertificateMatchDomainListResponse self = new DescribeSSLCertificateMatchDomainListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSSLCertificateMatchDomainListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSSLCertificateMatchDomainListResponse setBody(DescribeSSLCertificateMatchDomainListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSSLCertificateMatchDomainListResponseBody getBody() {
        return this.body;
    }

}
