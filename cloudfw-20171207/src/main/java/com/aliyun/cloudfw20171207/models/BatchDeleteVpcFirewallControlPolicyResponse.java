// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class BatchDeleteVpcFirewallControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteVpcFirewallControlPolicyResponseBody body;

    public static BatchDeleteVpcFirewallControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteVpcFirewallControlPolicyResponse self = new BatchDeleteVpcFirewallControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteVpcFirewallControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteVpcFirewallControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteVpcFirewallControlPolicyResponse setBody(BatchDeleteVpcFirewallControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteVpcFirewallControlPolicyResponseBody getBody() {
        return this.body;
    }

}
