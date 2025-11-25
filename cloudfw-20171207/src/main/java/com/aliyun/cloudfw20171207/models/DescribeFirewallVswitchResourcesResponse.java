// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallVswitchResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFirewallVswitchResourcesResponseBody body;

    public static DescribeFirewallVswitchResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallVswitchResourcesResponse self = new DescribeFirewallVswitchResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallVswitchResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFirewallVswitchResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFirewallVswitchResourcesResponse setBody(DescribeFirewallVswitchResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFirewallVswitchResourcesResponseBody getBody() {
        return this.body;
    }

}
