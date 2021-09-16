// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateSubscriptionRequest extends TeaModel {
    // 通知订阅名称
    @NameInMap("subscriptionTitle")
    public String subscriptionTitle;

    // 订阅范围类型
    @NameInMap("scope")
    public Long scope;

    // 通知对象类型
    @NameInMap("notifyObjectType")
    public Long notifyObjectType;

    // 订阅时效
    @NameInMap("expiredType")
    public Long expiredType;

    // 订阅范围列表
    @NameInMap("scopeObjectList")
    public java.util.List<CreateSubscriptionRequestScopeObjectList> scopeObjectList;

    // 通知对象列表
    @NameInMap("notifyObjectList")
    public java.util.List<CreateSubscriptionRequestNotifyObjectList> notifyObjectList;

    // 通知策略列表
    @NameInMap("notifyStrategyList")
    public java.util.List<CreateSubscriptionRequestNotifyStrategyList> notifyStrategyList;

    // 幂等参数
    @NameInMap("clientToken")
    public String clientToken;

    // 开始时间
    @NameInMap("startTime")
    public String startTime;

    // 结束时间
    @NameInMap("endTime")
    public String endTime;

    public static CreateSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscriptionRequest self = new CreateSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubscriptionRequest setSubscriptionTitle(String subscriptionTitle) {
        this.subscriptionTitle = subscriptionTitle;
        return this;
    }
    public String getSubscriptionTitle() {
        return this.subscriptionTitle;
    }

    public CreateSubscriptionRequest setScope(Long scope) {
        this.scope = scope;
        return this;
    }
    public Long getScope() {
        return this.scope;
    }

    public CreateSubscriptionRequest setNotifyObjectType(Long notifyObjectType) {
        this.notifyObjectType = notifyObjectType;
        return this;
    }
    public Long getNotifyObjectType() {
        return this.notifyObjectType;
    }

    public CreateSubscriptionRequest setExpiredType(Long expiredType) {
        this.expiredType = expiredType;
        return this;
    }
    public Long getExpiredType() {
        return this.expiredType;
    }

    public CreateSubscriptionRequest setScopeObjectList(java.util.List<CreateSubscriptionRequestScopeObjectList> scopeObjectList) {
        this.scopeObjectList = scopeObjectList;
        return this;
    }
    public java.util.List<CreateSubscriptionRequestScopeObjectList> getScopeObjectList() {
        return this.scopeObjectList;
    }

    public CreateSubscriptionRequest setNotifyObjectList(java.util.List<CreateSubscriptionRequestNotifyObjectList> notifyObjectList) {
        this.notifyObjectList = notifyObjectList;
        return this;
    }
    public java.util.List<CreateSubscriptionRequestNotifyObjectList> getNotifyObjectList() {
        return this.notifyObjectList;
    }

    public CreateSubscriptionRequest setNotifyStrategyList(java.util.List<CreateSubscriptionRequestNotifyStrategyList> notifyStrategyList) {
        this.notifyStrategyList = notifyStrategyList;
        return this;
    }
    public java.util.List<CreateSubscriptionRequestNotifyStrategyList> getNotifyStrategyList() {
        return this.notifyStrategyList;
    }

    public CreateSubscriptionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSubscriptionRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateSubscriptionRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public static class CreateSubscriptionRequestScopeObjectList extends TeaModel {
        // 订阅范围对象id
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

    public static class CreateSubscriptionRequestNotifyObjectList extends TeaModel {
        // 通知对象id
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

    public static class CreateSubscriptionRequestNotifyStrategyListStrategiesConditions extends TeaModel {
        // 影响范围
        @NameInMap("effection")
        public String effection;

        // 故障通知类型
        @NameInMap("problemNotifyType")
        public String problemNotifyType;

        // 等级
        @NameInMap("level")
        public String level;

        // 时间动作
        @NameInMap("action")
        public String action;

        public static CreateSubscriptionRequestNotifyStrategyListStrategiesConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateSubscriptionRequestNotifyStrategyListStrategiesConditions self = new CreateSubscriptionRequestNotifyStrategyListStrategiesConditions();
            return TeaModel.build(map, self);
        }

        public CreateSubscriptionRequestNotifyStrategyListStrategiesConditions setEffection(String effection) {
            this.effection = effection;
            return this;
        }
        public String getEffection() {
            return this.effection;
        }

        public CreateSubscriptionRequestNotifyStrategyListStrategiesConditions setProblemNotifyType(String problemNotifyType) {
            this.problemNotifyType = problemNotifyType;
            return this;
        }
        public String getProblemNotifyType() {
            return this.problemNotifyType;
        }

        public CreateSubscriptionRequestNotifyStrategyListStrategiesConditions setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateSubscriptionRequestNotifyStrategyListStrategiesConditions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

    }

    public static class CreateSubscriptionRequestNotifyStrategyListStrategies extends TeaModel {
        // 通知策略条件
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
        // 订阅实例类型，事件、报警、故障
        @NameInMap("instanceType")
        public Long instanceType;

        // 条件。json格式，包含多个条件，比如级别、影响程度 kv格式
        @NameInMap("strategies")
        public java.util.List<CreateSubscriptionRequestNotifyStrategyListStrategies> strategies;

        // 渠道，多个逗号分隔
        @NameInMap("channels")
        public String channels;

        public static CreateSubscriptionRequestNotifyStrategyList build(java.util.Map<String, ?> map) throws Exception {
            CreateSubscriptionRequestNotifyStrategyList self = new CreateSubscriptionRequestNotifyStrategyList();
            return TeaModel.build(map, self);
        }

        public CreateSubscriptionRequestNotifyStrategyList setInstanceType(Long instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Long getInstanceType() {
            return this.instanceType;
        }

        public CreateSubscriptionRequestNotifyStrategyList setStrategies(java.util.List<CreateSubscriptionRequestNotifyStrategyListStrategies> strategies) {
            this.strategies = strategies;
            return this;
        }
        public java.util.List<CreateSubscriptionRequestNotifyStrategyListStrategies> getStrategies() {
            return this.strategies;
        }

        public CreateSubscriptionRequestNotifyStrategyList setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

    }

}
