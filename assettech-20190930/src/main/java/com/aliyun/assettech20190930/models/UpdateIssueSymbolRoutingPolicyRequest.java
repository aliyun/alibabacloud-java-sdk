// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.assettech20190930.models;

import com.aliyun.tea.*;

public class UpdateIssueSymbolRoutingPolicyRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("PolicyId")
    public Integer policyId;

    @NameInMap("InstrumentIDs")
    public String instrumentIDs;

    @NameInMap("DefaultPolicy")
    public Boolean defaultPolicy;

    public static UpdateIssueSymbolRoutingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIssueSymbolRoutingPolicyRequest self = new UpdateIssueSymbolRoutingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIssueSymbolRoutingPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIssueSymbolRoutingPolicyRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public UpdateIssueSymbolRoutingPolicyRequest setPolicyId(Integer policyId) {
        this.policyId = policyId;
        return this;
    }
    public Integer getPolicyId() {
        return this.policyId;
    }

    public UpdateIssueSymbolRoutingPolicyRequest setInstrumentIDs(String instrumentIDs) {
        this.instrumentIDs = instrumentIDs;
        return this;
    }
    public String getInstrumentIDs() {
        return this.instrumentIDs;
    }

    public UpdateIssueSymbolRoutingPolicyRequest setDefaultPolicy(Boolean defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
        return this;
    }
    public Boolean getDefaultPolicy() {
        return this.defaultPolicy;
    }

}
