// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserCertificateExpireCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeUserCertificateExpireCountResponse setBody(DescribeUserCertificateExpireCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserCertificateExpireCountResponseBody getBody() {
        return this.body;
    }

}
