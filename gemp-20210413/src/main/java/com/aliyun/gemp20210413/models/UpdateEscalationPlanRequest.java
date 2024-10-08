// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateEscalationPlanRequest extends TeaModel {
    /**
     * <p>clientToken</p>
     * 
     * <strong>example:</strong>
     * <p>6b404f14-77d1-4b53-a1a1-30a58bbcfc57</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("escalationPlanDescription")
    public String escalationPlanDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>433</p>
     */
    @NameInMap("escalationPlanId")
    public Long escalationPlanId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("escalationPlanName")
    public String escalationPlanName;

    @NameInMap("escalationPlanRules")
    public java.util.List<UpdateEscalationPlanRequestEscalationPlanRules> escalationPlanRules;

    @NameInMap("escalationPlanScopeObjects")
    public java.util.List<UpdateEscalationPlanRequestEscalationPlanScopeObjects> escalationPlanScopeObjects;

    @NameInMap("isGlobal")
    public Boolean isGlobal;

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

    public UpdateEscalationPlanRequest setIsGlobal(Boolean isGlobal) {
        this.isGlobal = isGlobal;
        return this;
    }
    public Boolean getIsGlobal() {
        return this.isGlobal;
    }

    public static class UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions extends TeaModel {
        /**
         * <p>LOW HIGH</p>
         * 
         * <strong>example:</strong>
         * <p>LOW</p>
         */
        @NameInMap("effection")
        public String effection;

        /**
         * <p>P1 P2 P3 P4</p>
         * 
         * <strong>example:</strong>
         * <p>P1</p>
         */
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

        @NameInMap("noticeChannels")
        public java.util.List<String> noticeChannels;

        @NameInMap("noticeObjects")
        public java.util.List<Long> noticeObjects;

        @NameInMap("noticeRoleList")
        public java.util.List<Long> noticeRoleList;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("noticeTime")
        public Long noticeTime;

        @NameInMap("serviceGroupIds")
        public java.util.List<Long> serviceGroupIds;

        public static UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies build(java.util.Map<String, ?> map) throws Exception {
            UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies self = new UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies();
            return TeaModel.build(map, self);
        }

        public UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies setEnableWebhook(Boolean enableWebhook) {
            this.enableWebhook = enableWebhook;
            return this;
        }
        public Boolean getEnableWebhook() {
            return this.enableWebhook;
        }

        public UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies setEscalationPlanType(String escalationPlanType) {
            this.escalationPlanType = escalationPlanType;
            return this;
        }
        public String getEscalationPlanType() {
            return this.escalationPlanType;
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

        public UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies setNoticeRoleList(java.util.List<Long> noticeRoleList) {
            this.noticeRoleList = noticeRoleList;
            return this;
        }
        public java.util.List<Long> getNoticeRoleList() {
            return this.noticeRoleList;
        }

        public UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies setNoticeTime(Long noticeTime) {
            this.noticeTime = noticeTime;
            return this;
        }
        public Long getNoticeTime() {
            return this.noticeTime;
        }

        public UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies setServiceGroupIds(java.util.List<Long> serviceGroupIds) {
            this.serviceGroupIds = serviceGroupIds;
            return this;
        }
        public java.util.List<Long> getServiceGroupIds() {
            return this.serviceGroupIds;
        }

    }

    public static class UpdateEscalationPlanRequestEscalationPlanRules extends TeaModel {
        @NameInMap("escalationPlanConditions")
        public java.util.List<UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanConditions> escalationPlanConditions;

        @NameInMap("escalationPlanStrategies")
        public java.util.List<UpdateEscalationPlanRequestEscalationPlanRulesEscalationPlanStrategies> escalationPlanStrategies;

        /**
         * <strong>example:</strong>
         * <p>UN_ACKNOWLEDGE</p>
         */
        @NameInMap("escalationPlanType")
        public String escalationPlanType;

        /**
         * <strong>example:</strong>
         * <p>872</p>
         */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>87</p>
         */
        @NameInMap("id")
        public Long id;

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
         * <p>234</p>
         */
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
