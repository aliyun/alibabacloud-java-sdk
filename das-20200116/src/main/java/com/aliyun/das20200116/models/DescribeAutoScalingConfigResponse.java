// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeAutoScalingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAutoScalingConfigResponseBody body;

    public static DescribeAutoScalingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoScalingConfigResponse self = new DescribeAutoScalingConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoScalingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoScalingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoScalingConfigResponse setBody(DescribeAutoScalingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoScalingConfigResponseBody getBody() {
        return this.body;
    }

}
