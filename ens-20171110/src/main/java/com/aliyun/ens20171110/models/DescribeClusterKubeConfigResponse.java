// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeClusterKubeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterKubeConfigResponseBody body;

    public static DescribeClusterKubeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterKubeConfigResponse self = new DescribeClusterKubeConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterKubeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterKubeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterKubeConfigResponse setBody(DescribeClusterKubeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterKubeConfigResponseBody getBody() {
        return this.body;
    }

}
