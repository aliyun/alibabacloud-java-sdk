// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class UpdateEgressProxyRulesAttributeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eprg-gw80bb6a95380edb****</p>
     */
    @NameInMap("EgressProxyRuleGroupId")
    public String egressProxyRuleGroupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EgressProxyRules")
    public java.util.List<UpdateEgressProxyRulesAttributeRequestEgressProxyRules> egressProxyRules;

    public static UpdateEgressProxyRulesAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEgressProxyRulesAttributeRequest self = new UpdateEgressProxyRulesAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEgressProxyRulesAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateEgressProxyRulesAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateEgressProxyRulesAttributeRequest setEgressProxyRuleGroupId(String egressProxyRuleGroupId) {
        this.egressProxyRuleGroupId = egressProxyRuleGroupId;
        return this;
    }
    public String getEgressProxyRuleGroupId() {
        return this.egressProxyRuleGroupId;
    }

    public UpdateEgressProxyRulesAttributeRequest setEgressProxyRules(java.util.List<UpdateEgressProxyRulesAttributeRequestEgressProxyRules> egressProxyRules) {
        this.egressProxyRules = egressProxyRules;
        return this;
    }
    public java.util.List<UpdateEgressProxyRulesAttributeRequestEgressProxyRules> getEgressProxyRules() {
        return this.egressProxyRules;
    }

    public static class UpdateEgressProxyRulesAttributeRequestEgressProxyRulesAddConditions extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>request:DestinationDomain</p>
         */
        @NameInMap("ConditionKey")
        public String conditionKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>StringEquals</p>
         */
        @NameInMap("ConditionOperator")
        public String conditionOperator;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConditionValues")
        public java.util.List<String> conditionValues;

        public static UpdateEgressProxyRulesAttributeRequestEgressProxyRulesAddConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateEgressProxyRulesAttributeRequestEgressProxyRulesAddConditions self = new UpdateEgressProxyRulesAttributeRequestEgressProxyRulesAddConditions();
            return TeaModel.build(map, self);
        }

        public UpdateEgressProxyRulesAttributeRequestEgressProxyRulesAddConditions setConditionKey(String conditionKey) {
            this.conditionKey = conditionKey;
            return this;
        }
        public String getConditionKey() {
            return this.conditionKey;
        }

        public UpdateEgressProxyRulesAttributeRequestEgressProxyRulesAddConditions setConditionOperator(String conditionOperator) {
            this.conditionOperator = conditionOperator;
            return this;
        }
        public String getConditionOperator() {
            return this.conditionOperator;
        }

        public UpdateEgressProxyRulesAttributeRequestEgressProxyRulesAddConditions setConditionValues(java.util.List<String> conditionValues) {
            this.conditionValues = conditionValues;
            return this;
        }
        public java.util.List<String> getConditionValues() {
            return this.conditionValues;
        }

    }

    public static class UpdateEgressProxyRulesAttributeRequestEgressProxyRulesRemoveConditions extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>request:DestinationDomain</p>
         */
        @NameInMap("ConditionKey")
        public String conditionKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>StringEquals</p>
         */
        @NameInMap("ConditionOperator")
        public String conditionOperator;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConditionValues")
        public java.util.List<String> conditionValues;

        public static UpdateEgressProxyRulesAttributeRequestEgressProxyRulesRemoveConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateEgressProxyRulesAttributeRequestEgressProxyRulesRemoveConditions self = new UpdateEgressProxyRulesAttributeRequestEgressProxyRulesRemoveConditions();
            return TeaModel.build(map, self);
        }

        public UpdateEgressProxyRulesAttributeRequestEgressProxyRulesRemoveConditions setConditionKey(String conditionKey) {
            this.conditionKey = conditionKey;
            return this;
        }
        public String getConditionKey() {
            return this.conditionKey;
        }

        public UpdateEgressProxyRulesAttributeRequestEgressProxyRulesRemoveConditions setConditionOperator(String conditionOperator) {
            this.conditionOperator = conditionOperator;
            return this;
        }
        public String getConditionOperator() {
            return this.conditionOperator;
        }

        public UpdateEgressProxyRulesAttributeRequestEgressProxyRulesRemoveConditions setConditionValues(java.util.List<String> conditionValues) {
            this.conditionValues = conditionValues;
            return this;
        }
        public java.util.List<String> getConditionValues() {
            return this.conditionValues;
        }

    }

    public static class UpdateEgressProxyRulesAttributeRequestEgressProxyRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("Action")
        public String action;

        @NameInMap("AddConditions")
        public java.util.List<UpdateEgressProxyRulesAttributeRequestEgressProxyRulesAddConditions> addConditions;

        /**
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epr-gw80bb6a91dbb775****</p>
         */
        @NameInMap("EgressProxyRuleId")
        public String egressProxyRuleId;

        /**
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("EgressProxyRuleName")
        public String egressProxyRuleName;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("RemoveConditions")
        public java.util.List<UpdateEgressProxyRulesAttributeRequestEgressProxyRulesRemoveConditions> removeConditions;

        public static UpdateEgressProxyRulesAttributeRequestEgressProxyRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateEgressProxyRulesAttributeRequestEgressProxyRules self = new UpdateEgressProxyRulesAttributeRequestEgressProxyRules();
            return TeaModel.build(map, self);
        }

        public UpdateEgressProxyRulesAttributeRequestEgressProxyRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public UpdateEgressProxyRulesAttributeRequestEgressProxyRules setAddConditions(java.util.List<UpdateEgressProxyRulesAttributeRequestEgressProxyRulesAddConditions> addConditions) {
            this.addConditions = addConditions;
            return this;
        }
        public java.util.List<UpdateEgressProxyRulesAttributeRequestEgressProxyRulesAddConditions> getAddConditions() {
            return this.addConditions;
        }

        public UpdateEgressProxyRulesAttributeRequestEgressProxyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateEgressProxyRulesAttributeRequestEgressProxyRules setEgressProxyRuleId(String egressProxyRuleId) {
            this.egressProxyRuleId = egressProxyRuleId;
            return this;
        }
        public String getEgressProxyRuleId() {
            return this.egressProxyRuleId;
        }

        public UpdateEgressProxyRulesAttributeRequestEgressProxyRules setEgressProxyRuleName(String egressProxyRuleName) {
            this.egressProxyRuleName = egressProxyRuleName;
            return this;
        }
        public String getEgressProxyRuleName() {
            return this.egressProxyRuleName;
        }

        public UpdateEgressProxyRulesAttributeRequestEgressProxyRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateEgressProxyRulesAttributeRequestEgressProxyRules setRemoveConditions(java.util.List<UpdateEgressProxyRulesAttributeRequestEgressProxyRulesRemoveConditions> removeConditions) {
            this.removeConditions = removeConditions;
            return this;
        }
        public java.util.List<UpdateEgressProxyRulesAttributeRequestEgressProxyRulesRemoveConditions> getRemoveConditions() {
            return this.removeConditions;
        }

    }

}
