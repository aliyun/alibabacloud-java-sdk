// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetSubscriptionResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public GetSubscriptionResponseBodyData data;

    public static GetSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionResponseBody self = new GetSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubscriptionResponseBody setData(GetSubscriptionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSubscriptionResponseBodyData getData() {
        return this.data;
    }

    public static class GetSubscriptionResponseBodyDataScopeObjectList extends TeaModel {
        // id主键
        @NameInMap("id")
        public Long id;

        // 订阅范围类型 0 全部 1服务 2 流转规则
        @NameInMap("scope")
        public String scope;

        // 订阅范围对象关联表主键id
        @NameInMap("scopeObjectId")
        public Long scopeObjectId;

        // 订阅范围对象名称
        @NameInMap("scopeObject")
        public String scopeObject;

        public static GetSubscriptionResponseBodyDataScopeObjectList build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionResponseBodyDataScopeObjectList self = new GetSubscriptionResponseBodyDataScopeObjectList();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionResponseBodyDataScopeObjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSubscriptionResponseBodyDataScopeObjectList setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetSubscriptionResponseBodyDataScopeObjectList setScopeObjectId(Long scopeObjectId) {
            this.scopeObjectId = scopeObjectId;
            return this;
        }
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

        public GetSubscriptionResponseBodyDataScopeObjectList setScopeObject(String scopeObject) {
            this.scopeObject = scopeObject;
            return this;
        }
        public String getScopeObject() {
            return this.scopeObject;
        }

    }

    public static class GetSubscriptionResponseBodyDataNotifyObjectList extends TeaModel {
        // id主键
        @NameInMap("id")
        public Long id;

        // 通知对象类型0服务组 1个人
        @NameInMap("notifyObjectType")
        public Long notifyObjectType;

        // 关联主键id
        @NameInMap("notifyObjectId")
        public Long notifyObjectId;

        // 通知对象名
        @NameInMap("name")
        public String name;

        public static GetSubscriptionResponseBodyDataNotifyObjectList build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionResponseBodyDataNotifyObjectList self = new GetSubscriptionResponseBodyDataNotifyObjectList();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionResponseBodyDataNotifyObjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSubscriptionResponseBodyDataNotifyObjectList setNotifyObjectType(Long notifyObjectType) {
            this.notifyObjectType = notifyObjectType;
            return this;
        }
        public Long getNotifyObjectType() {
            return this.notifyObjectType;
        }

        public GetSubscriptionResponseBodyDataNotifyObjectList setNotifyObjectId(Long notifyObjectId) {
            this.notifyObjectId = notifyObjectId;
            return this;
        }
        public Long getNotifyObjectId() {
            return this.notifyObjectId;
        }

        public GetSubscriptionResponseBodyDataNotifyObjectList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions extends TeaModel {
        // 影响范围
        @NameInMap("effection")
        public String effection;

        // 故障通知类型
        @NameInMap("problemNotifyType")
        public String problemNotifyType;

        // 等级
        @NameInMap("level")
        public String level;

        // 事件动作
        @NameInMap("action")
        public String action;

        public static GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions self = new GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions setEffection(String effection) {
            this.effection = effection;
            return this;
        }
        public String getEffection() {
            return this.effection;
        }

        public GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions setProblemNotifyType(String problemNotifyType) {
            this.problemNotifyType = problemNotifyType;
            return this;
        }
        public String getProblemNotifyType() {
            return this.problemNotifyType;
        }

        public GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

    }

    public static class GetSubscriptionResponseBodyDataNotifyStrategyListStrategies extends TeaModel {
        // 策略主键
        @NameInMap("id")
        public Long id;

        // 通知渠道
        @NameInMap("channels")
        public String channels;

        // 条件
        @NameInMap("conditions")
        public java.util.List<GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions> conditions;

        public static GetSubscriptionResponseBodyDataNotifyStrategyListStrategies build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionResponseBodyDataNotifyStrategyListStrategies self = new GetSubscriptionResponseBodyDataNotifyStrategyListStrategies();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionResponseBodyDataNotifyStrategyListStrategies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSubscriptionResponseBodyDataNotifyStrategyListStrategies setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public GetSubscriptionResponseBodyDataNotifyStrategyListStrategies setConditions(java.util.List<GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions> getConditions() {
            return this.conditions;
        }

    }

    public static class GetSubscriptionResponseBodyDataNotifyStrategyList extends TeaModel {
        // 订阅实例类型，0事件、1报警、2故障
        @NameInMap("instanceType")
        public Long instanceType;

        // 策略
        @NameInMap("strategies")
        public java.util.List<GetSubscriptionResponseBodyDataNotifyStrategyListStrategies> strategies;

        public static GetSubscriptionResponseBodyDataNotifyStrategyList build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionResponseBodyDataNotifyStrategyList self = new GetSubscriptionResponseBodyDataNotifyStrategyList();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionResponseBodyDataNotifyStrategyList setInstanceType(Long instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Long getInstanceType() {
            return this.instanceType;
        }

        public GetSubscriptionResponseBodyDataNotifyStrategyList setStrategies(java.util.List<GetSubscriptionResponseBodyDataNotifyStrategyListStrategies> strategies) {
            this.strategies = strategies;
            return this;
        }
        public java.util.List<GetSubscriptionResponseBodyDataNotifyStrategyListStrategies> getStrategies() {
            return this.strategies;
        }

    }

    public static class GetSubscriptionResponseBodyData extends TeaModel {
        @NameInMap("subscriptionId")
        public Long subscriptionId;

        // 通知订阅名称
        @NameInMap("subscriptionTitle")
        public String subscriptionTitle;

        // 0 全部 1服务 2 流转规则
        @NameInMap("scope")
        public String scope;

        // 0服务组 1个人
        @NameInMap("notifyObjectType")
        public String notifyObjectType;

        // 有效期类型 0 长期 1短期
        @NameInMap("expiredType")
        public String expiredType;

        // 时效开始时间
        @NameInMap("startTime")
        public String startTime;

        // 时效结束时间
        @NameInMap("endTime")
        public String endTime;

        // 1 启用 0禁用
        @NameInMap("status")
        public String status;

        @NameInMap("scopeObjectList")
        public java.util.List<GetSubscriptionResponseBodyDataScopeObjectList> scopeObjectList;

        // 通知对象列表
        @NameInMap("notifyObjectList")
        public java.util.List<GetSubscriptionResponseBodyDataNotifyObjectList> notifyObjectList;

        // 通知策略列表
        @NameInMap("notifyStrategyList")
        public java.util.List<GetSubscriptionResponseBodyDataNotifyStrategyList> notifyStrategyList;

        public static GetSubscriptionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionResponseBodyData self = new GetSubscriptionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionResponseBodyData setSubscriptionId(Long subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Long getSubscriptionId() {
            return this.subscriptionId;
        }

        public GetSubscriptionResponseBodyData setSubscriptionTitle(String subscriptionTitle) {
            this.subscriptionTitle = subscriptionTitle;
            return this;
        }
        public String getSubscriptionTitle() {
            return this.subscriptionTitle;
        }

        public GetSubscriptionResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetSubscriptionResponseBodyData setNotifyObjectType(String notifyObjectType) {
            this.notifyObjectType = notifyObjectType;
            return this;
        }
        public String getNotifyObjectType() {
            return this.notifyObjectType;
        }

        public GetSubscriptionResponseBodyData setExpiredType(String expiredType) {
            this.expiredType = expiredType;
            return this;
        }
        public String getExpiredType() {
            return this.expiredType;
        }

        public GetSubscriptionResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetSubscriptionResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetSubscriptionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSubscriptionResponseBodyData setScopeObjectList(java.util.List<GetSubscriptionResponseBodyDataScopeObjectList> scopeObjectList) {
            this.scopeObjectList = scopeObjectList;
            return this;
        }
        public java.util.List<GetSubscriptionResponseBodyDataScopeObjectList> getScopeObjectList() {
            return this.scopeObjectList;
        }

        public GetSubscriptionResponseBodyData setNotifyObjectList(java.util.List<GetSubscriptionResponseBodyDataNotifyObjectList> notifyObjectList) {
            this.notifyObjectList = notifyObjectList;
            return this;
        }
        public java.util.List<GetSubscriptionResponseBodyDataNotifyObjectList> getNotifyObjectList() {
            return this.notifyObjectList;
        }

        public GetSubscriptionResponseBodyData setNotifyStrategyList(java.util.List<GetSubscriptionResponseBodyDataNotifyStrategyList> notifyStrategyList) {
            this.notifyStrategyList = notifyStrategyList;
            return this;
        }
        public java.util.List<GetSubscriptionResponseBodyDataNotifyStrategyList> getNotifyStrategyList() {
            return this.notifyStrategyList;
        }

    }

}
