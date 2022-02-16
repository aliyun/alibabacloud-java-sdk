// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class DescribeSSLCertificatePrivateKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSSLCertificatePrivateKeyResponseBody body;

    public static DescribeSSLCertificatePrivateKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSSLCertificatePrivateKeyResponse self = new DescribeSSLCertificatePrivateKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSSLCertificatePrivateKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSSLCertificatePrivateKeyResponse setBody(DescribeSSLCertificatePrivateKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSSLCertificatePrivateKeyResponseBody getBody() {
        return this.body;
    }

}
