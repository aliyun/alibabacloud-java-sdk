// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateStatusForSerialNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClientCertificateStatusForSerialNumberResponseBody body;

    public static DescribeClientCertificateStatusForSerialNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientCertificateStatusForSerialNumberResponse self = new DescribeClientCertificateStatusForSerialNumberResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClientCertificateStatusForSerialNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClientCertificateStatusForSerialNumberResponse setBody(DescribeClientCertificateStatusForSerialNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClientCertificateStatusForSerialNumberResponseBody getBody() {
        return this.body;
    }

}
