// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListAuthorizationRulesResponseBody extends TeaModel {
    @NameInMap("AuthorizationRules")
    public java.util.List<ListAuthorizationRulesResponseBodyAuthorizationRules> authorizationRules;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    public static ListAuthorizationRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationRulesResponseBody self = new ListAuthorizationRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationRulesResponseBody setAuthorizationRules(java.util.List<ListAuthorizationRulesResponseBodyAuthorizationRules> authorizationRules) {
        this.authorizationRules = authorizationRules;
        return this;
    }
    public java.util.List<ListAuthorizationRulesResponseBodyAuthorizationRules> getAuthorizationRules() {
        return this.authorizationRules;
    }

    public ListAuthorizationRulesResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListAuthorizationRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuthorizationRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizationRulesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthorizationRulesResponseBodyAuthorizationRules extends TeaModel {
        /**
         * <p>代表资源一级ID的资源属性字段</p>
         */
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

        /**
         * <p>代表创建时间的资源属性字段</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("SourceCidr")
        public String sourceCidr;

        /**
         * <p>代表资源名称的资源属性字段</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ListAuthorizationRulesResponseBodyAuthorizationRules build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizationRulesResponseBodyAuthorizationRules self = new ListAuthorizationRulesResponseBodyAuthorizationRules();
            return TeaModel.build(map, self);
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setAuthorizationRuleId(String authorizationRuleId) {
            this.authorizationRuleId = authorizationRuleId;
            return this;
        }
        public String getAuthorizationRuleId() {
            return this.authorizationRuleId;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setDestinationPort(String destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }
        public String getDestinationPort() {
            return this.destinationPort;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setDns(Boolean dns) {
            this.dns = dns;
            return this;
        }
        public Boolean getDns() {
            return this.dns;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setSourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            return this;
        }
        public String getSourceCidr() {
            return this.sourceCidr;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
