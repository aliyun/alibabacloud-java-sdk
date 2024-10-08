// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetRouteRuleResponseBody extends TeaModel {
    @NameInMap("data")
    public GetRouteRuleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>6B9347ED-FD93-42B4-B9A4-7282962F5D6A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetRouteRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRouteRuleResponseBody self = new GetRouteRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRouteRuleResponseBody setData(GetRouteRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRouteRuleResponseBodyData getData() {
        return this.data;
    }

    public GetRouteRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRouteRuleResponseBodyDataEventRouteChildRulesConditions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alarmName</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>contain</p>
         */
        @NameInMap("operationSymbol")
        public String operationSymbol;

        /**
         * <strong>example:</strong>
         * <p>Zabbix server</p>
         */
        @NameInMap("value")
        public String value;

        public static GetRouteRuleResponseBodyDataEventRouteChildRulesConditions build(java.util.Map<String, ?> map) throws Exception {
            GetRouteRuleResponseBodyDataEventRouteChildRulesConditions self = new GetRouteRuleResponseBodyDataEventRouteChildRulesConditions();
            return TeaModel.build(map, self);
        }

        public GetRouteRuleResponseBodyDataEventRouteChildRulesConditions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetRouteRuleResponseBodyDataEventRouteChildRulesConditions setOperationSymbol(String operationSymbol) {
            this.operationSymbol = operationSymbol;
            return this;
        }
        public String getOperationSymbol() {
            return this.operationSymbol;
        }

        public GetRouteRuleResponseBodyDataEventRouteChildRulesConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetRouteRuleResponseBodyDataEventRouteChildRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("childConditionRelation")
        public Long childConditionRelation;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("childRouteRuleId")
        public Long childRouteRuleId;

        @NameInMap("conditions")
        public java.util.List<GetRouteRuleResponseBodyDataEventRouteChildRulesConditions> conditions;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isValidChildRule")
        public Boolean isValidChildRule;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("monitorIntegrationConfigId")
        public Long monitorIntegrationConfigId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        /**
         * <strong>example:</strong>
         * <p>zabbix</p>
         */
        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        /**
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("parentRuleId")
        public Long parentRuleId;

        @NameInMap("problemLevel")
        public String problemLevel;

        public static GetRouteRuleResponseBodyDataEventRouteChildRules build(java.util.Map<String, ?> map) throws Exception {
            GetRouteRuleResponseBodyDataEventRouteChildRules self = new GetRouteRuleResponseBodyDataEventRouteChildRules();
            return TeaModel.build(map, self);
        }

        public GetRouteRuleResponseBodyDataEventRouteChildRules setChildConditionRelation(Long childConditionRelation) {
            this.childConditionRelation = childConditionRelation;
            return this;
        }
        public Long getChildConditionRelation() {
            return this.childConditionRelation;
        }

        public GetRouteRuleResponseBodyDataEventRouteChildRules setChildRouteRuleId(Long childRouteRuleId) {
            this.childRouteRuleId = childRouteRuleId;
            return this;
        }
        public Long getChildRouteRuleId() {
            return this.childRouteRuleId;
        }

        public GetRouteRuleResponseBodyDataEventRouteChildRules setConditions(java.util.List<GetRouteRuleResponseBodyDataEventRouteChildRulesConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<GetRouteRuleResponseBodyDataEventRouteChildRulesConditions> getConditions() {
            return this.conditions;
        }

        public GetRouteRuleResponseBodyDataEventRouteChildRules setIsValidChildRule(Boolean isValidChildRule) {
            this.isValidChildRule = isValidChildRule;
            return this;
        }
        public Boolean getIsValidChildRule() {
            return this.isValidChildRule;
        }

        public GetRouteRuleResponseBodyDataEventRouteChildRules setMonitorIntegrationConfigId(Long monitorIntegrationConfigId) {
            this.monitorIntegrationConfigId = monitorIntegrationConfigId;
            return this;
        }
        public Long getMonitorIntegrationConfigId() {
            return this.monitorIntegrationConfigId;
        }

        public GetRouteRuleResponseBodyDataEventRouteChildRules setMonitorSourceId(Long monitorSourceId) {
            this.monitorSourceId = monitorSourceId;
            return this;
        }
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        public GetRouteRuleResponseBodyDataEventRouteChildRules setMonitorSourceName(String monitorSourceName) {
            this.monitorSourceName = monitorSourceName;
            return this;
        }
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        public GetRouteRuleResponseBodyDataEventRouteChildRules setParentRuleId(Long parentRuleId) {
            this.parentRuleId = parentRuleId;
            return this;
        }
        public Long getParentRuleId() {
            return this.parentRuleId;
        }

        public GetRouteRuleResponseBodyDataEventRouteChildRules setProblemLevel(String problemLevel) {
            this.problemLevel = problemLevel;
            return this;
        }
        public String getProblemLevel() {
            return this.problemLevel;
        }

    }

    public static class GetRouteRuleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("assignObjectId")
        public Long assignObjectId;

        /**
         * <strong>example:</strong>
         * <p>刘德华</p>
         */
        @NameInMap("assignObjectName")
        public String assignObjectName;

        /**
         * <strong>example:</strong>
         * <p>SERVICEGROUP</p>
         */
        @NameInMap("assignObjectType")
        public String assignObjectType;

        /**
         * <strong>example:</strong>
         * <p>AND、OR</p>
         */
        @NameInMap("childRuleRelation")
        public String childRuleRelation;

        @NameInMap("convergenceFields")
        public java.util.List<String> convergenceFields;

        @NameInMap("convergenceType")
        public Integer convergenceType;

        @NameInMap("coverageProblemLevels")
        public java.util.List<String> coverageProblemLevels;

        /**
         * <strong>example:</strong>
         * <p>2020-09-08 15:30:30</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>LOW</p>
         */
        @NameInMap("effection")
        public String effection;

        /**
         * <strong>example:</strong>
         * <p>DISABLE</p>
         */
        @NameInMap("enableStatus")
        public String enableStatus;

        @NameInMap("eventRouteChildRules")
        public java.util.List<GetRouteRuleResponseBodyDataEventRouteChildRules> eventRouteChildRules;

        /**
         * <strong>example:</strong>
         * <p>P1</p>
         */
        @NameInMap("incidentLevel")
        public String incidentLevel;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("matchCount")
        public Long matchCount;

        @NameInMap("notifyChannelNames")
        public java.util.List<String> notifyChannelNames;

        @NameInMap("notifyChannels")
        public java.util.List<String> notifyChannels;

        @NameInMap("problemEffectionServices")
        public java.util.List<Long> problemEffectionServices;

        @NameInMap("problemLevelGroup")
        public java.util.Map<String, DataProblemLevelGroupValue> problemLevelGroup;

        @NameInMap("relServiceDeleteType")
        public Integer relServiceDeleteType;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("relatedServiceId")
        public Long relatedServiceId;

        /**
         * <strong>example:</strong>
         * <p>冲上云霄</p>
         */
        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        /**
         * <strong>example:</strong>
         * <p>180000000</p>
         */
        @NameInMap("routeRuleId")
        public Long routeRuleId;

        /**
         * <strong>example:</strong>
         * <p>INCIDENT</p>
         */
        @NameInMap("routeType")
        public String routeType;

        /**
         * <strong>example:</strong>
         * <p>规则1</p>
         */
        @NameInMap("ruleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("timeWindow")
        public Integer timeWindow;

        /**
         * <strong>example:</strong>
         * <p>2020-09-08 15:30:30</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static GetRouteRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRouteRuleResponseBodyData self = new GetRouteRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRouteRuleResponseBodyData setAssignObjectId(Long assignObjectId) {
            this.assignObjectId = assignObjectId;
            return this;
        }
        public Long getAssignObjectId() {
            return this.assignObjectId;
        }

        public GetRouteRuleResponseBodyData setAssignObjectName(String assignObjectName) {
            this.assignObjectName = assignObjectName;
            return this;
        }
        public String getAssignObjectName() {
            return this.assignObjectName;
        }

        public GetRouteRuleResponseBodyData setAssignObjectType(String assignObjectType) {
            this.assignObjectType = assignObjectType;
            return this;
        }
        public String getAssignObjectType() {
            return this.assignObjectType;
        }

        public GetRouteRuleResponseBodyData setChildRuleRelation(String childRuleRelation) {
            this.childRuleRelation = childRuleRelation;
            return this;
        }
        public String getChildRuleRelation() {
            return this.childRuleRelation;
        }

        public GetRouteRuleResponseBodyData setConvergenceFields(java.util.List<String> convergenceFields) {
            this.convergenceFields = convergenceFields;
            return this;
        }
        public java.util.List<String> getConvergenceFields() {
            return this.convergenceFields;
        }

        public GetRouteRuleResponseBodyData setConvergenceType(Integer convergenceType) {
            this.convergenceType = convergenceType;
            return this;
        }
        public Integer getConvergenceType() {
            return this.convergenceType;
        }

        public GetRouteRuleResponseBodyData setCoverageProblemLevels(java.util.List<String> coverageProblemLevels) {
            this.coverageProblemLevels = coverageProblemLevels;
            return this;
        }
        public java.util.List<String> getCoverageProblemLevels() {
            return this.coverageProblemLevels;
        }

        public GetRouteRuleResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetRouteRuleResponseBodyData setEffection(String effection) {
            this.effection = effection;
            return this;
        }
        public String getEffection() {
            return this.effection;
        }

        public GetRouteRuleResponseBodyData setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public GetRouteRuleResponseBodyData setEventRouteChildRules(java.util.List<GetRouteRuleResponseBodyDataEventRouteChildRules> eventRouteChildRules) {
            this.eventRouteChildRules = eventRouteChildRules;
            return this;
        }
        public java.util.List<GetRouteRuleResponseBodyDataEventRouteChildRules> getEventRouteChildRules() {
            return this.eventRouteChildRules;
        }

        public GetRouteRuleResponseBodyData setIncidentLevel(String incidentLevel) {
            this.incidentLevel = incidentLevel;
            return this;
        }
        public String getIncidentLevel() {
            return this.incidentLevel;
        }

        public GetRouteRuleResponseBodyData setMatchCount(Long matchCount) {
            this.matchCount = matchCount;
            return this;
        }
        public Long getMatchCount() {
            return this.matchCount;
        }

        public GetRouteRuleResponseBodyData setNotifyChannelNames(java.util.List<String> notifyChannelNames) {
            this.notifyChannelNames = notifyChannelNames;
            return this;
        }
        public java.util.List<String> getNotifyChannelNames() {
            return this.notifyChannelNames;
        }

        public GetRouteRuleResponseBodyData setNotifyChannels(java.util.List<String> notifyChannels) {
            this.notifyChannels = notifyChannels;
            return this;
        }
        public java.util.List<String> getNotifyChannels() {
            return this.notifyChannels;
        }

        public GetRouteRuleResponseBodyData setProblemEffectionServices(java.util.List<Long> problemEffectionServices) {
            this.problemEffectionServices = problemEffectionServices;
            return this;
        }
        public java.util.List<Long> getProblemEffectionServices() {
            return this.problemEffectionServices;
        }

        public GetRouteRuleResponseBodyData setProblemLevelGroup(java.util.Map<String, DataProblemLevelGroupValue> problemLevelGroup) {
            this.problemLevelGroup = problemLevelGroup;
            return this;
        }
        public java.util.Map<String, DataProblemLevelGroupValue> getProblemLevelGroup() {
            return this.problemLevelGroup;
        }

        public GetRouteRuleResponseBodyData setRelServiceDeleteType(Integer relServiceDeleteType) {
            this.relServiceDeleteType = relServiceDeleteType;
            return this;
        }
        public Integer getRelServiceDeleteType() {
            return this.relServiceDeleteType;
        }

        public GetRouteRuleResponseBodyData setRelatedServiceId(Long relatedServiceId) {
            this.relatedServiceId = relatedServiceId;
            return this;
        }
        public Long getRelatedServiceId() {
            return this.relatedServiceId;
        }

        public GetRouteRuleResponseBodyData setRelatedServiceName(String relatedServiceName) {
            this.relatedServiceName = relatedServiceName;
            return this;
        }
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        public GetRouteRuleResponseBodyData setRouteRuleId(Long routeRuleId) {
            this.routeRuleId = routeRuleId;
            return this;
        }
        public Long getRouteRuleId() {
            return this.routeRuleId;
        }

        public GetRouteRuleResponseBodyData setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

        public GetRouteRuleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetRouteRuleResponseBodyData setTimeWindow(Integer timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }
        public Integer getTimeWindow() {
            return this.timeWindow;
        }

        public GetRouteRuleResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
