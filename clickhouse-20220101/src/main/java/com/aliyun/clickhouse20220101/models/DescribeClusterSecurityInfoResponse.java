// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeClusterSecurityInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeClusterSecurityInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterSecurityInfoResponse setBody(DescribeClusterSecurityInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterSecurityInfoResponseBody getBody() {
        return this.body;
    }

}
