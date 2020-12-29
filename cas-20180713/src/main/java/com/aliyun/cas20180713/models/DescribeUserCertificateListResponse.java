// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class DescribeUserCertificateListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserCertificateListResponseBody body;

    public static DescribeUserCertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserCertificateListResponse self = new DescribeUserCertificateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserCertificateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserCertificateListResponse setBody(DescribeUserCertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserCertificateListResponseBody getBody() {
        return this.body;
    }

}
