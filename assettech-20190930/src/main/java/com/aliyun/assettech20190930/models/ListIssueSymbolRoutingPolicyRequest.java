// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.assettech20190930.models;

import com.aliyun.tea.*;

public class ListIssueSymbolRoutingPolicyRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Endpoint")
    public String endpoint;

    public static ListIssueSymbolRoutingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIssueSymbolRoutingPolicyRequest self = new ListIssueSymbolRoutingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ListIssueSymbolRoutingPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListIssueSymbolRoutingPolicyRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

}
