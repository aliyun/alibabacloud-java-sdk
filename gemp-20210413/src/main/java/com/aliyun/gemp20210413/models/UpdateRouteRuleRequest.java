// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateRouteRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("assignObjectId")
    public Long assignObjectId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SERVICEGROUP</p>
     */
    @NameInMap("assignObjectType")
    public String assignObjectType;

    /**
     * <strong>example:</strong>
     * <p>AND</p>
     */
    @NameInMap("childRuleRelation")
    public String childRuleRelation;

    /**
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("convergenceFields")
    public java.util.List<String> convergenceFields;

    @NameInMap("convergenceType")
    public Integer convergenceType;

    @NameInMap("coverageProblemLevels")
    public java.util.List<String> coverageProblemLevels;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LOW</p>
     */
    @NameInMap("effection")
    public String effection;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>P1</p>
     */
    @NameInMap("incidentLevel")
    public String incidentLevel;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("matchCount")
    public Long matchCount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("notifyChannels")
    public java.util.List<String> notifyChannels;

    @NameInMap("problemEffectionServices")
    public java.util.List<Long> problemEffectionServices;

    @NameInMap("problemLevelGroup")
    public java.util.Map<String, ProblemLevelGroupValue> problemLevelGroup;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("relatedServiceId")
    public Long relatedServiceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("routeChildRules")
    public java.util.List<UpdateRouteRuleRequestRouteChildRules> routeChildRules;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("routeRuleId")
    public Long routeRuleId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALERT</p>
     */
    @NameInMap("routeType")
    public String routeType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>规则1</p>
     */
    @NameInMap("ruleName")
    public String ruleName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("timeWindow")
    public Integer timeWindow;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MINUTE</p>
     */
    @NameInMap("timeWindowUnit")
    public String timeWindowUnit;

    public static UpdateRouteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRouteRuleRequest self = new UpdateRouteRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRouteRuleRequest setAssignObjectId(Long assignObjectId) {
        this.assignObjectId = assignObjectId;
        return this;
    }
    public Long getAssignObjectId() {
        return this.assignObjectId;
    }

    public UpdateRouteRuleRequest setAssignObjectType(String assignObjectType) {
        this.assignObjectType = assignObjectType;
        return this;
    }
    public String getAssignObjectType() {
        return this.assignObjectType;
    }

    public UpdateRouteRuleRequest setChildRuleRelation(String childRuleRelation) {
        this.childRuleRelation = childRuleRelation;
        return this;
    }
    public String getChildRuleRelation() {
        return this.childRuleRelation;
    }

    public UpdateRouteRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRouteRuleRequest setConvergenceFields(java.util.List<String> convergenceFields) {
        this.convergenceFields = convergenceFields;
        return this;
    }
    public java.util.List<String> getConvergenceFields() {
        return this.convergenceFields;
    }

    public UpdateRouteRuleRequest setConvergenceType(Integer convergenceType) {
        this.convergenceType = convergenceType;
        return this;
    }
    public Integer getConvergenceType() {
        return this.convergenceType;
    }

    public UpdateRouteRuleRequest setCoverageProblemLevels(java.util.List<String> coverageProblemLevels) {
        this.coverageProblemLevels = coverageProblemLevels;
        return this;
    }
    public java.util.List<String> getCoverageProblemLevels() {
        return this.coverageProblemLevels;
    }

    public UpdateRouteRuleRequest setEffection(String effection) {
        this.effection = effection;
        return this;
    }
    public String getEffection() {
        return this.effection;
    }

    public UpdateRouteRuleRequest setIncidentLevel(String incidentLevel) {
        this.incidentLevel = incidentLevel;
        return this;
    }
    public String getIncidentLevel() {
        return this.incidentLevel;
    }

    public UpdateRouteRuleRequest setMatchCount(Long matchCount) {
        this.matchCount = matchCount;
        return this;
    }
    public Long getMatchCount() {
        return this.matchCount;
    }

    public UpdateRouteRuleRequest setNotifyChannels(java.util.List<String> notifyChannels) {
        this.notifyChannels = notifyChannels;
        return this;
    }
    public java.util.List<String> getNotifyChannels() {
        return this.notifyChannels;
    }

    public UpdateRouteRuleRequest setProblemEffectionServices(java.util.List<Long> problemEffectionServices) {
        this.problemEffectionServices = problemEffectionServices;
        return this;
    }
    public java.util.List<Long> getProblemEffectionServices() {
        return this.problemEffectionServices;
    }

    public UpdateRouteRuleRequest setProblemLevelGroup(java.util.Map<String, ProblemLevelGroupValue> problemLevelGroup) {
        this.problemLevelGroup = problemLevelGroup;
        return this;
    }
    public java.util.Map<String, ProblemLevelGroupValue> getProblemLevelGroup() {
        return this.problemLevelGroup;
    }

    public UpdateRouteRuleRequest setRelatedServiceId(Long relatedServiceId) {
        this.relatedServiceId = relatedServiceId;
        return this;
    }
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

    public UpdateRouteRuleRequest setRouteChildRules(java.util.List<UpdateRouteRuleRequestRouteChildRules> routeChildRules) {
        this.routeChildRules = routeChildRules;
        return this;
    }
    public java.util.List<UpdateRouteRuleRequestRouteChildRules> getRouteChildRules() {
        return this.routeChildRules;
    }

    public UpdateRouteRuleRequest setRouteRuleId(Long routeRuleId) {
        this.routeRuleId = routeRuleId;
        return this;
    }
    public Long getRouteRuleId() {
        return this.routeRuleId;
    }

    public UpdateRouteRuleRequest setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }
    public String getRouteType() {
        return this.routeType;
    }

    public UpdateRouteRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateRouteRuleRequest setTimeWindow(Integer timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }
    public Integer getTimeWindow() {
        return this.timeWindow;
    }

    public UpdateRouteRuleRequest setTimeWindowUnit(String timeWindowUnit) {
        this.timeWindowUnit = timeWindowUnit;
        return this;
    }
    public String getTimeWindowUnit() {
        return this.timeWindowUnit;
    }

    public static class UpdateRouteRuleRequestRouteChildRulesConditions extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>payload.summary</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>equals</p>
         */
        @NameInMap("operationSymbol")
        public String operationSymbol;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("value")
        public String value;

        public static UpdateRouteRuleRequestRouteChildRulesConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateRouteRuleRequestRouteChildRulesConditions self = new UpdateRouteRuleRequestRouteChildRulesConditions();
            return TeaModel.build(map, self);
        }

        public UpdateRouteRuleRequestRouteChildRulesConditions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRouteRuleRequestRouteChildRulesConditions setOperationSymbol(String operationSymbol) {
            this.operationSymbol = operationSymbol;
            return this;
        }
        public String getOperationSymbol() {
            return this.operationSymbol;
        }

        public UpdateRouteRuleRequestRouteChildRulesConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateRouteRuleRequestRouteChildRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("childConditionRelation")
        public Long childConditionRelation;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("childRouteRuleId")
        public Long childRouteRuleId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("conditions")
        public java.util.List<UpdateRouteRuleRequestRouteChildRulesConditions> conditions;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isValidChildRule")
        public Boolean isValidChildRule;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        @NameInMap("problemLevel")
        public String problemLevel;

        public static UpdateRouteRuleRequestRouteChildRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateRouteRuleRequestRouteChildRules self = new UpdateRouteRuleRequestRouteChildRules();
            return TeaModel.build(map, self);
        }

        public UpdateRouteRuleRequestRouteChildRules setChildConditionRelation(Long childConditionRelation) {
            this.childConditionRelation = childConditionRelation;
            return this;
        }
        public Long getChildConditionRelation() {
            return this.childConditionRelation;
        }

        public UpdateRouteRuleRequestRouteChildRules setChildRouteRuleId(Long childRouteRuleId) {
            this.childRouteRuleId = childRouteRuleId;
            return this;
        }
        public Long getChildRouteRuleId() {
            return this.childRouteRuleId;
        }

        public UpdateRouteRuleRequestRouteChildRules setConditions(java.util.List<UpdateRouteRuleRequestRouteChildRulesConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<UpdateRouteRuleRequestRouteChildRulesConditions> getConditions() {
            return this.conditions;
        }

        public UpdateRouteRuleRequestRouteChildRules setIsValidChildRule(Boolean isValidChildRule) {
            this.isValidChildRule = isValidChildRule;
            return this;
        }
        public Boolean getIsValidChildRule() {
            return this.isValidChildRule;
        }

        public UpdateRouteRuleRequestRouteChildRules setMonitorSourceId(Long monitorSourceId) {
            this.monitorSourceId = monitorSourceId;
            return this;
        }
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        public UpdateRouteRuleRequestRouteChildRules setProblemLevel(String problemLevel) {
            this.problemLevel = problemLevel;
            return this;
        }
        public String getProblemLevel() {
            return this.problemLevel;
        }

    }

}
