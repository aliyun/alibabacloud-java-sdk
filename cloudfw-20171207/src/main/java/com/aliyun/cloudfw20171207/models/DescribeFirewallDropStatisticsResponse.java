// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallDropStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFirewallDropStatisticsResponseBody body;

    public static DescribeFirewallDropStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallDropStatisticsResponse self = new DescribeFirewallDropStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallDropStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFirewallDropStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFirewallDropStatisticsResponse setBody(DescribeFirewallDropStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFirewallDropStatisticsResponseBody getBody() {
        return this.body;
    }

}
