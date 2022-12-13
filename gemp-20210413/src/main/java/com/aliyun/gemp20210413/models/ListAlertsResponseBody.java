// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListAlertsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListAlertsResponseBodyData> data;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ListAlertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertsResponseBody self = new ListAlertsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertsResponseBody setData(java.util.List<ListAlertsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAlertsResponseBodyData> getData() {
        return this.data;
    }

    public ListAlertsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAlertsResponseBodyData extends TeaModel {
        @NameInMap("alertId")
        public Long alertId;

        @NameInMap("alertLevel")
        public String alertLevel;

        @NameInMap("alertNumber")
        public String alertNumber;

        @NameInMap("alertSourceName")
        public String alertSourceName;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("firstEventTime")
        public String firstEventTime;

        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        @NameInMap("relServiceDeleteType")
        public Integer relServiceDeleteType;

        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        @NameInMap("routeRuleDeleteType")
        public Integer routeRuleDeleteType;

        @NameInMap("routeRuleId")
        public Long routeRuleId;

        @NameInMap("routeRuleName")
        public String routeRuleName;

        @NameInMap("sourceEventCount")
        public Long sourceEventCount;

        @NameInMap("title")
        public String title;

        public static ListAlertsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAlertsResponseBodyData self = new ListAlertsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAlertsResponseBodyData setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

        public ListAlertsResponseBodyData setAlertLevel(String alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public String getAlertLevel() {
            return this.alertLevel;
        }

        public ListAlertsResponseBodyData setAlertNumber(String alertNumber) {
            this.alertNumber = alertNumber;
            return this;
        }
        public String getAlertNumber() {
            return this.alertNumber;
        }

        public ListAlertsResponseBodyData setAlertSourceName(String alertSourceName) {
            this.alertSourceName = alertSourceName;
            return this;
        }
        public String getAlertSourceName() {
            return this.alertSourceName;
        }

        public ListAlertsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAlertsResponseBodyData setFirstEventTime(String firstEventTime) {
            this.firstEventTime = firstEventTime;
            return this;
        }
        public String getFirstEventTime() {
            return this.firstEventTime;
        }

        public ListAlertsResponseBodyData setMonitorSourceName(String monitorSourceName) {
            this.monitorSourceName = monitorSourceName;
            return this;
        }
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        public ListAlertsResponseBodyData setRelServiceDeleteType(Integer relServiceDeleteType) {
            this.relServiceDeleteType = relServiceDeleteType;
            return this;
        }
        public Integer getRelServiceDeleteType() {
            return this.relServiceDeleteType;
        }

        public ListAlertsResponseBodyData setRelatedServiceName(String relatedServiceName) {
            this.relatedServiceName = relatedServiceName;
            return this;
        }
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        public ListAlertsResponseBodyData setRouteRuleDeleteType(Integer routeRuleDeleteType) {
            this.routeRuleDeleteType = routeRuleDeleteType;
            return this;
        }
        public Integer getRouteRuleDeleteType() {
            return this.routeRuleDeleteType;
        }

        public ListAlertsResponseBodyData setRouteRuleId(Long routeRuleId) {
            this.routeRuleId = routeRuleId;
            return this;
        }
        public Long getRouteRuleId() {
            return this.routeRuleId;
        }

        public ListAlertsResponseBodyData setRouteRuleName(String routeRuleName) {
            this.routeRuleName = routeRuleName;
            return this;
        }
        public String getRouteRuleName() {
            return this.routeRuleName;
        }

        public ListAlertsResponseBodyData setSourceEventCount(Long sourceEventCount) {
            this.sourceEventCount = sourceEventCount;
            return this;
        }
        public Long getSourceEventCount() {
            return this.sourceEventCount;
        }

        public ListAlertsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
