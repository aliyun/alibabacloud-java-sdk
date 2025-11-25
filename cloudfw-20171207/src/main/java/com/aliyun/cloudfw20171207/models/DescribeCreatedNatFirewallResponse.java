// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeCreatedNatFirewallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCreatedNatFirewallResponseBody body;

    public static DescribeCreatedNatFirewallResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreatedNatFirewallResponse self = new DescribeCreatedNatFirewallResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCreatedNatFirewallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCreatedNatFirewallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCreatedNatFirewallResponse setBody(DescribeCreatedNatFirewallResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCreatedNatFirewallResponseBody getBody() {
        return this.body;
    }

}
