// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserCertificateExpireCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserCertificateExpireCountResponseBody body;

    public static DescribeUserCertificateExpireCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserCertificateExpireCountResponse self = new DescribeUserCertificateExpireCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserCertificateExpireCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserCertificateExpireCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserCertificateExpireCountResponse setBody(DescribeUserCertificateExpireCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserCertificateExpireCountResponseBody getBody() {
        return this.body;
    }

}
