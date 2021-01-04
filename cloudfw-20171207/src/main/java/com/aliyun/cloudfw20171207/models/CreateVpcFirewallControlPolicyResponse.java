// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateVpcFirewallControlPolicyResponse setBody(CreateVpcFirewallControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpcFirewallControlPolicyResponseBody getBody() {
        return this.body;
    }

}
