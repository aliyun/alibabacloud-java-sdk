// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListGroupAuthorizationRulesResponseBody extends TeaModel {
    @NameInMap("GroupAuthorizationRules")
    public java.util.List<ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules> groupAuthorizationRules;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListGroupAuthorizationRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupAuthorizationRulesResponseBody self = new ListGroupAuthorizationRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupAuthorizationRulesResponseBody setGroupAuthorizationRules(java.util.List<ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules> groupAuthorizationRules) {
        this.groupAuthorizationRules = groupAuthorizationRules;
        return this;
    }
    public java.util.List<ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules> getGroupAuthorizationRules() {
        return this.groupAuthorizationRules;
    }

    public ListGroupAuthorizationRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGroupAuthorizationRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGroupAuthorizationRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupAuthorizationRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules extends TeaModel {
        @NameInMap("AuthorizationRuleDescription")
        public String authorizationRuleDescription;

        @NameInMap("AuthorizationRuleId")
        public String authorizationRuleId;

        @NameInMap("AuthorizationRuleName")
        public String authorizationRuleName;

        @NameInMap("AuthorizationRuleStatus")
        public String authorizationRuleStatus;

        @NameInMap("Destination")
        public String destination;

        @NameInMap("DestinationType")
        public String destinationType;

        @NameInMap("IoTCloudConnectorGroupId")
        public String ioTCloudConnectorGroupId;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("SourceCidrs")
        public java.util.List<String> sourceCidrs;

        @NameInMap("Type")
        public String type;

        public static ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules build(java.util.Map<String, ?> map) throws Exception {
            ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules self = new ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules();
            return TeaModel.build(map, self);
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setAuthorizationRuleDescription(String authorizationRuleDescription) {
            this.authorizationRuleDescription = authorizationRuleDescription;
            return this;
        }
        public String getAuthorizationRuleDescription() {
            return this.authorizationRuleDescription;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setAuthorizationRuleId(String authorizationRuleId) {
            this.authorizationRuleId = authorizationRuleId;
            return this;
        }
        public String getAuthorizationRuleId() {
            return this.authorizationRuleId;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setAuthorizationRuleName(String authorizationRuleName) {
            this.authorizationRuleName = authorizationRuleName;
            return this;
        }
        public String getAuthorizationRuleName() {
            return this.authorizationRuleName;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setAuthorizationRuleStatus(String authorizationRuleStatus) {
            this.authorizationRuleStatus = authorizationRuleStatus;
            return this;
        }
        public String getAuthorizationRuleStatus() {
            return this.authorizationRuleStatus;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
            this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
            return this;
        }
        public String getIoTCloudConnectorGroupId() {
            return this.ioTCloudConnectorGroupId;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setSourceCidrs(java.util.List<String> sourceCidrs) {
            this.sourceCidrs = sourceCidrs;
            return this;
        }
        public java.util.List<String> getSourceCidrs() {
            return this.sourceCidrs;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
