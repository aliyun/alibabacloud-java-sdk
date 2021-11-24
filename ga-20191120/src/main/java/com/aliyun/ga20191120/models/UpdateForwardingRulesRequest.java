// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateForwardingRulesRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ForwardingRules")
    public java.util.List<UpdateForwardingRulesRequestForwardingRules> forwardingRules;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateForwardingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateForwardingRulesRequest self = new UpdateForwardingRulesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateForwardingRulesRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public UpdateForwardingRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateForwardingRulesRequest setForwardingRules(java.util.List<UpdateForwardingRulesRequestForwardingRules> forwardingRules) {
        this.forwardingRules = forwardingRules;
        return this;
    }
    public java.util.List<UpdateForwardingRulesRequestForwardingRules> getForwardingRules() {
        return this.forwardingRules;
    }

    public UpdateForwardingRulesRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public UpdateForwardingRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        public static UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples self = new UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig extends TeaModel {
        @NameInMap("ServerGroupTuples")
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig self = new UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig setServerGroupTuples(java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleActions extends TeaModel {
        @NameInMap("ForwardGroupConfig")
        public UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("RuleActionType")
        public String ruleActionType;

        public static UpdateForwardingRulesRequestForwardingRulesRuleActions build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleActions self = new UpdateForwardingRulesRequestForwardingRulesRuleActions();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleActions setForwardGroupConfig(UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleActions setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleActions setRuleActionType(String ruleActionType) {
            this.ruleActionType = ruleActionType;
            return this;
        }
        public String getRuleActionType() {
            return this.ruleActionType;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig self = new UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig self = new UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleConditions extends TeaModel {
        @NameInMap("HostConfig")
        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig hostConfig;

        @NameInMap("PathConfig")
        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig pathConfig;

        @NameInMap("RuleConditionType")
        public String ruleConditionType;

        public static UpdateForwardingRulesRequestForwardingRulesRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleConditions self = new UpdateForwardingRulesRequestForwardingRulesRuleConditions();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleConditions setHostConfig(UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }
        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig getHostConfig() {
            return this.hostConfig;
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleConditions setPathConfig(UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig pathConfig) {
            this.pathConfig = pathConfig;
            return this;
        }
        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig getPathConfig() {
            return this.pathConfig;
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleConditions setRuleConditionType(String ruleConditionType) {
            this.ruleConditionType = ruleConditionType;
            return this;
        }
        public String getRuleConditionType() {
            return this.ruleConditionType;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRules extends TeaModel {
        @NameInMap("ForwardingRuleId")
        public String forwardingRuleId;

        @NameInMap("ForwardingRuleName")
        public String forwardingRuleName;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("RuleActions")
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActions> ruleActions;

        @NameInMap("RuleConditions")
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleConditions> ruleConditions;

        public static UpdateForwardingRulesRequestForwardingRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRules self = new UpdateForwardingRulesRequestForwardingRules();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRules setForwardingRuleId(String forwardingRuleId) {
            this.forwardingRuleId = forwardingRuleId;
            return this;
        }
        public String getForwardingRuleId() {
            return this.forwardingRuleId;
        }

        public UpdateForwardingRulesRequestForwardingRules setForwardingRuleName(String forwardingRuleName) {
            this.forwardingRuleName = forwardingRuleName;
            return this;
        }
        public String getForwardingRuleName() {
            return this.forwardingRuleName;
        }

        public UpdateForwardingRulesRequestForwardingRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateForwardingRulesRequestForwardingRules setRuleActions(java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActions> ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActions> getRuleActions() {
            return this.ruleActions;
        }

        public UpdateForwardingRulesRequestForwardingRules setRuleConditions(java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleConditions> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

    }

}
