// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.assettech20190930.models;

import com.aliyun.tea.*;

public class CreateIssueSymbolRoutingPolicyRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("InstrumentIDs")
    public String instrumentIDs;

    @NameInMap("DefaultPolicy")
    public Boolean defaultPolicy;

    public static CreateIssueSymbolRoutingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIssueSymbolRoutingPolicyRequest self = new CreateIssueSymbolRoutingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateIssueSymbolRoutingPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIssueSymbolRoutingPolicyRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public CreateIssueSymbolRoutingPolicyRequest setInstrumentIDs(String instrumentIDs) {
        this.instrumentIDs = instrumentIDs;
        return this;
    }
    public String getInstrumentIDs() {
        return this.instrumentIDs;
    }

    public CreateIssueSymbolRoutingPolicyRequest setDefaultPolicy(Boolean defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
        return this;
    }
    public Boolean getDefaultPolicy() {
        return this.defaultPolicy;
    }

}
