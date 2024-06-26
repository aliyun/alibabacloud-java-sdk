// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterKubeconfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHubClusterKubeconfigResponseBody body;

    public static DescribeHubClusterKubeconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHubClusterKubeconfigResponse self = new DescribeHubClusterKubeconfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHubClusterKubeconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHubClusterKubeconfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHubClusterKubeconfigResponse setBody(DescribeHubClusterKubeconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHubClusterKubeconfigResponseBody getBody() {
        return this.body;
    }

}
