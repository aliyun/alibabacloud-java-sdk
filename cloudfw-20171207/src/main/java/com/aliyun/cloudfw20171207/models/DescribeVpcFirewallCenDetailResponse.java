// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallCenDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallCenDetailResponseBody body;

    public static DescribeVpcFirewallCenDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallCenDetailResponse self = new DescribeVpcFirewallCenDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallCenDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallCenDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallCenDetailResponse setBody(DescribeVpcFirewallCenDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallCenDetailResponseBody getBody() {
        return this.body;
    }

}
