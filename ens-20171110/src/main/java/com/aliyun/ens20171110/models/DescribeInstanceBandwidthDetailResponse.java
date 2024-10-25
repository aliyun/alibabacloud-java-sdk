// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceBandwidthDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceBandwidthDetailResponseBody body;

    public static DescribeInstanceBandwidthDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceBandwidthDetailResponse self = new DescribeInstanceBandwidthDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceBandwidthDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceBandwidthDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceBandwidthDetailResponse setBody(DescribeInstanceBandwidthDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceBandwidthDetailResponseBody getBody() {
        return this.body;
    }

}
