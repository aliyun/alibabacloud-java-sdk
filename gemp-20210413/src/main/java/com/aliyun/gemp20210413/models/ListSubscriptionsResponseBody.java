// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSubscriptionsResponseBody extends TeaModel {
    // id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<ListSubscriptionsResponseBodyData> data;

    // 分页参数
    @NameInMap("totalCount")
    public Long totalCount;

    // 分页参数
    @NameInMap("pageNumber")
    public Long pageNumber;

    // 分页参数
    @NameInMap("pageSize")
    public Long pageSize;

    public static ListSubscriptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionsResponseBody self = new ListSubscriptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubscriptionsResponseBody setData(java.util.List<ListSubscriptionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSubscriptionsResponseBodyData> getData() {
        return this.data;
    }

    public ListSubscriptionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListSubscriptionsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSubscriptionsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public static class ListSubscriptionsResponseBodyDataScopeObjectList extends TeaModel {
        // id主键
        @NameInMap("id")
        public Long id;

        // 订阅范围类型 ALL全部 SERVICE服务 ROUTETULE流转规则
        @NameInMap("scope")
        public Long scope;

        // 订阅范围对象关联表主键id
        @NameInMap("scopeObjectId")
        public Long scopeObjectId;

        // 订阅范围对象名称
        @NameInMap("scopeObject")
        public String scopeObject;

        public static ListSubscriptionsResponseBodyDataScopeObjectList build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionsResponseBodyDataScopeObjectList self = new ListSubscriptionsResponseBodyDataScopeObjectList();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionsResponseBodyDataScopeObjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSubscriptionsResponseBodyDataScopeObjectList setScope(Long scope) {
            this.scope = scope;
            return this;
        }
        public Long getScope() {
            return this.scope;
        }

        public ListSubscriptionsResponseBodyDataScopeObjectList setScopeObjectId(Long scopeObjectId) {
            this.scopeObjectId = scopeObjectId;
            return this;
        }
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

        public ListSubscriptionsResponseBodyDataScopeObjectList setScopeObject(String scopeObject) {
            this.scopeObject = scopeObject;
            return this;
        }
        public String getScopeObject() {
            return this.scopeObject;
        }

    }

    public static class ListSubscriptionsResponseBodyDataNotifyObjectList extends TeaModel {
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

        public static ListSubscriptionsResponseBodyDataNotifyObjectList build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionsResponseBodyDataNotifyObjectList self = new ListSubscriptionsResponseBodyDataNotifyObjectList();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionsResponseBodyDataNotifyObjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSubscriptionsResponseBodyDataNotifyObjectList setNotifyObjectType(Long notifyObjectType) {
            this.notifyObjectType = notifyObjectType;
            return this;
        }
        public Long getNotifyObjectType() {
            return this.notifyObjectType;
        }

        public ListSubscriptionsResponseBodyDataNotifyObjectList setNotifyObjectId(Long notifyObjectId) {
            this.notifyObjectId = notifyObjectId;
            return this;
        }
        public Long getNotifyObjectId() {
            return this.notifyObjectId;
        }

        public ListSubscriptionsResponseBodyDataNotifyObjectList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListSubscriptionsResponseBodyData extends TeaModel {
        // 订阅id
        @NameInMap("subscriptionId")
        public Long subscriptionId;

        // 通知订阅名称
        @NameInMap("subscriptionTitle")
        public String subscriptionTitle;

        // 0 全部 1服务 2 流转规则
        @NameInMap("scope")
        public Long scope;

        // 0服务组 1个人
        @NameInMap("notifyObjectType")
        public Long notifyObjectType;

        // 有效期类型 0 长期 1短期
        @NameInMap("expiredType")
        public String expiredType;

        // 时效开始时间
        @NameInMap("startTime")
        public String startTime;

        // 时效结束时间
        @NameInMap("endTime")
        public String endTime;

        // ENABLE 启用 DISABLE禁用
        @NameInMap("status")
        public String status;

        // 订阅范围列表
        @NameInMap("scopeObjectList")
        public java.util.List<ListSubscriptionsResponseBodyDataScopeObjectList> scopeObjectList;

        // 通知对象列表
        @NameInMap("notifyObjectList")
        public java.util.List<ListSubscriptionsResponseBodyDataNotifyObjectList> notifyObjectList;

        public static ListSubscriptionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionsResponseBodyData self = new ListSubscriptionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionsResponseBodyData setSubscriptionId(Long subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Long getSubscriptionId() {
            return this.subscriptionId;
        }

        public ListSubscriptionsResponseBodyData setSubscriptionTitle(String subscriptionTitle) {
            this.subscriptionTitle = subscriptionTitle;
            return this;
        }
        public String getSubscriptionTitle() {
            return this.subscriptionTitle;
        }

        public ListSubscriptionsResponseBodyData setScope(Long scope) {
            this.scope = scope;
            return this;
        }
        public Long getScope() {
            return this.scope;
        }

        public ListSubscriptionsResponseBodyData setNotifyObjectType(Long notifyObjectType) {
            this.notifyObjectType = notifyObjectType;
            return this;
        }
        public Long getNotifyObjectType() {
            return this.notifyObjectType;
        }

        public ListSubscriptionsResponseBodyData setExpiredType(String expiredType) {
            this.expiredType = expiredType;
            return this;
        }
        public String getExpiredType() {
            return this.expiredType;
        }

        public ListSubscriptionsResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListSubscriptionsResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListSubscriptionsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSubscriptionsResponseBodyData setScopeObjectList(java.util.List<ListSubscriptionsResponseBodyDataScopeObjectList> scopeObjectList) {
            this.scopeObjectList = scopeObjectList;
            return this;
        }
        public java.util.List<ListSubscriptionsResponseBodyDataScopeObjectList> getScopeObjectList() {
            return this.scopeObjectList;
        }

        public ListSubscriptionsResponseBodyData setNotifyObjectList(java.util.List<ListSubscriptionsResponseBodyDataNotifyObjectList> notifyObjectList) {
            this.notifyObjectList = notifyObjectList;
            return this;
        }
        public java.util.List<ListSubscriptionsResponseBodyDataNotifyObjectList> getNotifyObjectList() {
            return this.notifyObjectList;
        }

    }

}
