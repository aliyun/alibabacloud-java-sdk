// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.assettech20190930.models;

import com.aliyun.tea.*;

public class DeleteIssueSymbolRoutingPolicyRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("PolicyId")
    public Integer policyId;

    public static DeleteIssueSymbolRoutingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIssueSymbolRoutingPolicyRequest self = new DeleteIssueSymbolRoutingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIssueSymbolRoutingPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteIssueSymbolRoutingPolicyRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public DeleteIssueSymbolRoutingPolicyRequest setPolicyId(Integer policyId) {
        this.policyId = policyId;
        return this;
    }
    public Integer getPolicyId() {
        return this.policyId;
    }

}
