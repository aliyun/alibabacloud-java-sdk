// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetEscalationPlanResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public GetEscalationPlanResponseBodyData data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetEscalationPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEscalationPlanResponseBody self = new GetEscalationPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEscalationPlanResponseBody setData(GetEscalationPlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEscalationPlanResponseBodyData getData() {
        return this.data;
    }

    public GetEscalationPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanConditions extends TeaModel {
        // 影响等级
        @NameInMap("effection")
        public String effection;

        // 事件等级
        @NameInMap("level")
        public String level;

        public static GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanConditions build(java.util.Map<String, ?> map) throws Exception {
            GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanConditions self = new GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanConditions();
            return TeaModel.build(map, self);
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanConditions setEffection(String effection) {
            this.effection = effection;
            return this;
        }
        public String getEffection() {
            return this.effection;
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanConditions setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeObjectList extends TeaModel {
        // 通知对象id
        @NameInMap("noticeObjectId")
        public Long noticeObjectId;

        // 通知对象名称
        @NameInMap("noticeObjectName")
        public String noticeObjectName;

        public static GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeObjectList build(java.util.Map<String, ?> map) throws Exception {
            GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeObjectList self = new GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeObjectList();
            return TeaModel.build(map, self);
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeObjectList setNoticeObjectId(Long noticeObjectId) {
            this.noticeObjectId = noticeObjectId;
            return this;
        }
        public Long getNoticeObjectId() {
            return this.noticeObjectId;
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeObjectList setNoticeObjectName(String noticeObjectName) {
            this.noticeObjectName = noticeObjectName;
            return this;
        }
        public String getNoticeObjectName() {
            return this.noticeObjectName;
        }

    }

    public static class GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies extends TeaModel {
        // 升级计划类型
        @NameInMap("escalationPlanType")
        public String escalationPlanType;

        // 通知对象渠道
        @NameInMap("noticeChannels")
        public String noticeChannels;

        // 通知对象列表
        @NameInMap("noticeObjectList")
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeObjectList> noticeObjectList;

        // 通知时间
        @NameInMap("noticeTime")
        public Long noticeTime;

        public static GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies build(java.util.Map<String, ?> map) throws Exception {
            GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies self = new GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies();
            return TeaModel.build(map, self);
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies setEscalationPlanType(String escalationPlanType) {
            this.escalationPlanType = escalationPlanType;
            return this;
        }
        public String getEscalationPlanType() {
            return this.escalationPlanType;
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies setNoticeChannels(String noticeChannels) {
            this.noticeChannels = noticeChannels;
            return this;
        }
        public String getNoticeChannels() {
            return this.noticeChannels;
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies setNoticeObjectList(java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeObjectList> noticeObjectList) {
            this.noticeObjectList = noticeObjectList;
            return this;
        }
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeObjectList> getNoticeObjectList() {
            return this.noticeObjectList;
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies setNoticeTime(Long noticeTime) {
            this.noticeTime = noticeTime;
            return this;
        }
        public Long getNoticeTime() {
            return this.noticeTime;
        }

    }

    public static class GetEscalationPlanResponseBodyDataEscalationPlanRules extends TeaModel {
        // 升级计划条件
        @NameInMap("escalationPlanConditions")
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanConditions> escalationPlanConditions;

        // 升级计划id
        @NameInMap("escalationPlanRuleId")
        public Long escalationPlanRuleId;

        // 升级计划策略
        @NameInMap("escalationPlanStrategies")
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies> escalationPlanStrategies;

        public static GetEscalationPlanResponseBodyDataEscalationPlanRules build(java.util.Map<String, ?> map) throws Exception {
            GetEscalationPlanResponseBodyDataEscalationPlanRules self = new GetEscalationPlanResponseBodyDataEscalationPlanRules();
            return TeaModel.build(map, self);
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRules setEscalationPlanConditions(java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanConditions> escalationPlanConditions) {
            this.escalationPlanConditions = escalationPlanConditions;
            return this;
        }
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanConditions> getEscalationPlanConditions() {
            return this.escalationPlanConditions;
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRules setEscalationPlanRuleId(Long escalationPlanRuleId) {
            this.escalationPlanRuleId = escalationPlanRuleId;
            return this;
        }
        public Long getEscalationPlanRuleId() {
            return this.escalationPlanRuleId;
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRules setEscalationPlanStrategies(java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies> escalationPlanStrategies) {
            this.escalationPlanStrategies = escalationPlanStrategies;
            return this;
        }
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies> getEscalationPlanStrategies() {
            return this.escalationPlanStrategies;
        }

    }

    public static class GetEscalationPlanResponseBodyDataEscalationPlanScopeObjects extends TeaModel {
        // 范围对象类型
        @NameInMap("scope")
        public String scope;

        // 范围对象id
        @NameInMap("scopeObjectId")
        public Long scopeObjectId;

        // 范围对象名称
        @NameInMap("scopeObjectName")
        public String scopeObjectName;

        public static GetEscalationPlanResponseBodyDataEscalationPlanScopeObjects build(java.util.Map<String, ?> map) throws Exception {
            GetEscalationPlanResponseBodyDataEscalationPlanScopeObjects self = new GetEscalationPlanResponseBodyDataEscalationPlanScopeObjects();
            return TeaModel.build(map, self);
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanScopeObjects setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanScopeObjects setScopeObjectId(Long scopeObjectId) {
            this.scopeObjectId = scopeObjectId;
            return this;
        }
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanScopeObjects setScopeObjectName(String scopeObjectName) {
            this.scopeObjectName = scopeObjectName;
            return this;
        }
        public String getScopeObjectName() {
            return this.scopeObjectName;
        }

    }

    public static class GetEscalationPlanResponseBodyData extends TeaModel {
        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 升级计划描述
        @NameInMap("escalationPlanDescription")
        public String escalationPlanDescription;

        // 升级计划id
        @NameInMap("escalationPlanId")
        public Long escalationPlanId;

        // 升级计划名称
        @NameInMap("escalationPlanName")
        public String escalationPlanName;

        // 升级计划规则列表
        @NameInMap("escalationPlanRules")
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRules> escalationPlanRules;

        // 升级计划范围对象列表
        @NameInMap("escalationPlanScopeObjects")
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanScopeObjects> escalationPlanScopeObjects;

        public static GetEscalationPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEscalationPlanResponseBodyData self = new GetEscalationPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEscalationPlanResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetEscalationPlanResponseBodyData setEscalationPlanDescription(String escalationPlanDescription) {
            this.escalationPlanDescription = escalationPlanDescription;
            return this;
        }
        public String getEscalationPlanDescription() {
            return this.escalationPlanDescription;
        }

        public GetEscalationPlanResponseBodyData setEscalationPlanId(Long escalationPlanId) {
            this.escalationPlanId = escalationPlanId;
            return this;
        }
        public Long getEscalationPlanId() {
            return this.escalationPlanId;
        }

        public GetEscalationPlanResponseBodyData setEscalationPlanName(String escalationPlanName) {
            this.escalationPlanName = escalationPlanName;
            return this;
        }
        public String getEscalationPlanName() {
            return this.escalationPlanName;
        }

        public GetEscalationPlanResponseBodyData setEscalationPlanRules(java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRules> escalationPlanRules) {
            this.escalationPlanRules = escalationPlanRules;
            return this;
        }
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRules> getEscalationPlanRules() {
            return this.escalationPlanRules;
        }

        public GetEscalationPlanResponseBodyData setEscalationPlanScopeObjects(java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanScopeObjects> escalationPlanScopeObjects) {
            this.escalationPlanScopeObjects = escalationPlanScopeObjects;
            return this;
        }
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanScopeObjects> getEscalationPlanScopeObjects() {
            return this.escalationPlanScopeObjects;
        }

    }

}
