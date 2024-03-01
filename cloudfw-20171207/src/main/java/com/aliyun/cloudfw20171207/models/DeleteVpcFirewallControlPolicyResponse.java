// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteVpcFirewallControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteVpcFirewallControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVpcFirewallControlPolicyResponse setBody(DeleteVpcFirewallControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpcFirewallControlPolicyResponseBody getBody() {
        return this.body;
    }

}
