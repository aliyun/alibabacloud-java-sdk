// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateSubscriptionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>601FA6A2-AC5C-4B59-BE11-378FTOKENA11</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>2021-11-03 10:10:10</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LONG_TERM</p>
     */
    @NameInMap("expiredType")
    public Long expiredType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("notifyObjectList")
    public java.util.List<CreateSubscriptionRequestNotifyObjectList> notifyObjectList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("notifyObjectType")
    public Long notifyObjectType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("notifyStrategyList")
    public java.util.List<CreateSubscriptionRequestNotifyStrategyList> notifyStrategyList;

    /**
     * <strong>example:</strong>
     * <p>1个月</p>
     */
    @NameInMap("period")
    public String period;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SERVICE</p>
     */
    @NameInMap("scope")
    public Long scope;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("scopeObjectList")
    public java.util.List<CreateSubscriptionRequestScopeObjectList> scopeObjectList;

    /**
     * <strong>example:</strong>
     * <p>2021-02-03 10:10:10</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testSubscription</p>
     */
    @NameInMap("subscriptionTitle")
    public String subscriptionTitle;

    public static CreateSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscriptionRequest self = new CreateSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubscriptionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSubscriptionRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateSubscriptionRequest setExpiredType(Long expiredType) {
        this.expiredType = expiredType;
        return this;
    }
    public Long getExpiredType() {
        return this.expiredType;
    }

    public CreateSubscriptionRequest setNotifyObjectList(java.util.List<CreateSubscriptionRequestNotifyObjectList> notifyObjectList) {
        this.notifyObjectList = notifyObjectList;
        return this;
    }
    public java.util.List<CreateSubscriptionRequestNotifyObjectList> getNotifyObjectList() {
        return this.notifyObjectList;
    }

    public CreateSubscriptionRequest setNotifyObjectType(Long notifyObjectType) {
        this.notifyObjectType = notifyObjectType;
        return this;
    }
    public Long getNotifyObjectType() {
        return this.notifyObjectType;
    }

    public CreateSubscriptionRequest setNotifyStrategyList(java.util.List<CreateSubscriptionRequestNotifyStrategyList> notifyStrategyList) {
        this.notifyStrategyList = notifyStrategyList;
        return this;
    }
    public java.util.List<CreateSubscriptionRequestNotifyStrategyList> getNotifyStrategyList() {
        return this.notifyStrategyList;
    }

    public CreateSubscriptionRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateSubscriptionRequest setScope(Long scope) {
        this.scope = scope;
        return this;
    }
    public Long getScope() {
        return this.scope;
    }

    public CreateSubscriptionRequest setScopeObjectList(java.util.List<CreateSubscriptionRequestScopeObjectList> scopeObjectList) {
        this.scopeObjectList = scopeObjectList;
        return this;
    }
    public java.util.List<CreateSubscriptionRequestScopeObjectList> getScopeObjectList() {
        return this.scopeObjectList;
    }

    public CreateSubscriptionRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateSubscriptionRequest setSubscriptionTitle(String subscriptionTitle) {
        this.subscriptionTitle = subscriptionTitle;
        return this;
    }
    public String getSubscriptionTitle() {
        return this.subscriptionTitle;
    }

    public static class CreateSubscriptionRequestNotifyObjectList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("notifyObjectId")
        public Long notifyObjectId;

        public static CreateSubscriptionRequestNotifyObjectList build(java.util.Map<String, ?> map) throws Exception {
            CreateSubscriptionRequestNotifyObjectList self = new CreateSubscriptionRequestNotifyObjectList();
            return TeaModel.build(map, self);
        }

        public CreateSubscriptionRequestNotifyObjectList setNotifyObjectId(Long notifyObjectId) {
            this.notifyObjectId = notifyObjectId;
            return this;
        }
        public Long getNotifyObjectId() {
            return this.notifyObjectId;
        }

    }

    public static class CreateSubscriptionRequestNotifyStrategyListPeriodChannel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SMS,PHONE</p>
         */
        @NameInMap("nonWorkday")
        public String nonWorkday;

        /**
         * <strong>example:</strong>
         * <p>SMS,PHONE</p>
         */
        @NameInMap("workday")
        public String workday;

        public static CreateSubscriptionRequestNotifyStrategyListPeriodChannel build(java.util.Map<String, ?> map) throws Exception {
            CreateSubscriptionRequestNotifyStrategyListPeriodChannel self = new CreateSubscriptionRequestNotifyStrategyListPeriodChannel();
            return TeaModel.build(map, self);
        }

        public CreateSubscriptionRequestNotifyStrategyListPeriodChannel setNonWorkday(String nonWorkday) {
            this.nonWorkday = nonWorkday;
            return this;
        }
        public String getNonWorkday() {
            return this.nonWorkday;
        }

        public CreateSubscriptionRequestNotifyStrategyListPeriodChannel setWorkday(String workday) {
            this.workday = workday;
            return this;
        }
        public String getWorkday() {
            return this.workday;
        }

    }

    public static class CreateSubscriptionRequestNotifyStrategyListStrategiesConditions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>INCIDENT_TRIGGER</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        @NameInMap("effection")
        public String effection;

        /**
         * <strong>example:</strong>
         * <p>P1</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>PROBLEM_UPDATE</p>
         */
        @NameInMap("problemNotifyType")
        public String problemNotifyType;

        public static CreateSubscriptionRequestNotifyStrategyListStrategiesConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateSubscriptionRequestNotifyStrategyListStrategiesConditions self = new CreateSubscriptionRequestNotifyStrategyListStrategiesConditions();
            return TeaModel.build(map, self);
        }

        public CreateSubscriptionRequestNotifyStrategyListStrategiesConditions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateSubscriptionRequestNotifyStrategyListStrategiesConditions setEffection(String effection) {
            this.effection = effection;
            return this;
        }
        public String getEffection() {
            return this.effection;
        }

        public CreateSubscriptionRequestNotifyStrategyListStrategiesConditions setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateSubscriptionRequestNotifyStrategyListStrategiesConditions setProblemNotifyType(String problemNotifyType) {
            this.problemNotifyType = problemNotifyType;
            return this;
        }
        public String getProblemNotifyType() {
            return this.problemNotifyType;
        }

    }

    public static class CreateSubscriptionRequestNotifyStrategyListStrategies extends TeaModel {
        @NameInMap("conditions")
        public java.util.List<CreateSubscriptionRequestNotifyStrategyListStrategiesConditions> conditions;

        public static CreateSubscriptionRequestNotifyStrategyListStrategies build(java.util.Map<String, ?> map) throws Exception {
            CreateSubscriptionRequestNotifyStrategyListStrategies self = new CreateSubscriptionRequestNotifyStrategyListStrategies();
            return TeaModel.build(map, self);
        }

        public CreateSubscriptionRequestNotifyStrategyListStrategies setConditions(java.util.List<CreateSubscriptionRequestNotifyStrategyListStrategiesConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<CreateSubscriptionRequestNotifyStrategyListStrategiesConditions> getConditions() {
            return this.conditions;
        }

    }

    public static class CreateSubscriptionRequestNotifyStrategyList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SMS,PHONE</p>
         */
        @NameInMap("channels")
        public String channels;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INCIDENT</p>
         */
        @NameInMap("instanceType")
        public Long instanceType;

        @NameInMap("periodChannel")
        public CreateSubscriptionRequestNotifyStrategyListPeriodChannel periodChannel;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("strategies")
        public java.util.List<CreateSubscriptionRequestNotifyStrategyListStrategies> strategies;

        public static CreateSubscriptionRequestNotifyStrategyList build(java.util.Map<String, ?> map) throws Exception {
            CreateSubscriptionRequestNotifyStrategyList self = new CreateSubscriptionRequestNotifyStrategyList();
            return TeaModel.build(map, self);
        }

        public CreateSubscriptionRequestNotifyStrategyList setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public CreateSubscriptionRequestNotifyStrategyList setInstanceType(Long instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Long getInstanceType() {
            return this.instanceType;
        }

        public CreateSubscriptionRequestNotifyStrategyList setPeriodChannel(CreateSubscriptionRequestNotifyStrategyListPeriodChannel periodChannel) {
            this.periodChannel = periodChannel;
            return this;
        }
        public CreateSubscriptionRequestNotifyStrategyListPeriodChannel getPeriodChannel() {
            return this.periodChannel;
        }

        public CreateSubscriptionRequestNotifyStrategyList setStrategies(java.util.List<CreateSubscriptionRequestNotifyStrategyListStrategies> strategies) {
            this.strategies = strategies;
            return this;
        }
        public java.util.List<CreateSubscriptionRequestNotifyStrategyListStrategies> getStrategies() {
            return this.strategies;
        }

    }

    public static class CreateSubscriptionRequestScopeObjectList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("scopeObjectId")
        public Long scopeObjectId;

        public static CreateSubscriptionRequestScopeObjectList build(java.util.Map<String, ?> map) throws Exception {
            CreateSubscriptionRequestScopeObjectList self = new CreateSubscriptionRequestScopeObjectList();
            return TeaModel.build(map, self);
        }

        public CreateSubscriptionRequestScopeObjectList setScopeObjectId(Long scopeObjectId) {
            this.scopeObjectId = scopeObjectId;
            return this;
        }
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

    }

}
