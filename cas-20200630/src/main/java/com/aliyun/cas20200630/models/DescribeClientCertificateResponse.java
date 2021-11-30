// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClientCertificateResponseBody body;

    public static DescribeClientCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientCertificateResponse self = new DescribeClientCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClientCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClientCertificateResponse setBody(DescribeClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClientCertificateResponseBody getBody() {
        return this.body;
    }

}
