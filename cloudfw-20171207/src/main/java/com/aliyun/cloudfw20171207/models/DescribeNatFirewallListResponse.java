// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNatFirewallListResponseBody body;

    public static DescribeNatFirewallListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallListResponse self = new DescribeNatFirewallListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNatFirewallListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNatFirewallListResponse setBody(DescribeNatFirewallListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNatFirewallListResponseBody getBody() {
        return this.body;
    }

}
