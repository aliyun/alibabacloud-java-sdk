// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateForSerialNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeClientCertificateForSerialNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClientCertificateForSerialNumberResponse setBody(DescribeClientCertificateForSerialNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClientCertificateForSerialNumberResponseBody getBody() {
        return this.body;
    }

}
