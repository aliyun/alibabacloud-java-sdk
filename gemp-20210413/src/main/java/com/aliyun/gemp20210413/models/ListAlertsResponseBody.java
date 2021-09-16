// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListAlertsResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    // 报警列表
    @NameInMap("data")
    public java.util.List<ListAlertsResponseBodyData> data;

    // 总条数
    @NameInMap("totalCount")
    public Long totalCount;

    // 当前页
    @NameInMap("pageNumber")
    public Integer pageNumber;

    // 页的大小
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListAlertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertsResponseBody self = new ListAlertsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertsResponseBody setData(java.util.List<ListAlertsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAlertsResponseBodyData> getData() {
        return this.data;
    }

    public ListAlertsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
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

    public static class ListAlertsResponseBodyData extends TeaModel {
        // 报警ID
        @NameInMap("alertId")
        public Long alertId;

        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 关联服务名称
        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        // 告警优先级  1，2，3，4  对应 p1,p2,p3,p4
        @NameInMap("alertLevel")
        public String alertLevel;

        // 报警标题
        @NameInMap("title")
        public String title;

        // 收敛量
        @NameInMap("sourceEventCount")
        public Long sourceEventCount;

        // 报警源
        @NameInMap("alertSourceName")
        public String alertSourceName;

        // 关联流转规则ID
        @NameInMap("routeRuleId")
        public Long routeRuleId;

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

        public ListAlertsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAlertsResponseBodyData setRelatedServiceName(String relatedServiceName) {
            this.relatedServiceName = relatedServiceName;
            return this;
        }
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        public ListAlertsResponseBodyData setAlertLevel(String alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public String getAlertLevel() {
            return this.alertLevel;
        }

        public ListAlertsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListAlertsResponseBodyData setSourceEventCount(Long sourceEventCount) {
            this.sourceEventCount = sourceEventCount;
            return this;
        }
        public Long getSourceEventCount() {
            return this.sourceEventCount;
        }

        public ListAlertsResponseBodyData setAlertSourceName(String alertSourceName) {
            this.alertSourceName = alertSourceName;
            return this;
        }
        public String getAlertSourceName() {
            return this.alertSourceName;
        }

        public ListAlertsResponseBodyData setRouteRuleId(Long routeRuleId) {
            this.routeRuleId = routeRuleId;
            return this;
        }
        public Long getRouteRuleId() {
            return this.routeRuleId;
        }

    }

}
