// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDnsFirewallPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDnsFirewallPolicyResponseBody body;

    public static DescribeDnsFirewallPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsFirewallPolicyResponse self = new DescribeDnsFirewallPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsFirewallPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsFirewallPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDnsFirewallPolicyResponse setBody(DescribeDnsFirewallPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsFirewallPolicyResponseBody getBody() {
        return this.body;
    }

}
