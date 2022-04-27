// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListAuthorizationRulesResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("AuthorizationRules")
    public java.util.List<ListAuthorizationRulesResponseBodyAuthorizationRules> authorizationRules;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
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
        // 资源一级ID
        @NameInMap("AuthorizationRuleId")
        public String authorizationRuleId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Destination")
        public String destination;

        @NameInMap("DestinationType")
        public String destinationType;

        @NameInMap("Dns")
        public String dns;

        // 创建时间
        @NameInMap("Name")
        public String name;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("SourceCidr")
        public String sourceCidr;

        // 资源名称
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

        public ListAuthorizationRulesResponseBodyAuthorizationRules setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public ListAuthorizationRulesResponseBodyAuthorizationRules setDns(String dns) {
            this.dns = dns;
            return this;
        }
        public String getDns() {
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
