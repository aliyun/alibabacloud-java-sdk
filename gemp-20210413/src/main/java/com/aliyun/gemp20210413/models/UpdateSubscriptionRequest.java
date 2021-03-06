// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateSubscriptionRequest extends TeaModel {
    // 主键
    @NameInMap("subscriptionId")
    public Long subscriptionId;

    // 通知订阅名称
    @NameInMap("subscriptionTitle")
    public String subscriptionTitle;

    // 订阅范围类型
    @NameInMap("scope")
    public String scope;

    // 通知对象类型
    @NameInMap("notifyObjectType")
    public String notifyObjectType;

    // 订阅时效
    @NameInMap("expiredType")
    public String expiredType;

    // 订阅范围列表
    @NameInMap("scopeObjectList")
    public java.util.List<UpdateSubscriptionRequestScopeObjectList> scopeObjectList;

    // 通知对象列表
    @NameInMap("notifyObjectList")
    public java.util.List<UpdateSubscriptionRequestNotifyObjectList> notifyObjectList;

    // 通知策略列表
    @NameInMap("notifyStrategyList")
    public java.util.List<UpdateSubscriptionRequestNotifyStrategyList> notifyStrategyList;

    // 开始时间
    @NameInMap("startTime")
    public String startTime;

    // 结束时间
    @NameInMap("endTime")
    public String endTime;

    public static UpdateSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscriptionRequest self = new UpdateSubscriptionRequest();
        return TeaModel.build(map, self);
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

    public UpdateSubscriptionRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UpdateSubscriptionRequest setNotifyObjectType(String notifyObjectType) {
        this.notifyObjectType = notifyObjectType;
        return this;
    }
    public String getNotifyObjectType() {
        return this.notifyObjectType;
    }

    public UpdateSubscriptionRequest setExpiredType(String expiredType) {
        this.expiredType = expiredType;
        return this;
    }
    public String getExpiredType() {
        return this.expiredType;
    }

    public UpdateSubscriptionRequest setScopeObjectList(java.util.List<UpdateSubscriptionRequestScopeObjectList> scopeObjectList) {
        this.scopeObjectList = scopeObjectList;
        return this;
    }
    public java.util.List<UpdateSubscriptionRequestScopeObjectList> getScopeObjectList() {
        return this.scopeObjectList;
    }

    public UpdateSubscriptionRequest setNotifyObjectList(java.util.List<UpdateSubscriptionRequestNotifyObjectList> notifyObjectList) {
        this.notifyObjectList = notifyObjectList;
        return this;
    }
    public java.util.List<UpdateSubscriptionRequestNotifyObjectList> getNotifyObjectList() {
        return this.notifyObjectList;
    }

    public UpdateSubscriptionRequest setNotifyStrategyList(java.util.List<UpdateSubscriptionRequestNotifyStrategyList> notifyStrategyList) {
        this.notifyStrategyList = notifyStrategyList;
        return this;
    }
    public java.util.List<UpdateSubscriptionRequestNotifyStrategyList> getNotifyStrategyList() {
        return this.notifyStrategyList;
    }

    public UpdateSubscriptionRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateSubscriptionRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public static class UpdateSubscriptionRequestScopeObjectList extends TeaModel {
        // 主键id
        @NameInMap("id")
        public Long id;

        // 订阅范围对象id
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

    public static class UpdateSubscriptionRequestNotifyObjectList extends TeaModel {
        // 主键id
        @NameInMap("id")
        public Long id;

        // 通知对象id
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
        // 等级
        @NameInMap("level")
        public String level;

        // 影响程度
        @NameInMap("effection")
        public String effection;

        // 故障通知类型
        @NameInMap("problemNotifyType")
        public String problemNotifyType;

        public static UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions self = new UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions();
            return TeaModel.build(map, self);
        }

        public UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions setEffection(String effection) {
            this.effection = effection;
            return this;
        }
        public String getEffection() {
            return this.effection;
        }

        public UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions setProblemNotifyType(String problemNotifyType) {
            this.problemNotifyType = problemNotifyType;
            return this;
        }
        public String getProblemNotifyType() {
            return this.problemNotifyType;
        }

    }

    public static class UpdateSubscriptionRequestNotifyStrategyListStrategies extends TeaModel {
        // id
        @NameInMap("id")
        public String id;

        // 故障等级
        @NameInMap("channels")
        public String channels;

        // 影响程度
        @NameInMap("conditions")
        public java.util.List<UpdateSubscriptionRequestNotifyStrategyListStrategiesConditions> conditions;

        public static UpdateSubscriptionRequestNotifyStrategyListStrategies build(java.util.Map<String, ?> map) throws Exception {
            UpdateSubscriptionRequestNotifyStrategyListStrategies self = new UpdateSubscriptionRequestNotifyStrategyListStrategies();
            return TeaModel.build(map, self);
        }

        public UpdateSubscriptionRequestNotifyStrategyListStrategies setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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

    }

    public static class UpdateSubscriptionRequestNotifyStrategyList extends TeaModel {
        // 订阅实例类型，事件、报警、故障
        @NameInMap("instanceType")
        public Long instanceType;

        // 通知策略
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

}
