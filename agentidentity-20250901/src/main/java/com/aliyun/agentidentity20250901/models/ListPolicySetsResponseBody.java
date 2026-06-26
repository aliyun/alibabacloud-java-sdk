// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListPolicySetsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PolicySets")
    public java.util.List<ListPolicySetsResponseBodyPolicySets> policySets;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPolicySetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPolicySetsResponseBody self = new ListPolicySetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPolicySetsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPolicySetsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPolicySetsResponseBody setPolicySets(java.util.List<ListPolicySetsResponseBodyPolicySets> policySets) {
        this.policySets = policySets;
        return this;
    }
    public java.util.List<ListPolicySetsResponseBodyPolicySets> getPolicySets() {
        return this.policySets;
    }

    public ListPolicySetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPolicySetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPolicySetsResponseBodyPolicySets extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("PolicySetArn")
        public String policySetArn;

        @NameInMap("PolicySetName")
        public String policySetName;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListPolicySetsResponseBodyPolicySets build(java.util.Map<String, ?> map) throws Exception {
            ListPolicySetsResponseBodyPolicySets self = new ListPolicySetsResponseBodyPolicySets();
            return TeaModel.build(map, self);
        }

        public ListPolicySetsResponseBodyPolicySets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPolicySetsResponseBodyPolicySets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPolicySetsResponseBodyPolicySets setPolicySetArn(String policySetArn) {
            this.policySetArn = policySetArn;
            return this;
        }
        public String getPolicySetArn() {
            return this.policySetArn;
        }

        public ListPolicySetsResponseBodyPolicySets setPolicySetName(String policySetName) {
            this.policySetName = policySetName;
            return this;
        }
        public String getPolicySetName() {
            return this.policySetName;
        }

        public ListPolicySetsResponseBodyPolicySets setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
