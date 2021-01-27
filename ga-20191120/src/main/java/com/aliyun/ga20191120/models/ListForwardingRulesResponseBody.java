// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListForwardingRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("ForwardingRules")
    public java.util.List<ListForwardingRulesResponseBodyForwardingRules> forwardingRules;

    public static ListForwardingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListForwardingRulesResponseBody self = new ListForwardingRulesResponseBody();
        return TeaModel.build(map, self);
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

    public ListForwardingRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListForwardingRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListForwardingRulesResponseBody setForwardingRules(java.util.List<ListForwardingRulesResponseBodyForwardingRules> forwardingRules) {
        this.forwardingRules = forwardingRules;
        return this;
    }
    public java.util.List<ListForwardingRulesResponseBodyForwardingRules> getForwardingRules() {
        return this.forwardingRules;
    }

    public static class ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig extends TeaModel {
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

    public static class ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig extends TeaModel {
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

    public static class ListForwardingRulesResponseBodyForwardingRulesRuleConditions extends TeaModel {
        @NameInMap("RuleConditionType")
        public String ruleConditionType;

        @NameInMap("PathConfig")
        public ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig pathConfig;

        @NameInMap("HostConfig")
        public ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig hostConfig;

        public static ListForwardingRulesResponseBodyForwardingRulesRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRulesRuleConditions self = new ListForwardingRulesResponseBodyForwardingRulesRuleConditions();
            return TeaModel.build(map, self);
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleConditions setRuleConditionType(String ruleConditionType) {
            this.ruleConditionType = ruleConditionType;
            return this;
        }
        public String getRuleConditionType() {
            return this.ruleConditionType;
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleConditions setPathConfig(ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig pathConfig) {
            this.pathConfig = pathConfig;
            return this;
        }
        public ListForwardingRulesResponseBodyForwardingRulesRuleConditionsPathConfig getPathConfig() {
            return this.pathConfig;
        }

        public ListForwardingRulesResponseBodyForwardingRulesRuleConditions setHostConfig(ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }
        public ListForwardingRulesResponseBodyForwardingRulesRuleConditionsHostConfig getHostConfig() {
            return this.hostConfig;
        }

    }

    public static class ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples extends TeaModel {
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
        @NameInMap("Order")
        public Integer order;

        @NameInMap("RuleActionType")
        public String ruleActionType;

        @NameInMap("ForwardGroupConfig")
        public ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        public static ListForwardingRulesResponseBodyForwardingRulesRuleActions build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRulesRuleActions self = new ListForwardingRulesResponseBodyForwardingRulesRuleActions();
            return TeaModel.build(map, self);
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

        public ListForwardingRulesResponseBodyForwardingRulesRuleActions setForwardGroupConfig(ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public ListForwardingRulesResponseBodyForwardingRulesRuleActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

    }

    public static class ListForwardingRulesResponseBodyForwardingRules extends TeaModel {
        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ForwardingRuleId")
        public String forwardingRuleId;

        @NameInMap("ForwardingRuleName")
        public String forwardingRuleName;

        @NameInMap("ForwardingRuleStatus")
        public String forwardingRuleStatus;

        @NameInMap("RuleConditions")
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleConditions> ruleConditions;

        @NameInMap("RuleActions")
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleActions> ruleActions;

        @NameInMap("ListenerId")
        public String listenerId;

        public static ListForwardingRulesResponseBodyForwardingRules build(java.util.Map<String, ?> map) throws Exception {
            ListForwardingRulesResponseBodyForwardingRules self = new ListForwardingRulesResponseBodyForwardingRules();
            return TeaModel.build(map, self);
        }

        public ListForwardingRulesResponseBodyForwardingRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
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

        public ListForwardingRulesResponseBodyForwardingRules setRuleConditions(java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleConditions> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

        public ListForwardingRulesResponseBodyForwardingRules setRuleActions(java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleActions> ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public java.util.List<ListForwardingRulesResponseBodyForwardingRulesRuleActions> getRuleActions() {
            return this.ruleActions;
        }

        public ListForwardingRulesResponseBodyForwardingRules setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

    }

}
