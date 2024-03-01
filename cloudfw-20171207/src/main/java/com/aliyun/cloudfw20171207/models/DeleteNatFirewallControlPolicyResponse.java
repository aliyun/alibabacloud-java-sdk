// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteNatFirewallControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNatFirewallControlPolicyResponseBody body;

    public static DeleteNatFirewallControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatFirewallControlPolicyResponse self = new DeleteNatFirewallControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNatFirewallControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNatFirewallControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNatFirewallControlPolicyResponse setBody(DeleteNatFirewallControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNatFirewallControlPolicyResponseBody getBody() {
        return this.body;
    }

}
