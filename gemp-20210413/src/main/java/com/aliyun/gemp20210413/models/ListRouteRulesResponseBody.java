// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListRouteRulesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListRouteRulesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>C4BE3837-1A13B-A225-2C88188E8A43</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("assignObjectId")
        public Long assignObjectId;

        /**
         * <strong>example:</strong>
         * <p>SERVICEGROUP</p>
         */
        @NameInMap("assignObjectType")
        public String assignObjectType;

        /**
         * <strong>example:</strong>
         * <p>2020-03-05 15:53:55</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>LOW</p>
         */
        @NameInMap("effection")
        public String effection;

        /**
         * <strong>example:</strong>
         * <p>DISABLE</p>
         */
        @NameInMap("enableStatus")
        public String enableStatus;

        /**
         * <strong>example:</strong>
         * <p>P1</p>
         */
        @NameInMap("incidentLevel")
        public String incidentLevel;

        @NameInMap("isValid")
        public Integer isValid;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("matchCount")
        public Long matchCount;

        /**
         * <strong>example:</strong>
         * <p>zabbix</p>
         */
        @NameInMap("monitorSourceNames")
        public String monitorSourceNames;

        @NameInMap("relServiceDeleteType")
        public Integer relServiceDeleteType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("relatedServiceId")
        public Long relatedServiceId;

        /**
         * <strong>example:</strong>
         * <p>关联服务名字</p>
         */
        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("routeRuleId")
        public Long routeRuleId;

        /**
         * <strong>example:</strong>
         * <p>INCIDENT</p>
         */
        @NameInMap("routeType")
        public String routeType;

        /**
         * <strong>example:</strong>
         * <p>规则名字</p>
         */
        @NameInMap("ruleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>1344383</p>
         */
        @NameInMap("tenantRamId")
        public Long tenantRamId;

        /**
         * <strong>example:</strong>
         * <p>时间窗口</p>
         */
        @NameInMap("timeWindow")
        public Long timeWindow;

        /**
         * <strong>example:</strong>
         * <p>MINUTE</p>
         */
        @NameInMap("timeWindowUnit")
        public Long timeWindowUnit;

        /**
         * <strong>example:</strong>
         * <p>2020-03-05 15:53:55</p>
         */
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
