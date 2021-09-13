// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.assettech20190930.models;

import com.aliyun.tea.*;

public class ListIssueSymbolRoutingPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IssueSymbolRoutingPolicies")
    public java.util.List<ListIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicies> issueSymbolRoutingPolicies;

    @NameInMap("Success")
    public Boolean success;

    public static ListIssueSymbolRoutingPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIssueSymbolRoutingPolicyResponseBody self = new ListIssueSymbolRoutingPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIssueSymbolRoutingPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIssueSymbolRoutingPolicyResponseBody setIssueSymbolRoutingPolicies(java.util.List<ListIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicies> issueSymbolRoutingPolicies) {
        this.issueSymbolRoutingPolicies = issueSymbolRoutingPolicies;
        return this;
    }
    public java.util.List<ListIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicies> getIssueSymbolRoutingPolicies() {
        return this.issueSymbolRoutingPolicies;
    }

    public ListIssueSymbolRoutingPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicies extends TeaModel {
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("PolicyId")
        public Integer policyId;

        @NameInMap("DefaultPolicy")
        public Boolean defaultPolicy;

        @NameInMap("InstrumentIDs")
        public String instrumentIDs;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("CreateTime")
        public Long createTime;

        public static ListIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicies self = new ListIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicies();
            return TeaModel.build(map, self);
        }

        public ListIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicies setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicies setPolicyId(Integer policyId) {
            this.policyId = policyId;
            return this;
        }
        public Integer getPolicyId() {
            return this.policyId;
        }

        public ListIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicies setDefaultPolicy(Boolean defaultPolicy) {
            this.defaultPolicy = defaultPolicy;
            return this;
        }
        public Boolean getDefaultPolicy() {
            return this.defaultPolicy;
        }

        public ListIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicies setInstrumentIDs(String instrumentIDs) {
            this.instrumentIDs = instrumentIDs;
            return this;
        }
        public String getInstrumentIDs() {
            return this.instrumentIDs;
        }

        public ListIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicies setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListIssueSymbolRoutingPolicyResponseBodyIssueSymbolRoutingPolicies setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

    }

}
