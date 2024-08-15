// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetEscalationPlanResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public GetEscalationPlanResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A5A1FEAE-9C47-011C-9C73-A376BC2REQUEST</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>LOW</p>
         */
        @NameInMap("effection")
        public String effection;

        /**
         * <strong>example:</strong>
         * <p>P1</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("noticeObjectId")
        public Long noticeObjectId;

        /**
         * <strong>example:</strong>
         * <p>张老三</p>
         */
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

    public static class GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeRoleObjectList extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        public static GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeRoleObjectList build(java.util.Map<String, ?> map) throws Exception {
            GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeRoleObjectList self = new GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeRoleObjectList();
            return TeaModel.build(map, self);
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeRoleObjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeRoleObjectList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesServiceGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>343</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>VCD是</p>
         */
        @NameInMap("serviceGroupName")
        public String serviceGroupName;

        public static GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesServiceGroups build(java.util.Map<String, ?> map) throws Exception {
            GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesServiceGroups self = new GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesServiceGroups();
            return TeaModel.build(map, self);
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesServiceGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesServiceGroups setServiceGroupName(String serviceGroupName) {
            this.serviceGroupName = serviceGroupName;
            return this;
        }
        public String getServiceGroupName() {
            return this.serviceGroupName;
        }

    }

    public static class GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableWebhook")
        public Boolean enableWebhook;

        /**
         * <strong>example:</strong>
         * <p>UN_ACKNOWLEDGE</p>
         */
        @NameInMap("escalationPlanType")
        public String escalationPlanType;

        /**
         * <strong>example:</strong>
         * <p>SMS</p>
         */
        @NameInMap("noticeChannels")
        public String noticeChannels;

        @NameInMap("noticeObjectList")
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeObjectList> noticeObjectList;

        @NameInMap("noticeObjects")
        public java.util.List<Long> noticeObjects;

        @NameInMap("noticeRoleList")
        public java.util.List<Long> noticeRoleList;

        @NameInMap("noticeRoleObjectList")
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeRoleObjectList> noticeRoleObjectList;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("noticeTime")
        public Long noticeTime;

        @NameInMap("serviceGroups")
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesServiceGroups> serviceGroups;

        public static GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies build(java.util.Map<String, ?> map) throws Exception {
            GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies self = new GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies();
            return TeaModel.build(map, self);
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies setEnableWebhook(Boolean enableWebhook) {
            this.enableWebhook = enableWebhook;
            return this;
        }
        public Boolean getEnableWebhook() {
            return this.enableWebhook;
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

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies setNoticeObjects(java.util.List<Long> noticeObjects) {
            this.noticeObjects = noticeObjects;
            return this;
        }
        public java.util.List<Long> getNoticeObjects() {
            return this.noticeObjects;
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies setNoticeRoleList(java.util.List<Long> noticeRoleList) {
            this.noticeRoleList = noticeRoleList;
            return this;
        }
        public java.util.List<Long> getNoticeRoleList() {
            return this.noticeRoleList;
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies setNoticeRoleObjectList(java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeRoleObjectList> noticeRoleObjectList) {
            this.noticeRoleObjectList = noticeRoleObjectList;
            return this;
        }
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesNoticeRoleObjectList> getNoticeRoleObjectList() {
            return this.noticeRoleObjectList;
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies setNoticeTime(Long noticeTime) {
            this.noticeTime = noticeTime;
            return this;
        }
        public Long getNoticeTime() {
            return this.noticeTime;
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategies setServiceGroups(java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesServiceGroups> serviceGroups) {
            this.serviceGroups = serviceGroups;
            return this;
        }
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanStrategiesServiceGroups> getServiceGroups() {
            return this.serviceGroups;
        }

    }

    public static class GetEscalationPlanResponseBodyDataEscalationPlanRules extends TeaModel {
        @NameInMap("escalationPlanConditions")
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRulesEscalationPlanConditions> escalationPlanConditions;

        /**
         * <strong>example:</strong>
         * <p>345</p>
         */
        @NameInMap("escalationPlanRuleId")
        public Long escalationPlanRuleId;

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
        @NameInMap("escalationPlanScopeObjects")
        public Integer escalationPlanScopeObjects;

        /**
         * <strong>example:</strong>
         * <p>SERVICE</p>
         */
        @NameInMap("scope")
        public String scope;

        @NameInMap("scopeObjectDeletedType")
        public Integer scopeObjectDeletedType;

        /**
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("scopeObjectId")
        public Long scopeObjectId;

        /**
         * <strong>example:</strong>
         * <p>xx服务</p>
         */
        @NameInMap("scopeObjectName")
        public String scopeObjectName;

        public static GetEscalationPlanResponseBodyDataEscalationPlanScopeObjects build(java.util.Map<String, ?> map) throws Exception {
            GetEscalationPlanResponseBodyDataEscalationPlanScopeObjects self = new GetEscalationPlanResponseBodyDataEscalationPlanScopeObjects();
            return TeaModel.build(map, self);
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanScopeObjects setEscalationPlanScopeObjects(Integer escalationPlanScopeObjects) {
            this.escalationPlanScopeObjects = escalationPlanScopeObjects;
            return this;
        }
        public Integer getEscalationPlanScopeObjects() {
            return this.escalationPlanScopeObjects;
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanScopeObjects setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetEscalationPlanResponseBodyDataEscalationPlanScopeObjects setScopeObjectDeletedType(Integer scopeObjectDeletedType) {
            this.scopeObjectDeletedType = scopeObjectDeletedType;
            return this;
        }
        public Integer getScopeObjectDeletedType() {
            return this.scopeObjectDeletedType;
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
        /**
         * <strong>example:</strong>
         * <p>2021-09-09 09:09:09</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>描述1234</p>
         */
        @NameInMap("escalationPlanDescription")
        public String escalationPlanDescription;

        /**
         * <strong>example:</strong>
         * <p>2345</p>
         */
        @NameInMap("escalationPlanId")
        public Long escalationPlanId;

        /**
         * <strong>example:</strong>
         * <p>升级计划234</p>
         */
        @NameInMap("escalationPlanName")
        public String escalationPlanName;

        @NameInMap("escalationPlanRules")
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanRules> escalationPlanRules;

        @NameInMap("escalationPlanScopeObjects")
        public java.util.List<GetEscalationPlanResponseBodyDataEscalationPlanScopeObjects> escalationPlanScopeObjects;

        @NameInMap("isGlobal")
        public Boolean isGlobal;

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

        public GetEscalationPlanResponseBodyData setIsGlobal(Boolean isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }
        public Boolean getIsGlobal() {
            return this.isGlobal;
        }

    }

}
