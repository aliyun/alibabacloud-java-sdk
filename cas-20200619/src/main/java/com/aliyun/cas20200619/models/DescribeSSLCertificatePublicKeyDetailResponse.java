// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class DescribeSSLCertificatePublicKeyDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSSLCertificatePublicKeyDetailResponseBody body;

    public static DescribeSSLCertificatePublicKeyDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSSLCertificatePublicKeyDetailResponse self = new DescribeSSLCertificatePublicKeyDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSSLCertificatePublicKeyDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSSLCertificatePublicKeyDetailResponse setBody(DescribeSSLCertificatePublicKeyDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSSLCertificatePublicKeyDetailResponseBody getBody() {
        return this.body;
    }

}
