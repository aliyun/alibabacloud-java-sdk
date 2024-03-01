// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class BatchCopyVpcFirewallControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCopyVpcFirewallControlPolicyResponseBody body;

    public static BatchCopyVpcFirewallControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCopyVpcFirewallControlPolicyResponse self = new BatchCopyVpcFirewallControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public BatchCopyVpcFirewallControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCopyVpcFirewallControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCopyVpcFirewallControlPolicyResponse setBody(BatchCopyVpcFirewallControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCopyVpcFirewallControlPolicyResponseBody getBody() {
        return this.body;
    }

}
