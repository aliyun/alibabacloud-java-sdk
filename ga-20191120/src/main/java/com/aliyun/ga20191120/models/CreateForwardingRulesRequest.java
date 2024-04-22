// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateForwardingRulesRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ForwardingRules")
    public java.util.List<CreateForwardingRulesRequestForwardingRules> forwardingRules;

    /**
     * <p>The ID of the listener.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateForwardingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardingRulesRequest self = new CreateForwardingRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateForwardingRulesRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateForwardingRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateForwardingRulesRequest setForwardingRules(java.util.List<CreateForwardingRulesRequestForwardingRules> forwardingRules) {
        this.forwardingRules = forwardingRules;
        return this;
    }
    public java.util.List<CreateForwardingRulesRequestForwardingRules> getForwardingRules() {
        return this.forwardingRules;
    }

    public CreateForwardingRulesRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public CreateForwardingRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
        @NameInMap("ForwardGroupConfig")
        public CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("RuleActionType")
        public String ruleActionType;

        @NameInMap("RuleActionValue")
        public String ruleActionValue;

        public static CreateForwardingRulesRequestForwardingRulesRuleActions build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesRequestForwardingRulesRuleActions self = new CreateForwardingRulesRequestForwardingRulesRuleActions();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesRequestForwardingRulesRuleActions setForwardGroupConfig(CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public CreateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
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

        public CreateForwardingRulesRequestForwardingRulesRuleActions setRuleActionValue(String ruleActionValue) {
            this.ruleActionValue = ruleActionValue;
            return this;
        }
        public String getRuleActionValue() {
            return this.ruleActionValue;
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

    public static class CreateForwardingRulesRequestForwardingRulesRuleConditions extends TeaModel {
        @NameInMap("HostConfig")
        public CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig hostConfig;

        @NameInMap("PathConfig")
        public CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig pathConfig;

        @NameInMap("RuleConditionType")
        public String ruleConditionType;

        @NameInMap("RuleConditionValue")
        public String ruleConditionValue;

        public static CreateForwardingRulesRequestForwardingRulesRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesRequestForwardingRulesRuleConditions self = new CreateForwardingRulesRequestForwardingRulesRuleConditions();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesRequestForwardingRulesRuleConditions setHostConfig(CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }
        public CreateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig getHostConfig() {
            return this.hostConfig;
        }

        public CreateForwardingRulesRequestForwardingRulesRuleConditions setPathConfig(CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig pathConfig) {
            this.pathConfig = pathConfig;
            return this;
        }
        public CreateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig getPathConfig() {
            return this.pathConfig;
        }

        public CreateForwardingRulesRequestForwardingRulesRuleConditions setRuleConditionType(String ruleConditionType) {
            this.ruleConditionType = ruleConditionType;
            return this;
        }
        public String getRuleConditionType() {
            return this.ruleConditionType;
        }

        public CreateForwardingRulesRequestForwardingRulesRuleConditions setRuleConditionValue(String ruleConditionValue) {
            this.ruleConditionValue = ruleConditionValue;
            return this;
        }
        public String getRuleConditionValue() {
            return this.ruleConditionValue;
        }

    }

    public static class CreateForwardingRulesRequestForwardingRules extends TeaModel {
        @NameInMap("ForwardingRuleName")
        public String forwardingRuleName;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("RuleActions")
        public java.util.List<CreateForwardingRulesRequestForwardingRulesRuleActions> ruleActions;

        @NameInMap("RuleConditions")
        public java.util.List<CreateForwardingRulesRequestForwardingRulesRuleConditions> ruleConditions;

        @NameInMap("RuleDirection")
        public String ruleDirection;

        public static CreateForwardingRulesRequestForwardingRules build(java.util.Map<String, ?> map) throws Exception {
            CreateForwardingRulesRequestForwardingRules self = new CreateForwardingRulesRequestForwardingRules();
            return TeaModel.build(map, self);
        }

        public CreateForwardingRulesRequestForwardingRules setForwardingRuleName(String forwardingRuleName) {
            this.forwardingRuleName = forwardingRuleName;
            return this;
        }
        public String getForwardingRuleName() {
            return this.forwardingRuleName;
        }

        public CreateForwardingRulesRequestForwardingRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateForwardingRulesRequestForwardingRules setRuleActions(java.util.List<CreateForwardingRulesRequestForwardingRulesRuleActions> ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public java.util.List<CreateForwardingRulesRequestForwardingRulesRuleActions> getRuleActions() {
            return this.ruleActions;
        }

        public CreateForwardingRulesRequestForwardingRules setRuleConditions(java.util.List<CreateForwardingRulesRequestForwardingRulesRuleConditions> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }
        public java.util.List<CreateForwardingRulesRequestForwardingRulesRuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

        public CreateForwardingRulesRequestForwardingRules setRuleDirection(String ruleDirection) {
            this.ruleDirection = ruleDirection;
            return this;
        }
        public String getRuleDirection() {
            return this.ruleDirection;
        }

    }

}
