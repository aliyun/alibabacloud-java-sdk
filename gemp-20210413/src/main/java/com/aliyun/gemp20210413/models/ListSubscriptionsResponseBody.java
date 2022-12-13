// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSubscriptionsResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public java.util.List<ListSubscriptionsResponseBodyData> data;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    // id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ListSubscriptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionsResponseBody self = new ListSubscriptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionsResponseBody setData(java.util.List<ListSubscriptionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSubscriptionsResponseBodyData> getData() {
        return this.data;
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

    public ListSubscriptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubscriptionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSubscriptionsResponseBodyDataNotifyObjectList extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("isValid")
        public Long isValid;

        @NameInMap("name")
        public String name;

        @NameInMap("notifyObjectId")
        public Long notifyObjectId;

        @NameInMap("notifyObjectType")
        public Long notifyObjectType;

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

        public ListSubscriptionsResponseBodyDataNotifyObjectList setIsValid(Long isValid) {
            this.isValid = isValid;
            return this;
        }
        public Long getIsValid() {
            return this.isValid;
        }

        public ListSubscriptionsResponseBodyDataNotifyObjectList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSubscriptionsResponseBodyDataNotifyObjectList setNotifyObjectId(Long notifyObjectId) {
            this.notifyObjectId = notifyObjectId;
            return this;
        }
        public Long getNotifyObjectId() {
            return this.notifyObjectId;
        }

        public ListSubscriptionsResponseBodyDataNotifyObjectList setNotifyObjectType(Long notifyObjectType) {
            this.notifyObjectType = notifyObjectType;
            return this;
        }
        public Long getNotifyObjectType() {
            return this.notifyObjectType;
        }

    }

    public static class ListSubscriptionsResponseBodyDataScopeObjectList extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("isValid")
        public Long isValid;

        @NameInMap("scope")
        public Long scope;

        @NameInMap("scopeObject")
        public String scopeObject;

        @NameInMap("scopeObjectId")
        public Long scopeObjectId;

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

        public ListSubscriptionsResponseBodyDataScopeObjectList setIsValid(Long isValid) {
            this.isValid = isValid;
            return this;
        }
        public Long getIsValid() {
            return this.isValid;
        }

        public ListSubscriptionsResponseBodyDataScopeObjectList setScope(Long scope) {
            this.scope = scope;
            return this;
        }
        public Long getScope() {
            return this.scope;
        }

        public ListSubscriptionsResponseBodyDataScopeObjectList setScopeObject(String scopeObject) {
            this.scopeObject = scopeObject;
            return this;
        }
        public String getScopeObject() {
            return this.scopeObject;
        }

        public ListSubscriptionsResponseBodyDataScopeObjectList setScopeObjectId(Long scopeObjectId) {
            this.scopeObjectId = scopeObjectId;
            return this;
        }
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

    }

    public static class ListSubscriptionsResponseBodyData extends TeaModel {
        @NameInMap("endTime")
        public String endTime;

        @NameInMap("expiredType")
        public String expiredType;

        @NameInMap("notifyObjectList")
        public java.util.List<ListSubscriptionsResponseBodyDataNotifyObjectList> notifyObjectList;

        @NameInMap("notifyObjectType")
        public Long notifyObjectType;

        @NameInMap("scope")
        public Long scope;

        @NameInMap("scopeObjectList")
        public java.util.List<ListSubscriptionsResponseBodyDataScopeObjectList> scopeObjectList;

        @NameInMap("startTime")
        public String startTime;

        @NameInMap("status")
        public String status;

        @NameInMap("subscriptionId")
        public Long subscriptionId;

        @NameInMap("subscriptionTitle")
        public String subscriptionTitle;

        public static ListSubscriptionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionsResponseBodyData self = new ListSubscriptionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionsResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListSubscriptionsResponseBodyData setExpiredType(String expiredType) {
            this.expiredType = expiredType;
            return this;
        }
        public String getExpiredType() {
            return this.expiredType;
        }

        public ListSubscriptionsResponseBodyData setNotifyObjectList(java.util.List<ListSubscriptionsResponseBodyDataNotifyObjectList> notifyObjectList) {
            this.notifyObjectList = notifyObjectList;
            return this;
        }
        public java.util.List<ListSubscriptionsResponseBodyDataNotifyObjectList> getNotifyObjectList() {
            return this.notifyObjectList;
        }

        public ListSubscriptionsResponseBodyData setNotifyObjectType(Long notifyObjectType) {
            this.notifyObjectType = notifyObjectType;
            return this;
        }
        public Long getNotifyObjectType() {
            return this.notifyObjectType;
        }

        public ListSubscriptionsResponseBodyData setScope(Long scope) {
            this.scope = scope;
            return this;
        }
        public Long getScope() {
            return this.scope;
        }

        public ListSubscriptionsResponseBodyData setScopeObjectList(java.util.List<ListSubscriptionsResponseBodyDataScopeObjectList> scopeObjectList) {
            this.scopeObjectList = scopeObjectList;
            return this;
        }
        public java.util.List<ListSubscriptionsResponseBodyDataScopeObjectList> getScopeObjectList() {
            return this.scopeObjectList;
        }

        public ListSubscriptionsResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListSubscriptionsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

    }

}
