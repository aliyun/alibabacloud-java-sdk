// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListPoliciesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Policies")
    public java.util.List<ListPoliciesResponseBodyPolicies> policies;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesResponseBody self = new ListPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPoliciesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPoliciesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPoliciesResponseBody setPolicies(java.util.List<ListPoliciesResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<ListPoliciesResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public ListPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPoliciesResponseBodyPolicies extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Definition")
        public Definition definition;

        @NameInMap("Description")
        public String description;

        @NameInMap("PolicyArn")
        public String policyArn;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PolicySetName")
        public String policySetName;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListPoliciesResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesResponseBodyPolicies self = new ListPoliciesResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public ListPoliciesResponseBodyPolicies setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPoliciesResponseBodyPolicies setDefinition(Definition definition) {
            this.definition = definition;
            return this;
        }
        public Definition getDefinition() {
            return this.definition;
        }

        public ListPoliciesResponseBodyPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPoliciesResponseBodyPolicies setPolicyArn(String policyArn) {
            this.policyArn = policyArn;
            return this;
        }
        public String getPolicyArn() {
            return this.policyArn;
        }

        public ListPoliciesResponseBodyPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPoliciesResponseBodyPolicies setPolicySetName(String policySetName) {
            this.policySetName = policySetName;
            return this;
        }
        public String getPolicySetName() {
            return this.policySetName;
        }

        public ListPoliciesResponseBodyPolicies setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
