// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateRouteRuleRequest extends TeaModel {
    // 规则名称
    @NameInMap("ruleName")
    public byte[] ruleName;

    // 关联服务ID
    @NameInMap("relatedServiceId")
    public Long relatedServiceId;

    // 路由类型：INCIDENT 触发事件 ALERT仅触发报警
    @NameInMap("routeType")
    public String routeType;

    // 事件级别 P1 P2 P3 P4
    @NameInMap("incidentLevel")
    public String incidentLevel;

    // 事件分派对象ID（服务组ID 或用户ID）
    @NameInMap("assignObjectId")
    public Long assignObjectId;

    // 事件分派对象类型 SERVICEGROUP服务组 USER 单个用户
    @NameInMap("assignObjectType")
    public String assignObjectType;

    // 影响程度 LOW-一般 HIGH-严重
    @NameInMap("effection")
    public String effection;

    // 时间窗口
    @NameInMap("timeWindow")
    public Long timeWindow;

    // 命中次数
    @NameInMap("matchCount")
    public Integer matchCount;

    // 时间窗口单位 MINUTE  分钟  SECOND 秒
    @NameInMap("timeWindowUnit")
    public String timeWindowUnit;

    // 子规则
    @NameInMap("routeChildRules")
    public java.util.List<CreateRouteRuleRequestRouteChildRules> routeChildRules;

    // 通知渠道。 SMS 短信  EMAIL 邮件  PHONE电话  WEIXIN_GROUP 企微群 DING_GROUP钉钉群
    @NameInMap("notifyChannels")
    public java.util.List<String> notifyChannels;

    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateRouteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteRuleRequest self = new CreateRouteRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRouteRuleRequest setRuleName(byte[] ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public byte[] getRuleName() {
        return this.ruleName;
    }

    public CreateRouteRuleRequest setRelatedServiceId(Long relatedServiceId) {
        this.relatedServiceId = relatedServiceId;
        return this;
    }
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

    public CreateRouteRuleRequest setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }
    public String getRouteType() {
        return this.routeType;
    }

    public CreateRouteRuleRequest setIncidentLevel(String incidentLevel) {
        this.incidentLevel = incidentLevel;
        return this;
    }
    public String getIncidentLevel() {
        return this.incidentLevel;
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

    public CreateRouteRuleRequest setEffection(String effection) {
        this.effection = effection;
        return this;
    }
    public String getEffection() {
        return this.effection;
    }

    public CreateRouteRuleRequest setTimeWindow(Long timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }
    public Long getTimeWindow() {
        return this.timeWindow;
    }

    public CreateRouteRuleRequest setMatchCount(Integer matchCount) {
        this.matchCount = matchCount;
        return this;
    }
    public Integer getMatchCount() {
        return this.matchCount;
    }

    public CreateRouteRuleRequest setTimeWindowUnit(String timeWindowUnit) {
        this.timeWindowUnit = timeWindowUnit;
        return this;
    }
    public String getTimeWindowUnit() {
        return this.timeWindowUnit;
    }

    public CreateRouteRuleRequest setRouteChildRules(java.util.List<CreateRouteRuleRequestRouteChildRules> routeChildRules) {
        this.routeChildRules = routeChildRules;
        return this;
    }
    public java.util.List<CreateRouteRuleRequestRouteChildRules> getRouteChildRules() {
        return this.routeChildRules;
    }

    public CreateRouteRuleRequest setNotifyChannels(java.util.List<String> notifyChannels) {
        this.notifyChannels = notifyChannels;
        return this;
    }
    public java.util.List<String> getNotifyChannels() {
        return this.notifyChannels;
    }

    public CreateRouteRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateRouteRuleRequestRouteChildRulesConditions extends TeaModel {
        // 字段名称
        @NameInMap("key")
        public String key;

        // 字段值
        @NameInMap("value")
        public String value;

        // 操作符号：notContain 不包含；contain 包含；equals 等于；notEquals 不等于；
        @NameInMap("operationSymbol")
        public String operationSymbol;

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

        public CreateRouteRuleRequestRouteChildRulesConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CreateRouteRuleRequestRouteChildRulesConditions setOperationSymbol(String operationSymbol) {
            this.operationSymbol = operationSymbol;
            return this;
        }
        public String getOperationSymbol() {
            return this.operationSymbol;
        }

    }

    public static class CreateRouteRuleRequestRouteChildRules extends TeaModel {
        // 监控源ID
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        // 条件
        @NameInMap("conditions")
        public java.util.List<CreateRouteRuleRequestRouteChildRulesConditions> conditions;

        public static CreateRouteRuleRequestRouteChildRules build(java.util.Map<String, ?> map) throws Exception {
            CreateRouteRuleRequestRouteChildRules self = new CreateRouteRuleRequestRouteChildRules();
            return TeaModel.build(map, self);
        }

        public CreateRouteRuleRequestRouteChildRules setMonitorSourceId(Long monitorSourceId) {
            this.monitorSourceId = monitorSourceId;
            return this;
        }
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        public CreateRouteRuleRequestRouteChildRules setConditions(java.util.List<CreateRouteRuleRequestRouteChildRulesConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<CreateRouteRuleRequestRouteChildRulesConditions> getConditions() {
            return this.conditions;
        }

    }

}
