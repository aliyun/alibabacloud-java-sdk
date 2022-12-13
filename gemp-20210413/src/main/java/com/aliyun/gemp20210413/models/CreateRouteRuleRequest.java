// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateRouteRuleRequest extends TeaModel {
    @NameInMap("assignObjectId")
    public Long assignObjectId;

    @NameInMap("assignObjectType")
    public String assignObjectType;

    @NameInMap("childRuleRelation")
    public String childRuleRelation;

    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("coverageProblemLevels")
    public java.util.List<String> coverageProblemLevels;

    @NameInMap("effection")
    public String effection;

    @NameInMap("enableStatus")
    public String enableStatus;

    @NameInMap("incidentLevel")
    public String incidentLevel;

    @NameInMap("matchCount")
    public Integer matchCount;

    @NameInMap("notifyChannels")
    public java.util.List<String> notifyChannels;

    @NameInMap("problemEffectionServices")
    public java.util.List<Long> problemEffectionServices;

    @NameInMap("problemLevelGroup")
    public java.util.Map<String, ProblemLevelGroupValue> problemLevelGroup;

    @NameInMap("relatedServiceId")
    public Long relatedServiceId;

    @NameInMap("routeChildRules")
    public java.util.List<CreateRouteRuleRequestRouteChildRules> routeChildRules;

    @NameInMap("routeType")
    public String routeType;

    @NameInMap("ruleName")
    public String ruleName;

    @NameInMap("timeWindow")
    public Long timeWindow;

    @NameInMap("timeWindowUnit")
    public String timeWindowUnit;

    public static CreateRouteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteRuleRequest self = new CreateRouteRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRouteRuleRequest setAssignObjectId(Long assignObjectId) {
        this.assignObjectId = assignObjectId;
        return this;
    }
    public Long getAssignObjectId() {
        return this.assignObjectId;
    }

    public CreateRouteRuleRequest setAssignObjectType(String assignObjectType) {
        this.assignObjectType = assignObjectType;
        return this;
    }
    public String getAssignObjectType() {
        return this.assignObjectType;
    }

    public CreateRouteRuleRequest setChildRuleRelation(String childRuleRelation) {
        this.childRuleRelation = childRuleRelation;
        return this;
    }
    public String getChildRuleRelation() {
        return this.childRuleRelation;
    }

    public CreateRouteRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRouteRuleRequest setCoverageProblemLevels(java.util.List<String> coverageProblemLevels) {
        this.coverageProblemLevels = coverageProblemLevels;
        return this;
    }
    public java.util.List<String> getCoverageProblemLevels() {
        return this.coverageProblemLevels;
    }

    public CreateRouteRuleRequest setEffection(String effection) {
        this.effection = effection;
        return this;
    }
    public String getEffection() {
        return this.effection;
    }

    public CreateRouteRuleRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public CreateRouteRuleRequest setIncidentLevel(String incidentLevel) {
        this.incidentLevel = incidentLevel;
        return this;
    }
    public String getIncidentLevel() {
        return this.incidentLevel;
    }

    public CreateRouteRuleRequest setMatchCount(Integer matchCount) {
        this.matchCount = matchCount;
        return this;
    }
    public Integer getMatchCount() {
        return this.matchCount;
    }

    public CreateRouteRuleRequest setNotifyChannels(java.util.List<String> notifyChannels) {
        this.notifyChannels = notifyChannels;
        return this;
    }
    public java.util.List<String> getNotifyChannels() {
        return this.notifyChannels;
    }

    public CreateRouteRuleRequest setProblemEffectionServices(java.util.List<Long> problemEffectionServices) {
        this.problemEffectionServices = problemEffectionServices;
        return this;
    }
    public java.util.List<Long> getProblemEffectionServices() {
        return this.problemEffectionServices;
    }

    public CreateRouteRuleRequest setProblemLevelGroup(java.util.Map<String, ProblemLevelGroupValue> problemLevelGroup) {
        this.problemLevelGroup = problemLevelGroup;
        return this;
    }
    public java.util.Map<String, ProblemLevelGroupValue> getProblemLevelGroup() {
        return this.problemLevelGroup;
    }

    public CreateRouteRuleRequest setRelatedServiceId(Long relatedServiceId) {
        this.relatedServiceId = relatedServiceId;
        return this;
    }
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

    public CreateRouteRuleRequest setRouteChildRules(java.util.List<CreateRouteRuleRequestRouteChildRules> routeChildRules) {
        this.routeChildRules = routeChildRules;
        return this;
    }
    public java.util.List<CreateRouteRuleRequestRouteChildRules> getRouteChildRules() {
        return this.routeChildRules;
    }

    public CreateRouteRuleRequest setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }
    public String getRouteType() {
        return this.routeType;
    }

    public CreateRouteRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateRouteRuleRequest setTimeWindow(Long timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }
    public Long getTimeWindow() {
        return this.timeWindow;
    }

    public CreateRouteRuleRequest setTimeWindowUnit(String timeWindowUnit) {
        this.timeWindowUnit = timeWindowUnit;
        return this;
    }
    public String getTimeWindowUnit() {
        return this.timeWindowUnit;
    }

    public static class CreateRouteRuleRequestRouteChildRulesConditions extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("operationSymbol")
        public String operationSymbol;

        @NameInMap("value")
        public String value;

        public static CreateRouteRuleRequestRouteChildRulesConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateRouteRuleRequestRouteChildRulesConditions self = new CreateRouteRuleRequestRouteChildRulesConditions();
            return TeaModel.build(map, self);
        }

        public CreateRouteRuleRequestRouteChildRulesConditions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRouteRuleRequestRouteChildRulesConditions setOperationSymbol(String operationSymbol) {
            this.operationSymbol = operationSymbol;
            return this;
        }
        public String getOperationSymbol() {
            return this.operationSymbol;
        }

        public CreateRouteRuleRequestRouteChildRulesConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateRouteRuleRequestRouteChildRules extends TeaModel {
        @NameInMap("childConditionRelation")
        public Long childConditionRelation;

        @NameInMap("conditions")
        public java.util.List<CreateRouteRuleRequestRouteChildRulesConditions> conditions;

        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        @NameInMap("problemLevel")
        public String problemLevel;

        public static CreateRouteRuleRequestRouteChildRules build(java.util.Map<String, ?> map) throws Exception {
            CreateRouteRuleRequestRouteChildRules self = new CreateRouteRuleRequestRouteChildRules();
            return TeaModel.build(map, self);
        }

        public CreateRouteRuleRequestRouteChildRules setChildConditionRelation(Long childConditionRelation) {
            this.childConditionRelation = childConditionRelation;
            return this;
        }
        public Long getChildConditionRelation() {
            return this.childConditionRelation;
        }

        public CreateRouteRuleRequestRouteChildRules setConditions(java.util.List<CreateRouteRuleRequestRouteChildRulesConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<CreateRouteRuleRequestRouteChildRulesConditions> getConditions() {
            return this.conditions;
        }

        public CreateRouteRuleRequestRouteChildRules setMonitorSourceId(Long monitorSourceId) {
            this.monitorSourceId = monitorSourceId;
            return this;
        }
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        public CreateRouteRuleRequestRouteChildRules setProblemLevel(String problemLevel) {
            this.problemLevel = problemLevel;
            return this;
        }
        public String getProblemLevel() {
            return this.problemLevel;
        }

    }

}
