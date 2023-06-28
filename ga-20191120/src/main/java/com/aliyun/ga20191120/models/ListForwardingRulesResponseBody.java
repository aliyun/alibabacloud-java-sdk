// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListForwardingRulesResponseBody extends TeaModel {
    /**
     * <p>The information about the forwarding rules.</p>
     */
    @NameInMap("ForwardingRules")
    public java.util.List<ListForwardingRulesResponseBodyForwardingRules> forwardingRules;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is not returned, it indicates that no additional results exist.</p>
     * <p>*   If **NextToken** is returned, the value is the token that is used for the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListForwardingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListForwardingRulesResponseBody self = new ListForwardingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListForwardingRulesResponseBody setForwardingRules(java.util.List<ListForwardingRulesResponseBodyForwardingRules> forwardingRules) {
        this.forwardingRules = forwardingRules;
        return this;
    }
    public java.util.List<ListForwardingRulesResponseBodyForwardingRules> getForwardingRules() {
        return this.forwardingRules;
    }

    public ListForwardingRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListForwardingRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListForwardingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListForwardingRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The ID of the endpoint group.</p>
         * <br>
         * <p>>  For GA instances created after July 12, 2022, all forwarding condition types and forwarding action types are supported. We recommend that you call **RuleActionType** and **RuleActionValue** to query forwarding actions.</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        public static ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples self = new ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

    }

    public static class ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig extends TeaModel {
        /**
         * <p>The information about the endpoint group.</p>
         * <br>
         * <p>>  For GA instances created after July 12, 2022, all forwarding condition types and forwarding action types are supported. We recommend that you call **RuleActionType** and **RuleActionValue** to query forwarding actions.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig self = new ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig setServerGroupTuples(java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class ListForwardingRulesResponseBodyForwardingRulesRuleActions extends TeaModel {
        /**
         * <p>The configuration of the forwarding action.</p>
         * <br>
         * <p>>  For GA instances created after July 12, 2022, all forwarding condition types and forwarding action types are supported. We recommend that you call **RuleActionType** and **RuleActionValue** to query forwarding actions.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The forwarding priority.</p>
         * <br>
         * <p>>  This parameter does not take effect.</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The type of the forwarding action. Valid values:</p>
         * <br>
         * <p>*   **ForwardGroup**: forwards a request.</p>
         * <p>*   **Redirect:** redirects a request.</p>
         * <p>*   **FixResponse**: returns a fixed response.</p>
         * <p>*   **Rewrite:** rewrites a request.</p>
         * <p>*   **AddHeader**: adds a header to a request.</p>
         * <p>*   **RemoveHeaderConfig**: deletes the header of a request.</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The value of the forwarding action type.</p>
         * <br>
         * <p>Different JSON strings are returned based on the **RuleActionType** parameter.</p>
         * <br>
         * <p>*   If **RuleActionType** is set to **ForwardGroup**, the information about a virtual endpoint group is returned. Configuration information:</p>
         * <br>
         * <p>    *   `type`: the type of the resource that is returned. The value is `endpointgroup`.</p>
         * <p>    *   `value`: the ID of the virtual endpoint group that is returned.</p>
         * <br>
         * <p>*   If **RuleActionType** is set to **Redirect**, the redirect configuration is returned. Configuration information:</p>
         * <br>
         * <p>    *   `protocol`: the protocol of requests after the requests are redirected.</p>
         * <p>    *   `domain`: the domain name to which requests are redirected.</p>
         * <p>    *   `port`: the port to which requests are redirected.</p>
         * <p>    *   `path`: the path to which requests are redirected.</p>
         * <p>    *   `query`: the query string to which requests are redirected.</p>
         * <p>    *   `code`: the redirect code.</p>
         * <br>
         * <p>*   If **RuleActionType** is set to **FixResponse**, the information about the fixed response that you configured is returned. Configuration information:</p>
         * <br>
         * <p>    *   `code`: the HTTP status code that is returned.</p>
         * <p>    *   `type`: the type of the response content that is returned.</p>
         * <p>    *   `content`: the response content that is returned.</p>
         * <br>
         * <p>*   If **RuleActionType** is set to **AddHeader**, the information about the HTTP header that is added is returned. Configuration information:</p>
         * <br>
         * <p>    *   `name`: the name of the HTTP header that is returned.</p>
         * <p>    *   `type`: the content type of the HTTP header that is returned.</p>
         * <p>    *   `value`: the content of the HTTP header that is returned.</p>
         * <br>
         * <p>*   If **RuleActionType** is set to **RemoveHeader**, the information about the HTTP header that is deleted is returned.</p>
         * <br>
         * <p>*   If **RuleActionType** is set to **Rewrite**, the rewrite configuration is returned. Configuration information:</p>
         * <br>
         * <p>    *   `domain`: the domain name to which requests are redirected.</p>
         * <p>    *   `path`: the path to which requests are redirected.</p>
         * <p>    *   `query`: the query string to which requests are redirected.</p>
         */
        @NameInMap("RuleActionValue")
        public String ruleActionValue;

        public static ListForwardingRulesResponseBodyForwardingRulesRuleActions build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRulesRuleActions self = new ListForwardingRulesResponseBodyForwardingRulesRuleActions();
            return TeaModel.build(map, self);
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleActions setForwardGroupConfig(ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleActions setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleActions setRuleActionType(String ruleActionType) {
            this.ruleActionType = ruleActionType;
            return this;
        }
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleActions setRuleActionValue(String ruleActionValue) {
            this.ruleActionValue = ruleActionValue;
            return this;
        }
        public String getRuleActionValue() {
            return this.ruleActionValue;
        }

    }

    public static class ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig extends TeaModel {
        /**
         * <p>The domain name.</p>
         * <br>
         * <p>The domain name must be 3 to 128 characters in length, and can contain letters, digits, hyphens (-), and periods (.). Supported wildcard characters are asterisks (\*) and question marks (?).</p>
         * <br>
         * <p>>  For GA instances created after July 12, 2022, all forwarding condition types and forwarding action types are supported. We recommend that you use **RuleConditionType** and **RuleConditionValue** to query forwarding conditions.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig self = new ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig();
            return TeaModel.build(map, self);
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig extends TeaModel {
        /**
         * <p>The path.</p>
         * <br>
         * <p>The path must be 1 to 128 characters in length and must start with a forward slash (/). The path can contain only letters, digits, and the following special characters: $ - \_ . + / & ~ @ : \". Supported wildcard characters are asterisks (\*) and question marks (?).</p>
         * <br>
         * <p>>  For GA instances created after July 12, 2022, all forwarding condition types and forwarding action types are supported. We recommend that you use **RuleConditionType** and **RuleConditionValue** to query forwarding conditions.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig self = new ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig();
            return TeaModel.build(map, self);
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListForwardingRulesResponseBodyForwardingRulesRuleConditions extends TeaModel {
        /**
         * <p>The configuration of the domain name.</p>
         * <br>
         * <p>>  For GA instances created after July 12, 2022, all forwarding condition types and forwarding action types are supported. We recommend that you use **RuleConditionType** and **RuleConditionValue** to query forwarding conditions.</p>
         */
        @NameInMap("HostConfig")
        public ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig hostConfig;

        /**
         * <p>The configuration of the path.</p>
         * <br>
         * <p>>  For GA instances created after July 12, 2022, all forwarding condition types and forwarding action types are supported. We recommend that you use **RuleConditionType** and **RuleConditionValue** to query forwarding conditions.</p>
         */
        @NameInMap("PathConfig")
        public ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig pathConfig;

        /**
         * <p>The type of the forwarding condition.</p>
         * <br>
         * <p>*   **Host**: domain name</p>
         * <p>*   **Path**: path</p>
         * <p>*   **RequestHeader**: HTTP header</p>
         * <p>*   **Query**: query string</p>
         * <p>*   **Method**: HTTP method</p>
         * <p>*   **Cookie**: cookie</p>
         * <p>*   **SourceIP**: source IP address</p>
         */
        @NameInMap("RuleConditionType")
        public String ruleConditionType;

        /**
         * <p>The value of the forwarding condition type.</p>
         * <br>
         * <p>Different JSON strings are returned based on the **RuleConditionType** parameter.</p>
         * <br>
         * <p>*   If **RuleConditionType** is set to **Host**, a domain name condition is returned. If multiple domain names are returned in a forwarding condition, the relationship between the domain names is OR.</p>
         * <p>*   If **RuleConditionType** is set to **Path**, a path condition is returned. If multiple forwarding conditions whose types are path are returned in a forwarding rule, the relationship between the forwarding conditions is OR. If multiple paths are returned in a forwarding condition, the relationship between the paths is OR.</p>
         * <p>*   If **RuleConditionType** is set to **RequestHeader**, an HTTP header condition that consists of key-value pairs is returned.</p>
         * <p>*   If **RuleConditionType** is set to **Query**, a query string condition that consists of key-value pairs is returned.</p>
         * <p>*   If **RuleConditionType** is set to **Method**, an HTTP method condition is returned.</p>
         * <p>*   If **RuleConditionType** is set to **Cookie**, a cookie condition that consists of key-value pairs is returned.</p>
         * <p>*   If **RuleConditionType** is set to **SourceIP**, a source IP address condition is returned. If multiple source IP addresses are returned in a forwarding condition, the relationship between the source IP addresses is OR.</p>
         */
        @NameInMap("RuleConditionValue")
        public String ruleConditionValue;

        public static ListForwardingRulesResponseBodyForwardingRulesRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRulesRuleConditions self = new ListForwardingRulesResponseBodyForwardingRulesRuleConditions();
            return TeaModel.build(map, self);
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleConditions setHostConfig(ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }
        public ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig getHostConfig() {
            return this.hostConfig;
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleConditions setPathConfig(ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig pathConfig) {
            this.pathConfig = pathConfig;
            return this;
        }
        public ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig getPathConfig() {
            return this.pathConfig;
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleConditions setRuleConditionType(String ruleConditionType) {
            this.ruleConditionType = ruleConditionType;
            return this;
        }
        public String getRuleConditionType() {
            return this.ruleConditionType;
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleConditions setRuleConditionValue(String ruleConditionValue) {
            this.ruleConditionValue = ruleConditionValue;
            return this;
        }
        public String getRuleConditionValue() {
            return this.ruleConditionValue;
        }

    }

    public static class ListForwardingRulesResponseBodyForwardingRules extends TeaModel {
        /**
         * <p>The direction in which the forwarding rule takes effect.</p>
         * <br>
         * <p>By default, **request** is returned, which indicates that the forwarding rule takes effect on requests.</p>
         */
        @NameInMap("ForwardingRuleDirection")
        public String forwardingRuleDirection;

        /**
         * <p>The ID of the forwarding rule.</p>
         */
        @NameInMap("ForwardingRuleId")
        public String forwardingRuleId;

        /**
         * <p>The name of the forwarding rule.</p>
         */
        @NameInMap("ForwardingRuleName")
        public String forwardingRuleName;

        /**
         * <p>The status of the forwarding rule.</p>
         * <br>
         * <p>*   **active**: The forwarding rule is normal.</p>
         * <p>*   **configuring**: The forwarding rule is being modified.</p>
         * <p>*   **deleting**: The forwarding rule is being deleted.</p>
         */
        @NameInMap("ForwardingRuleStatus")
        public String forwardingRuleStatus;

        /**
         * <p>The ID of the listener.</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The priority of the forwarding rule.</p>
         * <br>
         * <p>Valid values: **1** to **10000**. A lower value indicates a higher priority.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The forwarding action.</p>
         */
        @NameInMap("RuleActions")
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleActions> ruleActions;

        /**
         * <p>The forwarding conditions.</p>
         */
        @NameInMap("RuleConditions")
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleConditions> ruleConditions;

        public static ListForwardingRulesResponseBodyForwardingRules build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRules self = new ListForwardingRulesResponseBodyForwardingRules();
            return TeaModel.build(map, self);
        }

        public ListForwardingRulesResponseBodyForwardingRules setForwardingRuleDirection(String forwardingRuleDirection) {
            this.forwardingRuleDirection = forwardingRuleDirection;
            return this;
        }
        public String getForwardingRuleDirection() {
            return this.forwardingRuleDirection;
        }

        public ListForwardingRulesResponseBodyForwardingRules setForwardingRuleId(String forwardingRuleId) {
            this.forwardingRuleId = forwardingRuleId;
            return this;
        }
        public String getForwardingRuleId() {
            return this.forwardingRuleId;
        }

        public ListForwardingRulesResponseBodyForwardingRules setForwardingRuleName(String forwardingRuleName) {
            this.forwardingRuleName = forwardingRuleName;
            return this;
        }
        public String getForwardingRuleName() {
            return this.forwardingRuleName;
        }

        public ListForwardingRulesResponseBodyForwardingRules setForwardingRuleStatus(String forwardingRuleStatus) {
            this.forwardingRuleStatus = forwardingRuleStatus;
            return this;
        }
        public String getForwardingRuleStatus() {
            return this.forwardingRuleStatus;
        }

        public ListForwardingRulesResponseBodyForwardingRules setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListForwardingRulesResponseBodyForwardingRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListForwardingRulesResponseBodyForwardingRules setRuleActions(java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleActions> ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleActions> getRuleActions() {
            return this.ruleActions;
        }

        public ListForwardingRulesResponseBodyForwardingRules setRuleConditions(java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleConditions> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

    }

}
