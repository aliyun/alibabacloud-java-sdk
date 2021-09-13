// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.assettech20190930.models;

import com.aliyun.tea.*;

public class GetIssueSymbolRoutingPolicyRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("PolicyId")
    public Integer policyId;

    public static GetIssueSymbolRoutingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIssueSymbolRoutingPolicyRequest self = new GetIssueSymbolRoutingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetIssueSymbolRoutingPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetIssueSymbolRoutingPolicyRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public GetIssueSymbolRoutingPolicyRequest setPolicyId(Integer policyId) {
        this.policyId = policyId;
        return this;
    }
    public Integer getPolicyId() {
        return this.policyId;
    }

}
