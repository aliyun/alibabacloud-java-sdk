// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateRouteRuleRequest extends TeaModel {
    // 事件分派对象ID（服务组ID 或用户ID）
    @NameInMap("assignObjectId")
    public Long assignObjectId;

    // 事件分派对象类型 SERVICEGROUP服务组  USER 单个用户
    @NameInMap("assignObjectType")
    public String assignObjectType;

    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    // 影响程度 LOW-一般 HIGH-严重
    @NameInMap("effection")
    public String effection;

    // 事件级别 1-P1 2-P2 3-P3 4-P4
    @NameInMap("incidentLevel")
    public String incidentLevel;

    // 命中次数
    @NameInMap("matchCount")
    public Long matchCount;

    // 通知渠道    SMS 短信  EMAIL  邮件  PHONE  电话  WEIXIN_GROUP 企微群 DING_GROUP 钉钉群
    @NameInMap("notifyChannels")
    public java.util.List<String> notifyChannels;

    // 关联服务ID
    @NameInMap("relatedServiceId")
    public Long relatedServiceId;

    // 子规则
    @NameInMap("routeChildRules")
    public java.util.List<UpdateRouteRuleRequestRouteChildRules> routeChildRules;

    // 规则ID
    @NameInMap("routeRuleId")
    public Long routeRuleId;

    // 路由类型：INCIDENT 触发事件 ALERT 仅触发报警
    @NameInMap("routeType")
    public String routeType;

    // 规则名称
    @NameInMap("ruleName")
    public String ruleName;

    // 时间窗口
    @NameInMap("timeWindow")
    public Integer timeWindow;

    // 时间窗口单位 MINUTE 分钟  SECOND 秒
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

    public UpdateRouteRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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
        // 字段
        @NameInMap("key")
        public String key;

        // 操作符
        @NameInMap("operationSymbol")
        public String operationSymbol;

        // 字段取值
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
        // 子规则ID 不填表示新增
        @NameInMap("childRouteRuleId")
        public Long childRouteRuleId;

        // 条件
        @NameInMap("conditions")
        public java.util.List<UpdateRouteRuleRequestRouteChildRulesConditions> conditions;

        // true  删除子规则  false编辑子规则
        @NameInMap("isValidChildRule")
        public Boolean isValidChildRule;

        // 监控源ID
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        public static UpdateRouteRuleRequestRouteChildRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateRouteRuleRequestRouteChildRules self = new UpdateRouteRuleRequestRouteChildRules();
            return TeaModel.build(map, self);
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

    }

}
