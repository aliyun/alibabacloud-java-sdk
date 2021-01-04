// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteVpcFirewallControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVpcFirewallControlPolicyResponseBody body;

    public static DeleteVpcFirewallControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcFirewallControlPolicyResponse self = new DeleteVpcFirewallControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpcFirewallControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVpcFirewallControlPolicyResponse setBody(DeleteVpcFirewallControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpcFirewallControlPolicyResponseBody getBody() {
        return this.body;
    }

}
