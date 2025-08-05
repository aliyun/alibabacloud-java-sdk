// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteDnsFirewallPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDnsFirewallPolicyResponseBody body;

    public static DeleteDnsFirewallPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnsFirewallPolicyResponse self = new DeleteDnsFirewallPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDnsFirewallPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDnsFirewallPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDnsFirewallPolicyResponse setBody(DeleteDnsFirewallPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDnsFirewallPolicyResponseBody getBody() {
        return this.body;
    }

}
