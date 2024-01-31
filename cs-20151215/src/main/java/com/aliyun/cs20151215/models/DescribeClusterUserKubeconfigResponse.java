// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterUserKubeconfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterUserKubeconfigResponseBody body;

    public static DescribeClusterUserKubeconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterUserKubeconfigResponse self = new DescribeClusterUserKubeconfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterUserKubeconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterUserKubeconfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterUserKubeconfigResponse setBody(DescribeClusterUserKubeconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterUserKubeconfigResponseBody getBody() {
        return this.body;
    }

}
