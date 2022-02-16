// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class DescribeSSLCertificateListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSSLCertificateListResponseBody body;

    public static DescribeSSLCertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSSLCertificateListResponse self = new DescribeSSLCertificateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSSLCertificateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSSLCertificateListResponse setBody(DescribeSSLCertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSSLCertificateListResponseBody getBody() {
        return this.body;
    }

}
