// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateEscalationPlanRequest extends TeaModel {
    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    // 升级计划描述
    @NameInMap("escalationPlanDescription")
    public String escalationPlanDescription;

    // 升级计划名称
    @NameInMap("escalationPlanName")
    public String escalationPlanName;

    // 升级计划规则列表
    @NameInMap("escalationPlanRules")
    public java.util.List<CreateEscalationPlanRequestEscalationPlanRules> escalationPlanRules;

    // 升级计划范围对象列表
    @NameInMap("escalationPlanScopeObjects")
    public java.util.List<CreateEscalationPlanRequestEscalationPlanScopeObjects> escalationPlanScopeObjects;

    public static CreateEscalationPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEscalationPlanRequest self = new CreateEscalationPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateEscalationPlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEscalationPlanRequest setEscalationPlanDescription(String escalationPlanDescription) {
        this.escalationPlanDescription = escalationPlanDescription;
        return this;
    }
    public String getEscalationPlanDescription() {
        return this.escalationPlanDescription;
    }

    public CreateEscalationPlanRequest setEscalationPlanName(String escalationPlanName) {
        this.escalationPlanName = escalationPlanName;
        return this;
    }
    public String getEscalationPlanName() {
        return this.escalationPlanName;
    }

    public CreateEscalationPlanRequest setEscalationPlanRules(java.util.List<CreateEscalationPlanRequestEscalationPlanRules> escalationPlanRules) {
        this.escalationPlanRules = escalationPlanRules;
        return this;
    }
    public java.util.List<CreateEscalationPlanRequestEscalationPlanRules> getEscalationPlanRules() {
        return this.escalationPlanRules;
    }

    public CreateEscalationPlanRequest setEscalationPlanScopeObjects(java.util.List<CreateEscalationPlanRequestEscalationPlanScopeObjects> escalationPlanScopeObjects) {
        this.escalationPlanScopeObjects = escalationPlanScopeObjects;
        return this;
    }
    public java.util.List<CreateEscalationPlanRequestEscalationPlanScopeObjects> getEscalationPlanScopeObjects() {
        return this.escalationPlanScopeObjects;
    }

    public static class CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions extends TeaModel {
        // 影响等级
        @NameInMap("effection")
        public String effection;

        // 事件等级
        @NameInMap("level")
        public String level;

        public static CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions self = new CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions();
            return TeaModel.build(map, self);
        }

        public CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions setEffection(String effection) {
            this.effection = effection;
            return this;
        }
        public String getEffection() {
            return this.effection;
        }

        public CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies extends TeaModel {
        // 升级通知策略
        @NameInMap("noticeChannels")
        public java.util.List<String> noticeChannels;

        // 升级通知对象id列表
        @NameInMap("noticeObjects")
        public java.util.List<Long> noticeObjects;

        // 通知时间
        @NameInMap("noticeTime")
        public String noticeTime;

        public static CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies build(java.util.Map<String, ?> map) throws Exception {
            CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies self = new CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies();
            return TeaModel.build(map, self);
        }

        public CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies setNoticeChannels(java.util.List<String> noticeChannels) {
            this.noticeChannels = noticeChannels;
            return this;
        }
        public java.util.List<String> getNoticeChannels() {
            return this.noticeChannels;
        }

        public CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies setNoticeObjects(java.util.List<Long> noticeObjects) {
            this.noticeObjects = noticeObjects;
            return this;
        }
        public java.util.List<Long> getNoticeObjects() {
            return this.noticeObjects;
        }

        public CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies setNoticeTime(String noticeTime) {
            this.noticeTime = noticeTime;
            return this;
        }
        public String getNoticeTime() {
            return this.noticeTime;
        }

    }

    public static class CreateEscalationPlanRequestEscalationPlanRules extends TeaModel {
        // 升级条件
        @NameInMap("escalationPlanConditions")
        public java.util.List<CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions> escalationPlanConditions;

        // 升级策略
        @NameInMap("escalationPlanStrategies")
        public java.util.List<CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies> escalationPlanStrategies;

        // 升级类型
        @NameInMap("escalationPlanType")
        public String escalationPlanType;

        public static CreateEscalationPlanRequestEscalationPlanRules build(java.util.Map<String, ?> map) throws Exception {
            CreateEscalationPlanRequestEscalationPlanRules self = new CreateEscalationPlanRequestEscalationPlanRules();
            return TeaModel.build(map, self);
        }

        public CreateEscalationPlanRequestEscalationPlanRules setEscalationPlanConditions(java.util.List<CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions> escalationPlanConditions) {
            this.escalationPlanConditions = escalationPlanConditions;
            return this;
        }
        public java.util.List<CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions> getEscalationPlanConditions() {
            return this.escalationPlanConditions;
        }

        public CreateEscalationPlanRequestEscalationPlanRules setEscalationPlanStrategies(java.util.List<CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies> escalationPlanStrategies) {
            this.escalationPlanStrategies = escalationPlanStrategies;
            return this;
        }
        public java.util.List<CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies> getEscalationPlanStrategies() {
            return this.escalationPlanStrategies;
        }

        public CreateEscalationPlanRequestEscalationPlanRules setEscalationPlanType(String escalationPlanType) {
            this.escalationPlanType = escalationPlanType;
            return this;
        }
        public String getEscalationPlanType() {
            return this.escalationPlanType;
        }

    }

    public static class CreateEscalationPlanRequestEscalationPlanScopeObjects extends TeaModel {
        // 范围对象类型
        @NameInMap("scope")
        public String scope;

        // 范围对象id
        @NameInMap("scopeObjectId")
        public Long scopeObjectId;

        public static CreateEscalationPlanRequestEscalationPlanScopeObjects build(java.util.Map<String, ?> map) throws Exception {
            CreateEscalationPlanRequestEscalationPlanScopeObjects self = new CreateEscalationPlanRequestEscalationPlanScopeObjects();
            return TeaModel.build(map, self);
        }

        public CreateEscalationPlanRequestEscalationPlanScopeObjects setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public CreateEscalationPlanRequestEscalationPlanScopeObjects setScopeObjectId(Long scopeObjectId) {
            this.scopeObjectId = scopeObjectId;
            return this;
        }
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

    }

}
