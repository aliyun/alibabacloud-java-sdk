// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class DescribeSSLCertificateCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSSLCertificateCountResponseBody body;

    public static DescribeSSLCertificateCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSSLCertificateCountResponse self = new DescribeSSLCertificateCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSSLCertificateCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSSLCertificateCountResponse setBody(DescribeSSLCertificateCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSSLCertificateCountResponseBody getBody() {
        return this.body;
    }

}
