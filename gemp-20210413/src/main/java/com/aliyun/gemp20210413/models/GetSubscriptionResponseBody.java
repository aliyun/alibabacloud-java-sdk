// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetSubscriptionResponseBody extends TeaModel {
    /**
     * <p>Object</p>
     */
    @NameInMap("data")
    public GetSubscriptionResponseBodyData data;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>10REQUES-AC5C-4B59-BE11-378F117A6A88</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionResponseBody self = new GetSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionResponseBody setData(GetSubscriptionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSubscriptionResponseBodyData getData() {
        return this.data;
    }

    public GetSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSubscriptionResponseBodyDataNotifyObjectList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>TestName</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("notifyObjectId")
        public Long notifyObjectId;

        /**
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("notifyObjectType")
        public Long notifyObjectType;

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

        public GetSubscriptionResponseBodyDataNotifyObjectList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSubscriptionResponseBodyDataNotifyObjectList setNotifyObjectId(Long notifyObjectId) {
            this.notifyObjectId = notifyObjectId;
            return this;
        }
        public Long getNotifyObjectId() {
            return this.notifyObjectId;
        }

        public GetSubscriptionResponseBodyDataNotifyObjectList setNotifyObjectType(Long notifyObjectType) {
            this.notifyObjectType = notifyObjectType;
            return this;
        }
        public Long getNotifyObjectType() {
            return this.notifyObjectType;
        }

    }

    public static class GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions extends TeaModel {
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

        public static GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions self = new GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions setEffection(String effection) {
            this.effection = effection;
            return this;
        }
        public String getEffection() {
            return this.effection;
        }

        public GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions setProblemNotifyType(String problemNotifyType) {
            this.problemNotifyType = problemNotifyType;
            return this;
        }
        public String getProblemNotifyType() {
            return this.problemNotifyType;
        }

    }

    public static class GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesPeriodChannel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DINGDING</p>
         */
        @NameInMap("nonWorkday")
        public String nonWorkday;

        /**
         * <strong>example:</strong>
         * <p>DINGDING</p>
         */
        @NameInMap("workday")
        public String workday;

        public static GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesPeriodChannel build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesPeriodChannel self = new GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesPeriodChannel();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesPeriodChannel setNonWorkday(String nonWorkday) {
            this.nonWorkday = nonWorkday;
            return this;
        }
        public String getNonWorkday() {
            return this.nonWorkday;
        }

        public GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesPeriodChannel setWorkday(String workday) {
            this.workday = workday;
            return this;
        }
        public String getWorkday() {
            return this.workday;
        }

    }

    public static class GetSubscriptionResponseBodyDataNotifyStrategyListStrategies extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SMS</p>
         */
        @NameInMap("channels")
        public String channels;

        @NameInMap("conditions")
        public java.util.List<GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesConditions> conditions;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("periodChannel")
        public GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesPeriodChannel periodChannel;

        public static GetSubscriptionResponseBodyDataNotifyStrategyListStrategies build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionResponseBodyDataNotifyStrategyListStrategies self = new GetSubscriptionResponseBodyDataNotifyStrategyListStrategies();
            return TeaModel.build(map, self);
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

        public GetSubscriptionResponseBodyDataNotifyStrategyListStrategies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSubscriptionResponseBodyDataNotifyStrategyListStrategies setPeriodChannel(GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesPeriodChannel periodChannel) {
            this.periodChannel = periodChannel;
            return this;
        }
        public GetSubscriptionResponseBodyDataNotifyStrategyListStrategiesPeriodChannel getPeriodChannel() {
            return this.periodChannel;
        }

    }

    public static class GetSubscriptionResponseBodyDataNotifyStrategyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>INCIDENT</p>
         */
        @NameInMap("instanceType")
        public Long instanceType;

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

    public static class GetSubscriptionResponseBodyDataScopeObjectList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("isValid")
        public Long isValid;

        /**
         * <strong>example:</strong>
         * <p>SERVICE</p>
         */
        @NameInMap("scope")
        public String scope;

        @NameInMap("scopeObject")
        public String scopeObject;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("scopeObjectId")
        public Long scopeObjectId;

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

        public GetSubscriptionResponseBodyDataScopeObjectList setIsValid(Long isValid) {
            this.isValid = isValid;
            return this;
        }
        public Long getIsValid() {
            return this.isValid;
        }

        public GetSubscriptionResponseBodyDataScopeObjectList setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetSubscriptionResponseBodyDataScopeObjectList setScopeObject(String scopeObject) {
            this.scopeObject = scopeObject;
            return this;
        }
        public String getScopeObject() {
            return this.scopeObject;
        }

        public GetSubscriptionResponseBodyDataScopeObjectList setScopeObjectId(Long scopeObjectId) {
            this.scopeObjectId = scopeObjectId;
            return this;
        }
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

    }

    public static class GetSubscriptionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-08-9 10:10:10</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>LONG_TERM</p>
         */
        @NameInMap("expiredType")
        public String expiredType;

        @NameInMap("notifyObjectList")
        public java.util.List<GetSubscriptionResponseBodyDataNotifyObjectList> notifyObjectList;

        /**
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("notifyObjectType")
        public String notifyObjectType;

        @NameInMap("notifyStrategyList")
        public java.util.List<GetSubscriptionResponseBodyDataNotifyStrategyList> notifyStrategyList;

        /**
         * <strong>example:</strong>
         * <p>1个月</p>
         */
        @NameInMap("period")
        public String period;

        /**
         * <strong>example:</strong>
         * <p>SERVICE</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <p>Array</p>
         */
        @NameInMap("scopeObjectList")
        public java.util.List<GetSubscriptionResponseBodyDataScopeObjectList> scopeObjectList;

        /**
         * <strong>example:</strong>
         * <p>2020-05-9 10:10:10</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("subscriptionId")
        public Long subscriptionId;

        /**
         * <strong>example:</strong>
         * <p>newTitle</p>
         */
        @NameInMap("subscriptionTitle")
        public String subscriptionTitle;

        public static GetSubscriptionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionResponseBodyData self = new GetSubscriptionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetSubscriptionResponseBodyData setExpiredType(String expiredType) {
            this.expiredType = expiredType;
            return this;
        }
        public String getExpiredType() {
            return this.expiredType;
        }

        public GetSubscriptionResponseBodyData setNotifyObjectList(java.util.List<GetSubscriptionResponseBodyDataNotifyObjectList> notifyObjectList) {
            this.notifyObjectList = notifyObjectList;
            return this;
        }
        public java.util.List<GetSubscriptionResponseBodyDataNotifyObjectList> getNotifyObjectList() {
            return this.notifyObjectList;
        }

        public GetSubscriptionResponseBodyData setNotifyObjectType(String notifyObjectType) {
            this.notifyObjectType = notifyObjectType;
            return this;
        }
        public String getNotifyObjectType() {
            return this.notifyObjectType;
        }

        public GetSubscriptionResponseBodyData setNotifyStrategyList(java.util.List<GetSubscriptionResponseBodyDataNotifyStrategyList> notifyStrategyList) {
            this.notifyStrategyList = notifyStrategyList;
            return this;
        }
        public java.util.List<GetSubscriptionResponseBodyDataNotifyStrategyList> getNotifyStrategyList() {
            return this.notifyStrategyList;
        }

        public GetSubscriptionResponseBodyData setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public GetSubscriptionResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetSubscriptionResponseBodyData setScopeObjectList(java.util.List<GetSubscriptionResponseBodyDataScopeObjectList> scopeObjectList) {
            this.scopeObjectList = scopeObjectList;
            return this;
        }
        public java.util.List<GetSubscriptionResponseBodyDataScopeObjectList> getScopeObjectList() {
            return this.scopeObjectList;
        }

        public GetSubscriptionResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetSubscriptionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

    }

}
