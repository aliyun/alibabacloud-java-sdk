// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeClusterSecurityInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterSecurityInfoResponseBody body;

    public static DescribeClusterSecurityInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterSecurityInfoResponse self = new DescribeClusterSecurityInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterSecurityInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterSecurityInfoResponse setBody(DescribeClusterSecurityInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterSecurityInfoResponseBody getBody() {
        return this.body;
    }

}
