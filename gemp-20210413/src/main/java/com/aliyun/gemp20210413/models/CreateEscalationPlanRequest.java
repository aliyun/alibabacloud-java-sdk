// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateEscalationPlanRequest extends TeaModel {
    /**
     * <p>clientToken</p>
     * 
     * <strong>example:</strong>
     * <p>6b404f14-77d1-4b53-a1a1-30a58bREQUEST</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>desc2322424</p>
     */
    @NameInMap("escalationPlanDescription")
    public String escalationPlanDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name123</p>
     */
    @NameInMap("escalationPlanName")
    public String escalationPlanName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("escalationPlanRules")
    public java.util.List<CreateEscalationPlanRequestEscalationPlanRules> escalationPlanRules;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("escalationPlanScopeObjects")
    public java.util.List<CreateEscalationPlanRequestEscalationPlanScopeObjects> escalationPlanScopeObjects;

    @NameInMap("isGlobal")
    public Boolean isGlobal;

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

    public CreateEscalationPlanRequest setIsGlobal(Boolean isGlobal) {
        this.isGlobal = isGlobal;
        return this;
    }
    public Boolean getIsGlobal() {
        return this.isGlobal;
    }

    public static class CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions extends TeaModel {
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableWebhook")
        public Boolean enableWebhook;

        @NameInMap("escalationPlanType")
        public String escalationPlanType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("noticeChannels")
        public java.util.List<String> noticeChannels;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("noticeObjects")
        public java.util.List<Long> noticeObjects;

        @NameInMap("noticeRoleList")
        public java.util.List<Long> noticeRoleList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("noticeTime")
        public String noticeTime;

        @NameInMap("serviceGroupIds")
        public java.util.List<Long> serviceGroupIds;

        public static CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies build(java.util.Map<String, ?> map) throws Exception {
            CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies self = new CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies();
            return TeaModel.build(map, self);
        }

        public CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies setEnableWebhook(Boolean enableWebhook) {
            this.enableWebhook = enableWebhook;
            return this;
        }
        public Boolean getEnableWebhook() {
            return this.enableWebhook;
        }

        public CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies setEscalationPlanType(String escalationPlanType) {
            this.escalationPlanType = escalationPlanType;
            return this;
        }
        public String getEscalationPlanType() {
            return this.escalationPlanType;
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

        public CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies setNoticeRoleList(java.util.List<Long> noticeRoleList) {
            this.noticeRoleList = noticeRoleList;
            return this;
        }
        public java.util.List<Long> getNoticeRoleList() {
            return this.noticeRoleList;
        }

        public CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies setNoticeTime(String noticeTime) {
            this.noticeTime = noticeTime;
            return this;
        }
        public String getNoticeTime() {
            return this.noticeTime;
        }

        public CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies setServiceGroupIds(java.util.List<Long> serviceGroupIds) {
            this.serviceGroupIds = serviceGroupIds;
            return this;
        }
        public java.util.List<Long> getServiceGroupIds() {
            return this.serviceGroupIds;
        }

    }

    public static class CreateEscalationPlanRequestEscalationPlanRules extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("escalationPlanConditions")
        public java.util.List<CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions> escalationPlanConditions;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("escalationPlanStrategies")
        public java.util.List<CreateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies> escalationPlanStrategies;

        /**
         * <strong>example:</strong>
         * <p>UN_FINISH</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>SERVICE</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23433</p>
         */
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
