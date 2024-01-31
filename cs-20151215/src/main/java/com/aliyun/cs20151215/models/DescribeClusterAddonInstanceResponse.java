// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterAddonInstanceResponseBody body;

    public static DescribeClusterAddonInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAddonInstanceResponse self = new DescribeClusterAddonInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAddonInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterAddonInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterAddonInstanceResponse setBody(DescribeClusterAddonInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterAddonInstanceResponseBody getBody() {
        return this.body;
    }

}
