// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddDnsFirewallPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDnsFirewallPolicyResponseBody body;

    public static AddDnsFirewallPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDnsFirewallPolicyResponse self = new AddDnsFirewallPolicyResponse();
        return TeaModel.build(map, self);
    }

    public AddDnsFirewallPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDnsFirewallPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDnsFirewallPolicyResponse setBody(AddDnsFirewallPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDnsFirewallPolicyResponseBody getBody() {
        return this.body;
    }

}
