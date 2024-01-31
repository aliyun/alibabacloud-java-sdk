// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEdgeMachineTunnelConfigDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEdgeMachineTunnelConfigDetailResponseBody body;

    public static DescribeEdgeMachineTunnelConfigDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeMachineTunnelConfigDetailResponse self = new DescribeEdgeMachineTunnelConfigDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeMachineTunnelConfigDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEdgeMachineTunnelConfigDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEdgeMachineTunnelConfigDetailResponse setBody(DescribeEdgeMachineTunnelConfigDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEdgeMachineTunnelConfigDetailResponseBody getBody() {
        return this.body;
    }

}
