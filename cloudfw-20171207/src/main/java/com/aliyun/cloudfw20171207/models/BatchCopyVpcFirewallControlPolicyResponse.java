// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class BatchCopyVpcFirewallControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchCopyVpcFirewallControlPolicyResponse setBody(BatchCopyVpcFirewallControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCopyVpcFirewallControlPolicyResponseBody getBody() {
        return this.body;
    }

}
