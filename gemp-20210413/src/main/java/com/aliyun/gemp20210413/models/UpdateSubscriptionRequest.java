// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateSubscriptionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2022-05-09 10:10:23</p>
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
    public String expiredType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("notifyObjectList")
    public java.util.List<UpdateSubscriptionRequestNotifyObjectList> notifyObjectList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("notifyObjectType")
    public String notifyObjectType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("notifyStrategyList")
    public java.util.List<UpdateSubscriptionRequestNotifyStrategyList> notifyStrategyList;

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
    public String scope;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("scopeObjectList")
    public java.util.List<UpdateSubscriptionRequestScopeObjectList> scopeObjectList;

    /**
     * <strong>example:</strong>
     * <p>2021-04-04 10:10:11</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80002020</p>
     */
    @NameInMap("subscriptionId")
    public Long subscriptionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>newSubs244</p>
     */
    @NameInMap("subscriptionTitle")
    public String subscriptionTitle;

    public static UpdateSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscriptionRequest self = new UpdateSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubscriptionRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateSubscriptionRequest setExpiredType(String expiredType) {
        this.expiredType = expiredType;
        return this;
    }
    public String getExpiredType() {
        return this.expiredType;
    }

    public UpdateSubscriptionRequest setNotifyObjectList(java.util.List<UpdateSubscriptionRequestNotifyObjectList> notifyObjectList) {
        this.notifyObjectList = notifyObjectList;
        return this;
    }
    public java.util.List<UpdateSubscriptionRequestNotifyObjectList> getNotifyObjectList() {
        return this.notifyObjectList;
    }

    public UpdateSubscriptionRequest setNotifyObjectType(String notifyObjectType) {
        this.notifyObjectType = notifyObjectType;
        return this;
    }
    public String getNotifyObjectType() {
        return this.notifyObjectType;
    }

    public UpdateSubscriptionRequest setNotifyStrategyList(java.util.List<UpdateSubscriptionRequestNotifyStrategyList> notifyStrategyList) {
        this.notifyStrategyList = notifyStrategyList;
        return this;
    }
    public java.util.List<UpdateSubscriptionRequestNotifyStrategyList> getNotifyStrategyList() {
        return this.notifyStrategyList;
    }

    public UpdateSubscriptionRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public UpdateSubscriptionRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UpdateSubscriptionRequest setScopeObjectList(java.util.List<UpdateSubscriptionRequestScopeObjectList> scopeObjectList) {
        this.scopeObjectList = scopeObjectList;
        return this;
    }
    public java.util.List<UpdateSubscriptionRequestScopeObjectList> getScopeObjectList() {
        return this.scopeObjectList;
    }

    public UpdateSubscriptionRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateSubscriptionRequest setSubscriptionId(Long subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    public Long getSubscriptionId() {
        return this.subscriptionId;
    }

    public UpdateSubscriptionRequest setSubscriptionTitle(String subscriptionTitle) {
        this.subscriptionTitle = subscriptionTitle;
        return this;
    }
    public String getSubscriptionTitle() {
        return this.subscriptionTitle;
    }

    public static class UpdateSubscriptionRequestNotifyObjectList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("notifyObjectId")
        public Long notifyObjectId;

        public static UpdateSubscriptionRequestNotifyObjectList build(java.util.Map<String, ?> map) throws Exception {
            UpdateSubscriptionRequestNotifyObjectList self = new UpdateSubscriptionRequestNotifyObjectList();
            return TeaModel.build(map, self);
        }

        public UpdateSubscriptionRequestNotifyObjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateSubscriptionRequestNotifyObjectList setNotifyObjectId(Long notifyObjectId) {
            this.notifyObjectId = notifyObjectId;
            return this;
        }
        public Long getNotifyObjectId() {
            return this.notifyObjectId;
        }

    }

    public static class UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions extends TeaModel {
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
         * <p>PROBLEM_NOTIFY</p>
         */
        @NameInMap("problemNotifyType")
        public String problemNotifyType;

        public static UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions self = new UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions();
            return TeaModel.build(map, self);
        }

        public UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions setEffection(String effection) {
            this.effection = effection;
            return this;
        }
        public String getEffection() {
            return this.effection;
        }

        public UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions setProblemNotifyType(String problemNotifyType) {
            this.problemNotifyType = problemNotifyType;
            return this;
        }
        public String getProblemNotifyType() {
            return this.problemNotifyType;
        }

    }

    public static class UpdateSubscriptionRequestNotifyStrategyListStrategiesPeriodChannel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SMS,WEIXIN_GROUP</p>
         */
        @NameInMap("nonWorkday")
        public String nonWorkday;

        /**
         * <strong>example:</strong>
         * <p>SMS,WEIXIN_GROUP</p>
         */
        @NameInMap("workday")
        public String workday;

        public static UpdateSubscriptionRequestNotifyStrategyListStrategiesPeriodChannel build(java.util.Map<String, ?> map) throws Exception {
            UpdateSubscriptionRequestNotifyStrategyListStrategiesPeriodChannel self = new UpdateSubscriptionRequestNotifyStrategyListStrategiesPeriodChannel();
            return TeaModel.build(map, self);
        }

        public UpdateSubscriptionRequestNotifyStrategyListStrategiesPeriodChannel setNonWorkday(String nonWorkday) {
            this.nonWorkday = nonWorkday;
            return this;
        }
        public String getNonWorkday() {
            return this.nonWorkday;
        }

        public UpdateSubscriptionRequestNotifyStrategyListStrategiesPeriodChannel setWorkday(String workday) {
            this.workday = workday;
            return this;
        }
        public String getWorkday() {
            return this.workday;
        }

    }

    public static class UpdateSubscriptionRequestNotifyStrategyListStrategies extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SMS,WEIXIN_GROUP</p>
         */
        @NameInMap("channels")
        public String channels;

        @NameInMap("conditions")
        public java.util.List<UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions> conditions;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("periodChannel")
        public UpdateSubscriptionRequestNotifyStrategyListStrategiesPeriodChannel periodChannel;

        public static UpdateSubscriptionRequestNotifyStrategyListStrategies build(java.util.Map<String, ?> map) throws Exception {
            UpdateSubscriptionRequestNotifyStrategyListStrategies self = new UpdateSubscriptionRequestNotifyStrategyListStrategies();
            return TeaModel.build(map, self);
        }

        public UpdateSubscriptionRequestNotifyStrategyListStrategies setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public UpdateSubscriptionRequestNotifyStrategyListStrategies setConditions(java.util.List<UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions> getConditions() {
            return this.conditions;
        }

        public UpdateSubscriptionRequestNotifyStrategyListStrategies setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateSubscriptionRequestNotifyStrategyListStrategies setPeriodChannel(UpdateSubscriptionRequestNotifyStrategyListStrategiesPeriodChannel periodChannel) {
            this.periodChannel = periodChannel;
            return this;
        }
        public UpdateSubscriptionRequestNotifyStrategyListStrategiesPeriodChannel getPeriodChannel() {
            return this.periodChannel;
        }

    }

    public static class UpdateSubscriptionRequestNotifyStrategyList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INCIDENT</p>
         */
        @NameInMap("instanceType")
        public Long instanceType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("strategies")
        public java.util.List<UpdateSubscriptionRequestNotifyStrategyListStrategies> strategies;

        public static UpdateSubscriptionRequestNotifyStrategyList build(java.util.Map<String, ?> map) throws Exception {
            UpdateSubscriptionRequestNotifyStrategyList self = new UpdateSubscriptionRequestNotifyStrategyList();
            return TeaModel.build(map, self);
        }

        public UpdateSubscriptionRequestNotifyStrategyList setInstanceType(Long instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Long getInstanceType() {
            return this.instanceType;
        }

        public UpdateSubscriptionRequestNotifyStrategyList setStrategies(java.util.List<UpdateSubscriptionRequestNotifyStrategyListStrategies> strategies) {
            this.strategies = strategies;
            return this;
        }
        public java.util.List<UpdateSubscriptionRequestNotifyStrategyListStrategies> getStrategies() {
            return this.strategies;
        }

    }

    public static class UpdateSubscriptionRequestScopeObjectList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("scopeObjectId")
        public Long scopeObjectId;

        public static UpdateSubscriptionRequestScopeObjectList build(java.util.Map<String, ?> map) throws Exception {
            UpdateSubscriptionRequestScopeObjectList self = new UpdateSubscriptionRequestScopeObjectList();
            return TeaModel.build(map, self);
        }

        public UpdateSubscriptionRequestScopeObjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateSubscriptionRequestScopeObjectList setScopeObjectId(Long scopeObjectId) {
            this.scopeObjectId = scopeObjectId;
            return this;
        }
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

    }

}
