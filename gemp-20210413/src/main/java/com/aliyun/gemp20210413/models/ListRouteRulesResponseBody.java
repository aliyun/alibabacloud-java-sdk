// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListRouteRulesResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    // 规则列表
    @NameInMap("data")
    public java.util.List<ListRouteRulesResponseBodyData> data;

    // 总条数
    @NameInMap("totalCount")
    public Long totalCount;

    // 第几页
    @NameInMap("pageNumber")
    public Long pageNumber;

    // 分页大小
    @NameInMap("pageSize")
    public Long pageSize;

    public static ListRouteRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRouteRulesResponseBody self = new ListRouteRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRouteRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRouteRulesResponseBody setData(java.util.List<ListRouteRulesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListRouteRulesResponseBodyData> getData() {
        return this.data;
    }

    public ListRouteRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
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

    public static class ListRouteRulesResponseBodyData extends TeaModel {
        // 规则ID
        @NameInMap("routeRuleId")
        public Long routeRuleId;

        // 租户ID
        @NameInMap("tenantRamId")
        public Long tenantRamId;

        // 规则名称
        @NameInMap("ruleName")
        public String ruleName;

        // 服务名称
        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        // 时间窗口
        @NameInMap("timeWindow")
        public Long timeWindow;

        // 命中次数
        @NameInMap("matchCount")
        public Long matchCount;

        // 时间窗口单位 MINUTE 分钟  SECOND 秒
        @NameInMap("timeWindowUnit")
        public Long timeWindowUnit;

        // 关联服务ID
        @NameInMap("relatedServiceId")
        public Long relatedServiceId;

        // 路由类型：INCIDENT 触发事件 ALERT 仅触发报警
        @NameInMap("routeType")
        public String routeType;

        // 事件级别 P1 P2 P3 P4
        @NameInMap("incidentLevel")
        public String incidentLevel;

        // 事件分派对象ID（服务组ID 或用户ID）
        @NameInMap("assignObjectId")
        public Long assignObjectId;

        // 事件分派对象类型 SERVICEGROUP 服务组  USER 单个用户
        @NameInMap("assignObjectType")
        public String assignObjectType;

        // 影响程度 LOW-一般 HIGH-严重
        @NameInMap("effection")
        public String effection;

        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 修改时间
        @NameInMap("updateTime")
        public String updateTime;

        // 是否启用  DISABLE禁用. ENABLE 启用
        @NameInMap("enableStatus")
        public String enableStatus;

        public static ListRouteRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRouteRulesResponseBodyData self = new ListRouteRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRouteRulesResponseBodyData setRouteRuleId(Long routeRuleId) {
            this.routeRuleId = routeRuleId;
            return this;
        }
        public Long getRouteRuleId() {
            return this.routeRuleId;
        }

        public ListRouteRulesResponseBodyData setTenantRamId(Long tenantRamId) {
            this.tenantRamId = tenantRamId;
            return this;
        }
        public Long getTenantRamId() {
            return this.tenantRamId;
        }

        public ListRouteRulesResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListRouteRulesResponseBodyData setRelatedServiceName(String relatedServiceName) {
            this.relatedServiceName = relatedServiceName;
            return this;
        }
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        public ListRouteRulesResponseBodyData setTimeWindow(Long timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }
        public Long getTimeWindow() {
            return this.timeWindow;
        }

        public ListRouteRulesResponseBodyData setMatchCount(Long matchCount) {
            this.matchCount = matchCount;
            return this;
        }
        public Long getMatchCount() {
            return this.matchCount;
        }

        public ListRouteRulesResponseBodyData setTimeWindowUnit(Long timeWindowUnit) {
            this.timeWindowUnit = timeWindowUnit;
            return this;
        }
        public Long getTimeWindowUnit() {
            return this.timeWindowUnit;
        }

        public ListRouteRulesResponseBodyData setRelatedServiceId(Long relatedServiceId) {
            this.relatedServiceId = relatedServiceId;
            return this;
        }
        public Long getRelatedServiceId() {
            return this.relatedServiceId;
        }

        public ListRouteRulesResponseBodyData setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

        public ListRouteRulesResponseBodyData setIncidentLevel(String incidentLevel) {
            this.incidentLevel = incidentLevel;
            return this;
        }
        public String getIncidentLevel() {
            return this.incidentLevel;
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

        public ListRouteRulesResponseBodyData setEffection(String effection) {
            this.effection = effection;
            return this;
        }
        public String getEffection() {
            return this.effection;
        }

        public ListRouteRulesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRouteRulesResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListRouteRulesResponseBodyData setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

    }

}
