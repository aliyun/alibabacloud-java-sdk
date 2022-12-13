// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListRouteRulesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListRouteRulesResponseBodyData> data;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ListRouteRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRouteRulesResponseBody self = new ListRouteRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRouteRulesResponseBody setData(java.util.List<ListRouteRulesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListRouteRulesResponseBodyData> getData() {
        return this.data;
    }

    public ListRouteRulesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRouteRulesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRouteRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRouteRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRouteRulesResponseBodyData extends TeaModel {
        @NameInMap("assignObjectId")
        public Long assignObjectId;

        @NameInMap("assignObjectType")
        public String assignObjectType;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("effection")
        public String effection;

        @NameInMap("enableStatus")
        public String enableStatus;

        @NameInMap("incidentLevel")
        public String incidentLevel;

        @NameInMap("isValid")
        public Integer isValid;

        @NameInMap("matchCount")
        public Long matchCount;

        @NameInMap("monitorSourceNames")
        public String monitorSourceNames;

        @NameInMap("relServiceDeleteType")
        public Integer relServiceDeleteType;

        @NameInMap("relatedServiceId")
        public Long relatedServiceId;

        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        @NameInMap("routeRuleId")
        public Long routeRuleId;

        @NameInMap("routeType")
        public String routeType;

        @NameInMap("ruleName")
        public String ruleName;

        @NameInMap("tenantRamId")
        public Long tenantRamId;

        @NameInMap("timeWindow")
        public Long timeWindow;

        @NameInMap("timeWindowUnit")
        public Long timeWindowUnit;

        @NameInMap("updateTime")
        public String updateTime;

        public static ListRouteRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRouteRulesResponseBodyData self = new ListRouteRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRouteRulesResponseBodyData setAssignObjectId(Long assignObjectId) {
            this.assignObjectId = assignObjectId;
            return this;
        }
        public Long getAssignObjectId() {
            return this.assignObjectId;
        }

        public ListRouteRulesResponseBodyData setAssignObjectType(String assignObjectType) {
            this.assignObjectType = assignObjectType;
            return this;
        }
        public String getAssignObjectType() {
            return this.assignObjectType;
        }

        public ListRouteRulesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRouteRulesResponseBodyData setEffection(String effection) {
            this.effection = effection;
            return this;
        }
        public String getEffection() {
            return this.effection;
        }

        public ListRouteRulesResponseBodyData setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public ListRouteRulesResponseBodyData setIncidentLevel(String incidentLevel) {
            this.incidentLevel = incidentLevel;
            return this;
        }
        public String getIncidentLevel() {
            return this.incidentLevel;
        }

        public ListRouteRulesResponseBodyData setIsValid(Integer isValid) {
            this.isValid = isValid;
            return this;
        }
        public Integer getIsValid() {
            return this.isValid;
        }

        public ListRouteRulesResponseBodyData setMatchCount(Long matchCount) {
            this.matchCount = matchCount;
            return this;
        }
        public Long getMatchCount() {
            return this.matchCount;
        }

        public ListRouteRulesResponseBodyData setMonitorSourceNames(String monitorSourceNames) {
            this.monitorSourceNames = monitorSourceNames;
            return this;
        }
        public String getMonitorSourceNames() {
            return this.monitorSourceNames;
        }

        public ListRouteRulesResponseBodyData setRelServiceDeleteType(Integer relServiceDeleteType) {
            this.relServiceDeleteType = relServiceDeleteType;
            return this;
        }
        public Integer getRelServiceDeleteType() {
            return this.relServiceDeleteType;
        }

        public ListRouteRulesResponseBodyData setRelatedServiceId(Long relatedServiceId) {
            this.relatedServiceId = relatedServiceId;
            return this;
        }
        public Long getRelatedServiceId() {
            return this.relatedServiceId;
        }

        public ListRouteRulesResponseBodyData setRelatedServiceName(String relatedServiceName) {
            this.relatedServiceName = relatedServiceName;
            return this;
        }
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        public ListRouteRulesResponseBodyData setRouteRuleId(Long routeRuleId) {
            this.routeRuleId = routeRuleId;
            return this;
        }
        public Long getRouteRuleId() {
            return this.routeRuleId;
        }

        public ListRouteRulesResponseBodyData setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

        public ListRouteRulesResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListRouteRulesResponseBodyData setTenantRamId(Long tenantRamId) {
            this.tenantRamId = tenantRamId;
            return this;
        }
        public Long getTenantRamId() {
            return this.tenantRamId;
        }

        public ListRouteRulesResponseBodyData setTimeWindow(Long timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }
        public Long getTimeWindow() {
            return this.timeWindow;
        }

        public ListRouteRulesResponseBodyData setTimeWindowUnit(Long timeWindowUnit) {
            this.timeWindowUnit = timeWindowUnit;
            return this;
        }
        public Long getTimeWindowUnit() {
            return this.timeWindowUnit;
        }

        public ListRouteRulesResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
