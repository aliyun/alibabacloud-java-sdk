// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterVulsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterVulsResponseBody body;

    public static DescribeClusterVulsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterVulsResponse self = new DescribeClusterVulsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterVulsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterVulsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterVulsResponse setBody(DescribeClusterVulsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterVulsResponseBody getBody() {
        return this.body;
    }

}
