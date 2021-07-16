// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentsResponseBody extends TeaModel {
    // requestId
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<ListIncidentsResponseBodyData> data;

    // 总数
    @NameInMap("totalCount")
    public Integer totalCount;

    // 页
    @NameInMap("pageNumber")
    public Integer pageNumber;

    // 行
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListIncidentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentsResponseBody self = new ListIncidentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIncidentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIncidentsResponseBody setData(java.util.List<ListIncidentsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListIncidentsResponseBodyData> getData() {
        return this.data;
    }

    public ListIncidentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListIncidentsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIncidentsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class ListIncidentsResponseBodyData extends TeaModel {
        @NameInMap("incidentId")
        public Long incidentId;

        // 流转规则ID
        @NameInMap("routeRuleId")
        public Long routeRuleId;

        @NameInMap("routeRuleName")
        public String routeRuleName;

        // 事件状态 0已分派 1已响应 2已完结
        @NameInMap("incidentStatus")
        public String incidentStatus;

        // 事件级别 P1 P2 P3 P4
        @NameInMap("incidentLevel")
        public String incidentLevel;

        // 关联服务ID
        @NameInMap("relatedServiceId")
        public Long relatedServiceId;

        // 关联服务名称
        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        // 影响等级 高：HIGH 低 LOW
        @NameInMap("effect")
        public String effect;

        // 分派的用户ID
        @NameInMap("assignUserId")
        public Long assignUserId;

        // 分派的用户姓名
        @NameInMap("assignUserName")
        public String assignUserName;

        // 分派人手机号
        @NameInMap("assignUserPhone")
        public String assignUserPhone;

        // 事件标题
        @NameInMap("incidentTitle")
        public String incidentTitle;

        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 事件来源 是=手动 否=自动
        @NameInMap("isManual")
        public Boolean isManual;

        public static ListIncidentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentsResponseBodyData self = new ListIncidentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIncidentsResponseBodyData setIncidentId(Long incidentId) {
            this.incidentId = incidentId;
            return this;
        }
        public Long getIncidentId() {
            return this.incidentId;
        }

        public ListIncidentsResponseBodyData setRouteRuleId(Long routeRuleId) {
            this.routeRuleId = routeRuleId;
            return this;
        }
        public Long getRouteRuleId() {
            return this.routeRuleId;
        }

        public ListIncidentsResponseBodyData setRouteRuleName(String routeRuleName) {
            this.routeRuleName = routeRuleName;
            return this;
        }
        public String getRouteRuleName() {
            return this.routeRuleName;
        }

        public ListIncidentsResponseBodyData setIncidentStatus(String incidentStatus) {
            this.incidentStatus = incidentStatus;
            return this;
        }
        public String getIncidentStatus() {
            return this.incidentStatus;
        }

        public ListIncidentsResponseBodyData setIncidentLevel(String incidentLevel) {
            this.incidentLevel = incidentLevel;
            return this;
        }
        public String getIncidentLevel() {
            return this.incidentLevel;
        }

        public ListIncidentsResponseBodyData setRelatedServiceId(Long relatedServiceId) {
            this.relatedServiceId = relatedServiceId;
            return this;
        }
        public Long getRelatedServiceId() {
            return this.relatedServiceId;
        }

        public ListIncidentsResponseBodyData setRelatedServiceName(String relatedServiceName) {
            this.relatedServiceName = relatedServiceName;
            return this;
        }
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        public ListIncidentsResponseBodyData setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public ListIncidentsResponseBodyData setAssignUserId(Long assignUserId) {
            this.assignUserId = assignUserId;
            return this;
        }
        public Long getAssignUserId() {
            return this.assignUserId;
        }

        public ListIncidentsResponseBodyData setAssignUserName(String assignUserName) {
            this.assignUserName = assignUserName;
            return this;
        }
        public String getAssignUserName() {
            return this.assignUserName;
        }

        public ListIncidentsResponseBodyData setAssignUserPhone(String assignUserPhone) {
            this.assignUserPhone = assignUserPhone;
            return this;
        }
        public String getAssignUserPhone() {
            return this.assignUserPhone;
        }

        public ListIncidentsResponseBodyData setIncidentTitle(String incidentTitle) {
            this.incidentTitle = incidentTitle;
            return this;
        }
        public String getIncidentTitle() {
            return this.incidentTitle;
        }

        public ListIncidentsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIncidentsResponseBodyData setIsManual(Boolean isManual) {
            this.isManual = isManual;
            return this;
        }
        public Boolean getIsManual() {
            return this.isManual;
        }

    }

}
