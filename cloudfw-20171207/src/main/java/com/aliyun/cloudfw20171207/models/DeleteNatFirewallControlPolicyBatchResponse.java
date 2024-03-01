// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteNatFirewallControlPolicyBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNatFirewallControlPolicyBatchResponseBody body;

    public static DeleteNatFirewallControlPolicyBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatFirewallControlPolicyBatchResponse self = new DeleteNatFirewallControlPolicyBatchResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNatFirewallControlPolicyBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNatFirewallControlPolicyBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNatFirewallControlPolicyBatchResponse setBody(DeleteNatFirewallControlPolicyBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNatFirewallControlPolicyBatchResponseBody getBody() {
        return this.body;
    }

}
