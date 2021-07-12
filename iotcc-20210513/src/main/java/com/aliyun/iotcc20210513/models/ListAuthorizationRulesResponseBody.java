// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListAuthorizationRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("AuthorizationRules")
    public java.util.List<ListAuthorizationRulesResponseBodyAuthorizationRules> authorizationRules;

    public static ListAuthorizationRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationRulesResponseBody self = new ListAuthorizationRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizationRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAuthorizationRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuthorizationRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAuthorizationRulesResponseBody setAuthorizationRules(java.util.List<ListAuthorizationRulesResponseBodyAuthorizationRules> authorizationRules) {
        this.authorizationRules = authorizationRules;
        return this;
    }
    public java.util.List<ListAuthorizationRulesResponseBodyAuthorizationRules> getAuthorizationRules() {
        return this.authorizationRules;
    }

    public static class ListAuthorizationRulesResponseBodyAuthorizationRules extends TeaModel {
        @NameInMap("IoTCloudConnectorId")
        public String ioTCloudConnectorId;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("AuthorizationRuleStatus")
        public String authorizationRuleStatus;

        @NameInMap("SourceCidrs")
        public java.util.List<String> sourceCidrs;

        @NameInMap("DestinationType")
        public String destinationType;

        @NameInMap("Destination")
        public String destination;

        @NameInMap("AuthorizationRuleName")
        public String authorizationRuleName;

        @NameInMap("AuthorizationRuleDescription")
        public String authorizationRuleDescription;

        @NameInMap("AuthorizationRuleId")
        public String authorizationRuleId;

        public static ListAuthorizationRulesResponseBodyAuthorizationRules build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizationRulesResponseBodyAuthorizationRules self = new ListAuthorizationRulesResponseBodyAuthorizationRules();
            return TeaModel.build(map, self);
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setIoTCloudConnectorId(String ioTCloudConnectorId) {
            this.ioTCloudConnectorId = ioTCloudConnectorId;
            return this;
        }
        public String getIoTCloudConnectorId() {
            return this.ioTCloudConnectorId;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setAuthorizationRuleStatus(String authorizationRuleStatus) {
            this.authorizationRuleStatus = authorizationRuleStatus;
            return this;
        }
        public String getAuthorizationRuleStatus() {
            return this.authorizationRuleStatus;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setSourceCidrs(java.util.List<String> sourceCidrs) {
            this.sourceCidrs = sourceCidrs;
            return this;
        }
        public java.util.List<String> getSourceCidrs() {
            return this.sourceCidrs;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setAuthorizationRuleName(String authorizationRuleName) {
            this.authorizationRuleName = authorizationRuleName;
            return this;
        }
        public String getAuthorizationRuleName() {
            return this.authorizationRuleName;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setAuthorizationRuleDescription(String authorizationRuleDescription) {
            this.authorizationRuleDescription = authorizationRuleDescription;
            return this;
        }
        public String getAuthorizationRuleDescription() {
            return this.authorizationRuleDescription;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setAuthorizationRuleId(String authorizationRuleId) {
            this.authorizationRuleId = authorizationRuleId;
            return this;
        }
        public String getAuthorizationRuleId() {
            return this.authorizationRuleId;
        }

    }

}
