// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeResourcePackageQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResourcePackageQuotaResponseBody body;

    public static DescribeResourcePackageQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackageQuotaResponse self = new DescribeResourcePackageQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackageQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourcePackageQuotaResponse setBody(DescribeResourcePackageQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourcePackageQuotaResponseBody getBody() {
        return this.body;
    }

}
