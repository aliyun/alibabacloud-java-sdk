// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateNatFirewallControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNatFirewallControlPolicyResponseBody body;

    public static CreateNatFirewallControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNatFirewallControlPolicyResponse self = new CreateNatFirewallControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateNatFirewallControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNatFirewallControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNatFirewallControlPolicyResponse setBody(CreateNatFirewallControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNatFirewallControlPolicyResponseBody getBody() {
        return this.body;
    }

}
