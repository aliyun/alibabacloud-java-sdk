// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.assettech20190930.models;

import com.aliyun.tea.*;

public class GetIssueSymbolRoutingPolicyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IssueSymbolRoutingPolicy")
    public GetIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicy issueSymbolRoutingPolicy;

    @NameInMap("Success")
    public Boolean success;

    public static GetIssueSymbolRoutingPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIssueSymbolRoutingPolicyResponseBody self = new GetIssueSymbolRoutingPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIssueSymbolRoutingPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIssueSymbolRoutingPolicyResponseBody setIssueSymbolRoutingPolicy(GetIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicy issueSymbolRoutingPolicy) {
        this.issueSymbolRoutingPolicy = issueSymbolRoutingPolicy;
        return this;
    }
    public GetIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicy getIssueSymbolRoutingPolicy() {
        return this.issueSymbolRoutingPolicy;
    }

    public GetIssueSymbolRoutingPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicy extends TeaModel {
        // id of issueSymbolRoutingPolicy
        @NameInMap("PolicyId")
        public Integer policyId;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("InstrumentIDs")
        public String instrumentIDs;

        @NameInMap("DefaultPolicy")
        public Boolean defaultPolicy;

        public static GetIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicy self = new GetIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicy();
            return TeaModel.build(map, self);
        }

        public GetIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicy setPolicyId(Integer policyId) {
            this.policyId = policyId;
            return this;
        }
        public Integer getPolicyId() {
            return this.policyId;
        }

        public GetIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicy setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicy setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicy setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicy setInstrumentIDs(String instrumentIDs) {
            this.instrumentIDs = instrumentIDs;
            return this;
        }
        public String getInstrumentIDs() {
            return this.instrumentIDs;
        }

        public GetIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicy setDefaultPolicy(Boolean defaultPolicy) {
            this.defaultPolicy = defaultPolicy;
            return this;
        }
        public Boolean getDefaultPolicy() {
            return this.defaultPolicy;
        }

    }

}
