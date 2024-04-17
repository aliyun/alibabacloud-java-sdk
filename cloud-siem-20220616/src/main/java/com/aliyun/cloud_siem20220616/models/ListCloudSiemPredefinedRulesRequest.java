// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListCloudSiemPredefinedRulesRequest extends TeaModel {
    /**
     * <p>The alert type.</p>
     */
    @NameInMap("AlertType")
    public String alertType;

    @NameInMap("AttCk")
    public String attCk;

    /**
     * <p>The page number. Pages start from page 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end of the time range to query. Unit: milliseconds.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("EventTransferType")
    public String eventTransferType;

    /**
     * <p>The ID of the rule.</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("LogSource")
    public String logSource;

    @NameInMap("Order")
    public String order;

    @NameInMap("OrderField")
    public String orderField;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The name of the rule. The name can contain letters, digits, underscores (\_), and periods (.).</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The type of the rule. Valid values:</p>
     * <br>
     * <p>*   predefine</p>
     * <p>*   customize</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The beginning of the time range to query. Unit: milliseconds.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The status of the rule. Valid values:</p>
     * <br>
     * <p>*   0: The rule is in the initial state.</p>
     * <p>*   10: The simulation data is tested.</p>
     * <p>*   15: The business data is being tested.</p>
     * <p>*   20: The business data test ends.</p>
     * <p>*   100: The rule takes effect.</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The risk level. The value is a JSON array. Valid values:</p>
     * <br>
     * <p>*   serious: high</p>
     * <p>*   suspicious: medium</p>
     * <p>*   remind: low</p>
     */
    @NameInMap("ThreatLevel")
    public java.util.List<String> threatLevel;

    public static ListCloudSiemPredefinedRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudSiemPredefinedRulesRequest self = new ListCloudSiemPredefinedRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudSiemPredefinedRulesRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public ListCloudSiemPredefinedRulesRequest setAttCk(String attCk) {
        this.attCk = attCk;
        return this;
    }
    public String getAttCk() {
        return this.attCk;
    }

    public ListCloudSiemPredefinedRulesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCloudSiemPredefinedRulesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListCloudSiemPredefinedRulesRequest setEventTransferType(String eventTransferType) {
        this.eventTransferType = eventTransferType;
        return this;
    }
    public String getEventTransferType() {
        return this.eventTransferType;
    }

    public ListCloudSiemPredefinedRulesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListCloudSiemPredefinedRulesRequest setLogSource(String logSource) {
        this.logSource = logSource;
        return this;
    }
    public String getLogSource() {
        return this.logSource;
    }

    public ListCloudSiemPredefinedRulesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListCloudSiemPredefinedRulesRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public ListCloudSiemPredefinedRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCloudSiemPredefinedRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCloudSiemPredefinedRulesRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListCloudSiemPredefinedRulesRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public ListCloudSiemPredefinedRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListCloudSiemPredefinedRulesRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public ListCloudSiemPredefinedRulesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListCloudSiemPredefinedRulesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListCloudSiemPredefinedRulesRequest setThreatLevel(java.util.List<String> threatLevel) {
        this.threatLevel = threatLevel;
        return this;
    }
    public java.util.List<String> getThreatLevel() {
        return this.threatLevel;
    }

}
