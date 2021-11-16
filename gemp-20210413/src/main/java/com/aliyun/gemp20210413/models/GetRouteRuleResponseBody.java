// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetRouteRuleResponseBody extends TeaModel {
    // 规则详情
    @NameInMap("data")
    public GetRouteRuleResponseBodyData data;

    // 请求ID
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
        // 条件可以
        @NameInMap("key")
        public String key;

        // 操作符
        @NameInMap("operationSymbol")
        public String operationSymbol;

        // 匹配值
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
        // 子规则ID
        @NameInMap("childRouteRuleId")
        public Long childRouteRuleId;

        @NameInMap("conditions")
        public java.util.List<GetRouteRuleResponseBodyDataEventRouteChildRulesConditions> conditions;

        // 是否有效得规则true有效 false无效
        @NameInMap("isValidChildRule")
        public Boolean isValidChildRule;

        // 集成配置ID
        @NameInMap("monitorIntegrationConfigId")
        public Long monitorIntegrationConfigId;

        // 监控源ID
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        // 监控源名称
        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        // 规则ID
        @NameInMap("parentRuleId")
        public Long parentRuleId;

        public static GetRouteRuleResponseBodyDataEventRouteChildRules build(java.util.Map<String, ?> map) throws Exception {
            GetRouteRuleResponseBodyDataEventRouteChildRules self = new GetRouteRuleResponseBodyDataEventRouteChildRules();
            return TeaModel.build(map, self);
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

    }

    public static class GetRouteRuleResponseBodyData extends TeaModel {
        // 事件分派对象ID（服务组ID 或用户ID）
        @NameInMap("assignObjectId")
        public Long assignObjectId;

        // 通知对象名称
        @NameInMap("assignObjectName")
        public String assignObjectName;

        // 事件分派对象类型 SERVICEGROUP 服务组  USER 单个用户
        @NameInMap("assignObjectType")
        public String assignObjectType;

        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 影响程度  LOW一般  HIGH-严重
        @NameInMap("effection")
        public String effection;

        // 是否启用  DISABLE禁用 ENABLE 启用
        @NameInMap("enableStatus")
        public String enableStatus;

        // 子规则
        @NameInMap("eventRouteChildRules")
        public java.util.List<GetRouteRuleResponseBodyDataEventRouteChildRules> eventRouteChildRules;

        // 事件级别 P1 P2 P3 P4
        @NameInMap("incidentLevel")
        public String incidentLevel;

        // 命中次数
        @NameInMap("matchCount")
        public Long matchCount;

        // 通知渠道名称
        @NameInMap("notifyChannelNames")
        public java.util.List<String> notifyChannelNames;

        // 通知渠道
        @NameInMap("notifyChannels")
        public java.util.List<String> notifyChannels;

        // 关联服务ID
        @NameInMap("relatedServiceId")
        public Long relatedServiceId;

        // 关联服务名称
        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        // 规则ID
        @NameInMap("routeRuleId")
        public Long routeRuleId;

        // 路由类型：INCIDENT 触发事件 ALERT 仅触发报警
        @NameInMap("routeType")
        public String routeType;

        // 流转规则名字
        @NameInMap("ruleName")
        public String ruleName;

        // 时间窗口
        @NameInMap("timeWindow")
        public Integer timeWindow;

        // 修改时间
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
