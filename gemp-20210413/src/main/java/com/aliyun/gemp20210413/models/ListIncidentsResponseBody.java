// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentsResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public java.util.List<ListIncidentsResponseBodyData> data;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    // requestId
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListIncidentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentsResponseBody self = new ListIncidentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIncidentsResponseBody setData(java.util.List<ListIncidentsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListIncidentsResponseBodyData> getData() {
        return this.data;
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

    public ListIncidentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIncidentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIncidentsResponseBodyData extends TeaModel {
        @NameInMap("assignToWhoIsValid")
        public Long assignToWhoIsValid;

        // 代表创建时间的资源属性字段
        @NameInMap("assignUserId")
        public Long assignUserId;

        // 代表资源一级ID的资源属性字段
        @NameInMap("assignUserName")
        public String assignUserName;

        @NameInMap("assignUserPhone")
        public String assignUserPhone;

        // 事件级别
        @NameInMap("createTime")
        public String createTime;

        // 时间指派人ID
        @NameInMap("effect")
        public String effect;

        // 修改时间
        @NameInMap("incidentId")
        public Long incidentId;

        // 影响程度
        @NameInMap("incidentLevel")
        public String incidentLevel;

        @NameInMap("incidentNumber")
        public String incidentNumber;

        // 关联流转规则ID
        @NameInMap("incidentStatus")
        public String incidentStatus;

        // 事件内容
        @NameInMap("incidentTitle")
        public String incidentTitle;

        @NameInMap("isManual")
        public Boolean isManual;

        @NameInMap("relRouteRuleDeleteType")
        public Integer relRouteRuleDeleteType;

        @NameInMap("relServiceDeleteType")
        public Integer relServiceDeleteType;

        // 事件状态
        @NameInMap("relatedServiceId")
        public Long relatedServiceId;

        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        // 关联的服务ID
        @NameInMap("routeRuleId")
        public Long routeRuleId;

        @NameInMap("routeRuleName")
        public String routeRuleName;

        public static ListIncidentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentsResponseBodyData self = new ListIncidentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIncidentsResponseBodyData setAssignToWhoIsValid(Long assignToWhoIsValid) {
            this.assignToWhoIsValid = assignToWhoIsValid;
            return this;
        }
        public Long getAssignToWhoIsValid() {
            return this.assignToWhoIsValid;
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

        public ListIncidentsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIncidentsResponseBodyData setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public ListIncidentsResponseBodyData setIncidentId(Long incidentId) {
            this.incidentId = incidentId;
            return this;
        }
        public Long getIncidentId() {
            return this.incidentId;
        }

        public ListIncidentsResponseBodyData setIncidentLevel(String incidentLevel) {
            this.incidentLevel = incidentLevel;
            return this;
        }
        public String getIncidentLevel() {
            return this.incidentLevel;
        }

        public ListIncidentsResponseBodyData setIncidentNumber(String incidentNumber) {
            this.incidentNumber = incidentNumber;
            return this;
        }
        public String getIncidentNumber() {
            return this.incidentNumber;
        }

        public ListIncidentsResponseBodyData setIncidentStatus(String incidentStatus) {
            this.incidentStatus = incidentStatus;
            return this;
        }
        public String getIncidentStatus() {
            return this.incidentStatus;
        }

        public ListIncidentsResponseBodyData setIncidentTitle(String incidentTitle) {
            this.incidentTitle = incidentTitle;
            return this;
        }
        public String getIncidentTitle() {
            return this.incidentTitle;
        }

        public ListIncidentsResponseBodyData setIsManual(Boolean isManual) {
            this.isManual = isManual;
            return this;
        }
        public Boolean getIsManual() {
            return this.isManual;
        }

        public ListIncidentsResponseBodyData setRelRouteRuleDeleteType(Integer relRouteRuleDeleteType) {
            this.relRouteRuleDeleteType = relRouteRuleDeleteType;
            return this;
        }
        public Integer getRelRouteRuleDeleteType() {
            return this.relRouteRuleDeleteType;
        }

        public ListIncidentsResponseBodyData setRelServiceDeleteType(Integer relServiceDeleteType) {
            this.relServiceDeleteType = relServiceDeleteType;
            return this;
        }
        public Integer getRelServiceDeleteType() {
            return this.relServiceDeleteType;
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

    }

}
