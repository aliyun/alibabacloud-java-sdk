// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterV2UserKubeconfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterV2UserKubeconfigResponseBody body;

    public static DescribeClusterV2UserKubeconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterV2UserKubeconfigResponse self = new DescribeClusterV2UserKubeconfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterV2UserKubeconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterV2UserKubeconfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterV2UserKubeconfigResponse setBody(DescribeClusterV2UserKubeconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterV2UserKubeconfigResponseBody getBody() {
        return this.body;
    }

}
