// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateEscalationPlanRequest extends TeaModel {
    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    // 升级计划描述
    @NameInMap("escalationPlanDescription")
    public String escalationPlanDescription;

    // 升级计划id
    @NameInMap("escalationPlanId")
    public Long escalationPlanId;

    // 升级计划名称
    @NameInMap("escalationPlanName")
    public String escalationPlanName;

    // 升级计划规则
    @NameInMap("escalationPlanRules")
    public java.util.List<UpdateEscalationPlanRequestEscalationPlanRules> escalationPlanRules;

    // 关联范围列表（服务）
    @NameInMap("escalationPlanScopeObjects")
    public java.util.List<UpdateEscalationPlanRequestEscalationPlanScopeObjects> escalationPlanScopeObjects;

    public static UpdateEscalationPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEscalationPlanRequest self = new UpdateEscalationPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEscalationPlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateEscalationPlanRequest setEscalationPlanDescription(String escalationPlanDescription) {
        this.escalationPlanDescription = escalationPlanDescription;
        return this;
    }
    public String getEscalationPlanDescription() {
        return this.escalationPlanDescription;
    }

    public UpdateEscalationPlanRequest setEscalationPlanId(Long escalationPlanId) {
        this.escalationPlanId = escalationPlanId;
        return this;
    }
    public Long getEscalationPlanId() {
        return this.escalationPlanId;
    }

    public UpdateEscalationPlanRequest setEscalationPlanName(String escalationPlanName) {
        this.escalationPlanName = escalationPlanName;
        return this;
    }
    public String getEscalationPlanName() {
        return this.escalationPlanName;
    }

    public UpdateEscalationPlanRequest setEscalationPlanRules(java.util.List<UpdateEscalationPlanRequestEscalationPlanRules> escalationPlanRules) {
        this.escalationPlanRules = escalationPlanRules;
        return this;
    }
    public java.util.List<UpdateEscalationPlanRequestEscalationPlanRules> getEscalationPlanRules() {
        return this.escalationPlanRules;
    }

    public UpdateEscalationPlanRequest setEscalationPlanScopeObjects(java.util.List<UpdateEscalationPlanRequestEscalationPlanScopeObjects> escalationPlanScopeObjects) {
        this.escalationPlanScopeObjects = escalationPlanScopeObjects;
        return this;
    }
    public java.util.List<UpdateEscalationPlanRequestEscalationPlanScopeObjects> getEscalationPlanScopeObjects() {
        return this.escalationPlanScopeObjects;
    }

    public static class UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions extends TeaModel {
        // LOW HIGH
        @NameInMap("effection")
        public String effection;

        // P1 P2 P3 P4
        @NameInMap("level")
        public String level;

        public static UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions self = new UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions();
            return TeaModel.build(map, self);
        }

        public UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions setEffection(String effection) {
            this.effection = effection;
            return this;
        }
        public String getEffection() {
            return this.effection;
        }

        public UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies extends TeaModel {
        // 通知渠道
        @NameInMap("noticeChannels")
        public java.util.List<String> noticeChannels;

        // 通知对象id
        @NameInMap("noticeObjects")
        public java.util.List<Long> noticeObjects;

        // 通知时间
        @NameInMap("noticeTime")
        public Long noticeTime;

        public static UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies build(java.util.Map<String, ?> map) throws Exception {
            UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies self = new UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies();
            return TeaModel.build(map, self);
        }

        public UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies setNoticeChannels(java.util.List<String> noticeChannels) {
            this.noticeChannels = noticeChannels;
            return this;
        }
        public java.util.List<String> getNoticeChannels() {
            return this.noticeChannels;
        }

        public UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies setNoticeObjects(java.util.List<Long> noticeObjects) {
            this.noticeObjects = noticeObjects;
            return this;
        }
        public java.util.List<Long> getNoticeObjects() {
            return this.noticeObjects;
        }

        public UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies setNoticeTime(Long noticeTime) {
            this.noticeTime = noticeTime;
            return this;
        }
        public Long getNoticeTime() {
            return this.noticeTime;
        }

    }

    public static class UpdateEscalationPlanRequestEscalationPlanRules extends TeaModel {
        // 升级计划条件列表
        @NameInMap("escalationPlanConditions")
        public java.util.List<UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions> escalationPlanConditions;

        // 升级策略列表
        @NameInMap("escalationPlanStrategies")
        public java.util.List<UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies> escalationPlanStrategies;

        // UN_ACKNOWLEDGE 未响应 UN_FINISH 未完结
        @NameInMap("escalationPlanType")
        public String escalationPlanType;

        // 主键
        @NameInMap("id")
        public Long id;

        public static UpdateEscalationPlanRequestEscalationPlanRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateEscalationPlanRequestEscalationPlanRules self = new UpdateEscalationPlanRequestEscalationPlanRules();
            return TeaModel.build(map, self);
        }

        public UpdateEscalationPlanRequestEscalationPlanRules setEscalationPlanConditions(java.util.List<UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions> escalationPlanConditions) {
            this.escalationPlanConditions = escalationPlanConditions;
            return this;
        }
        public java.util.List<UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions> getEscalationPlanConditions() {
            return this.escalationPlanConditions;
        }

        public UpdateEscalationPlanRequestEscalationPlanRules setEscalationPlanStrategies(java.util.List<UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies> escalationPlanStrategies) {
            this.escalationPlanStrategies = escalationPlanStrategies;
            return this;
        }
        public java.util.List<UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies> getEscalationPlanStrategies() {
            return this.escalationPlanStrategies;
        }

        public UpdateEscalationPlanRequestEscalationPlanRules setEscalationPlanType(String escalationPlanType) {
            this.escalationPlanType = escalationPlanType;
            return this;
        }
        public String getEscalationPlanType() {
            return this.escalationPlanType;
        }

        public UpdateEscalationPlanRequestEscalationPlanRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class UpdateEscalationPlanRequestEscalationPlanScopeObjects extends TeaModel {
        // 主键
        @NameInMap("id")
        public Long id;

        // 范围对象类型
        @NameInMap("scope")
        public String scope;

        // 范围对象id
        @NameInMap("scopeObjectId")
        public Long scopeObjectId;

        public static UpdateEscalationPlanRequestEscalationPlanScopeObjects build(java.util.Map<String, ?> map) throws Exception {
            UpdateEscalationPlanRequestEscalationPlanScopeObjects self = new UpdateEscalationPlanRequestEscalationPlanScopeObjects();
            return TeaModel.build(map, self);
        }

        public UpdateEscalationPlanRequestEscalationPlanScopeObjects setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateEscalationPlanRequestEscalationPlanScopeObjects setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public UpdateEscalationPlanRequestEscalationPlanScopeObjects setScopeObjectId(Long scopeObjectId) {
            this.scopeObjectId = scopeObjectId;
            return this;
        }
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

    }

}
