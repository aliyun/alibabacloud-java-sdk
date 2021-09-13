// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.assettech20190930.models;

import com.aliyun.tea.*;

public class CreateIssueSymbolRoutingPolicyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PolicyId")
    public Integer policyId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateIssueSymbolRoutingPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIssueSymbolRoutingPolicyResponseBody self = new CreateIssueSymbolRoutingPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIssueSymbolRoutingPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIssueSymbolRoutingPolicyResponseBody setPolicyId(Integer policyId) {
        this.policyId = policyId;
        return this;
    }
    public Integer getPolicyId() {
        return this.policyId;
    }

    public CreateIssueSymbolRoutingPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
