// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAckClusterPodLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAckClusterPodLabelsResponseBody body;

    public static DescribeAckClusterPodLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAckClusterPodLabelsResponse self = new DescribeAckClusterPodLabelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAckClusterPodLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAckClusterPodLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAckClusterPodLabelsResponse setBody(DescribeAckClusterPodLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAckClusterPodLabelsResponseBody getBody() {
        return this.body;
    }

}
