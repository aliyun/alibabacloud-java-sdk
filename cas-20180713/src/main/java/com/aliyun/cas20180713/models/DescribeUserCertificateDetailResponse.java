// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class DescribeUserCertificateDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserCertificateDetailResponseBody body;

    public static DescribeUserCertificateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserCertificateDetailResponse self = new DescribeUserCertificateDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserCertificateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserCertificateDetailResponse setBody(DescribeUserCertificateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserCertificateDetailResponseBody getBody() {
        return this.body;
    }

}
