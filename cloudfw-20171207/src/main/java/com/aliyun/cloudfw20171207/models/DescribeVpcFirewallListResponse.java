// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcFirewallListResponseBody body;

    public static DescribeVpcFirewallListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallListResponse self = new DescribeVpcFirewallListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcFirewallListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcFirewallListResponse setBody(DescribeVpcFirewallListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcFirewallListResponseBody getBody() {
        return this.body;
    }

}
