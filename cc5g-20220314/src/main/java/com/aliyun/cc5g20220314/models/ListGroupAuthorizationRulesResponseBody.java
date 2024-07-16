// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListGroupAuthorizationRulesResponseBody extends TeaModel {
    @NameInMap("GroupAuthorizationRules")
    public java.util.List<ListGroupAuthorizationRulesResponseBodyGroupAuthorizationRules> groupAuthorizationRules;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <strong>example:</strong>
     * <p>iou001238joojjaere</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1651FBB6-4FBF-49FF-A9F5-DF5D696C7EC6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>ar5gg-y5g4rp2w1tl1w7zg59</p>
         */
        @NameInMap("AuthorizationRuleId")
        public String authorizationRuleId;

        /**
         * <strong>example:</strong>
         * <p>2022-06-21 15:27:24</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>ar5gg-test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>47.103.184.100/32</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <strong>example:</strong>
         * <p>0-65535</p>
         */
        @NameInMap("DestinationPort")
        public String destinationPort;

        /**
         * <strong>example:</strong>
         * <p>Cidr</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Dns")
        public Boolean dns;

        /**
         * <p>代表创建时间的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Permit</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("SourceCidr")
        public String sourceCidr;

        /**
         * <p>代表资源名称的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Default</p>
         */
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
