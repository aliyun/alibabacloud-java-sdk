// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateForSerialNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClientCertificateForSerialNumberResponseBody body;

    public static DescribeClientCertificateForSerialNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientCertificateForSerialNumberResponse self = new DescribeClientCertificateForSerialNumberResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClientCertificateForSerialNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClientCertificateForSerialNumberResponse setBody(DescribeClientCertificateForSerialNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClientCertificateForSerialNumberResponseBody getBody() {
        return this.body;
    }

}
