// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateForwardingRulesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("ForwardingRules")
    public java.util.List<CreateForwardingRulesRequestForwardingRules> forwardingRules;

    public static CreateForwardingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardingRulesRequest self = new CreateForwardingRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateForwardingRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateForwardingRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateForwardingRulesRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateForwardingRulesRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public CreateForwardingRulesRequest setForwardingRules(java.util.List<CreateForwardingRulesRequestForwardingRules> forwardingRules) {
        this.forwardingRules = forwardingRules;
        return this;
    }
    public java.util.List<CreateForwardingRulesRequestForwardingRules> getForwardingRules() {
        return this.forwardingRules;
    }

    public static class CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig self = new CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig self = new CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateForwardingRulesRequestForwardingRulesRuleConditions extends TeaModel {
        @NameInMap("RuleConditionType")
        public String ruleConditionType;

        @NameInMap("PathConfig")
        public CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig pathConfig;

        @NameInMap("HostConfig")
        public CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig hostConfig;

        public static CreateForwardingRulesRequestForwardingRulesRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesRequestForwardingRulesRuleConditions self = new CreateForwardingRulesRequestForwardingRulesRuleConditions();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesRequestForwardingRulesRuleConditions setRuleConditionType(String ruleConditionType) {
            this.ruleConditionType = ruleConditionType;
            return this;
        }
        public String getRuleConditionType() {
            return this.ruleConditionType;
        }

        public CreateForwardingRulesRequestForwardingRulesRuleConditions setPathConfig(CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig pathConfig) {
            this.pathConfig = pathConfig;
            return this;
        }
        public CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig getPathConfig() {
            return this.pathConfig;
        }

        public CreateForwardingRulesRequestForwardingRulesRuleConditions setHostConfig(CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }
        public CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig getHostConfig() {
            return this.hostConfig;
        }

    }

    public static class CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        public static CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples self = new CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

    }

    public static class CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig extends TeaModel {
        @NameInMap("ServerGroupTuples")
        public java.util.List<CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig self = new CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig setServerGroupTuples(java.util.List<CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class CreateForwardingRulesRequestForwardingRulesRuleActions extends TeaModel {
        @NameInMap("Order")
        public Integer order;

        @NameInMap("RuleActionType")
        public String ruleActionType;

        @NameInMap("ForwardGroupConfig")
        public CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        public static CreateForwardingRulesRequestForwardingRulesRuleActions build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesRequestForwardingRulesRuleActions self = new CreateForwardingRulesRequestForwardingRulesRuleActions();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesRequestForwardingRulesRuleActions setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public CreateForwardingRulesRequestForwardingRulesRuleActions setRuleActionType(String ruleActionType) {
            this.ruleActionType = ruleActionType;
            return this;
        }
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        public CreateForwardingRulesRequestForwardingRulesRuleActions setForwardGroupConfig(CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

    }

    public static class CreateForwardingRulesRequestForwardingRules extends TeaModel {
        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("RuleConditions")
        public java.util.List<CreateForwardingRulesRequestForwardingRulesRuleConditions> ruleConditions;

        @NameInMap("RuleActions")
        public java.util.List<CreateForwardingRulesRequestForwardingRulesRuleActions> ruleActions;

        @NameInMap("ForwardingRuleName")
        public String forwardingRuleName;

        public static CreateForwardingRulesRequestForwardingRules build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesRequestForwardingRules self = new CreateForwardingRulesRequestForwardingRules();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesRequestForwardingRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateForwardingRulesRequestForwardingRules setRuleConditions(java.util.List<CreateForwardingRulesRequestForwardingRulesRuleConditions> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }
        public java.util.List<CreateForwardingRulesRequestForwardingRulesRuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

        public CreateForwardingRulesRequestForwardingRules setRuleActions(java.util.List<CreateForwardingRulesRequestForwardingRulesRuleActions> ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public java.util.List<CreateForwardingRulesRequestForwardingRulesRuleActions> getRuleActions() {
            return this.ruleActions;
        }

        public CreateForwardingRulesRequestForwardingRules setForwardingRuleName(String forwardingRuleName) {
            this.forwardingRuleName = forwardingRuleName;
            return this;
        }
        public String getForwardingRuleName() {
            return this.forwardingRuleName;
        }

    }

}
