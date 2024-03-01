// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVpcFirewallControlPolicyResponseBody body;

    public static CreateVpcFirewallControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcFirewallControlPolicyResponse self = new CreateVpcFirewallControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpcFirewallControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpcFirewallControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVpcFirewallControlPolicyResponse setBody(CreateVpcFirewallControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpcFirewallControlPolicyResponseBody getBody() {
        return this.body;
    }

}
