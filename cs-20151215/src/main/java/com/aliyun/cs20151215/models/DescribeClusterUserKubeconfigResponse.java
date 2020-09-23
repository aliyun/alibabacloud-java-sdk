// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterUserKubeconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeClusterUserKubeconfigResponse setBody(DescribeClusterUserKubeconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterUserKubeconfigResponseBody getBody() {
        return this.body;
    }

}
