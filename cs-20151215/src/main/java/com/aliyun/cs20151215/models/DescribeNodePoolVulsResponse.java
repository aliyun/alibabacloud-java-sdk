// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeNodePoolVulsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNodePoolVulsResponseBody body;

    public static DescribeNodePoolVulsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodePoolVulsResponse self = new DescribeNodePoolVulsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNodePoolVulsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNodePoolVulsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNodePoolVulsResponse setBody(DescribeNodePoolVulsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNodePoolVulsResponseBody getBody() {
        return this.body;
    }

}
