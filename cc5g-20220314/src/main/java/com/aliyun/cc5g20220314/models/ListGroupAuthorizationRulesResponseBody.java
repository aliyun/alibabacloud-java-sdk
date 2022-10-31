// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListGroupAuthorizationRulesResponseBody extends TeaModel {
    @NameInMap("GroupAuthorizationRules")
    public java.util.List<ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules> groupAuthorizationRules;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

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

    public ListGroupAuthorizationRulesResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
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

    public ListGroupAuthorizationRulesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules extends TeaModel {
        @NameInMap("AuthorizationRuleId")
        public String authorizationRuleId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Destination")
        public String destination;

        @NameInMap("DestinationPort")
        public String destinationPort;

        @NameInMap("DestinationType")
        public String destinationType;

        @NameInMap("Dns")
        public Boolean dns;

        @NameInMap("Name")
        public String name;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("SourceCidr")
        public String sourceCidr;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules build(java.util.Map<String, ?> map) throws Exception {
            ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules self = new ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules();
            return TeaModel.build(map, self);
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setAuthorizationRuleId(String authorizationRuleId) {
            this.authorizationRuleId = authorizationRuleId;
            return this;
        }
        public String getAuthorizationRuleId() {
            return this.authorizationRuleId;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setDestinationPort(String destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }
        public String getDestinationPort() {
            return this.destinationPort;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setDns(Boolean dns) {
            this.dns = dns;
            return this;
        }
        public Boolean getDns() {
            return this.dns;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setSourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            return this;
        }
        public String getSourceCidr() {
            return this.sourceCidr;
        }

        public ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
