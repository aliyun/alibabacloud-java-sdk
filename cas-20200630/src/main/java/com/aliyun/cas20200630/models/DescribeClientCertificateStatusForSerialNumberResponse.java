// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateStatusForSerialNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeClientCertificateStatusForSerialNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClientCertificateStatusForSerialNumberResponse setBody(DescribeClientCertificateStatusForSerialNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClientCertificateStatusForSerialNumberResponseBody getBody() {
        return this.body;
    }

}
