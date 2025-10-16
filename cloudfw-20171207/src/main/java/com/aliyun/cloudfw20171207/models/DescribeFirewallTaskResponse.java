// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFirewallTaskResponseBody body;

    public static DescribeFirewallTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallTaskResponse self = new DescribeFirewallTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFirewallTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFirewallTaskResponse setBody(DescribeFirewallTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFirewallTaskResponseBody getBody() {
        return this.body;
    }

}
