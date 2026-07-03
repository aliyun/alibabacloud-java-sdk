// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListCloudSiemPredefinedRulesRequest extends TeaModel {
    /**
     * <p>The alert type.</p>
     * 
     * <strong>example:</strong>
     * <p>scan</p>
     */
    @NameInMap("AlertType")
    public String alertType;

    /**
     * <p>The ATT\&amp;CK technique.</p>
     * 
     * <strong>example:</strong>
     * <p>T1595.002 Vulnerability Scanning</p>
     */
    @NameInMap("AttCk")
    public String attCk;

    /**
     * <p>The page number. The value must be greater than or equal to 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The event generation method. Valid values:</p>
     * <ul>
     * <li><p>default: the default built-in method</p>
     * </li>
     * <li><p>singleToSingle: An event is generated for each alert.</p>
     * </li>
     * <li><p>allToSingle: An event is generated for all alerts in an epoch.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>allToSingle</p>
     */
    @NameInMap("EventTransferType")
    public String eventTransferType;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10223</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The log source.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_siem_alb_flow_log</p>
     */
    @NameInMap("LogSource")
    public String logSource;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p>desc: descending</p>
     * </li>
     * <li><p>asc: ascending</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The field to sort the rules by. Valid values:</p>
     * <ul>
     * <li><p>GmtModified: Sorts by modification time.</p>
     * </li>
     * <li><p>Id: Sorts by rule ID. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Id</p>
     */
    @NameInMap("OrderField")
    public String orderField;

    /**
     * <p>The number of entries per page. The maximum value is 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region where the Data Management center of the threat analysis feature is located. Select the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: assets in the Chinese mainland or China (Hong Kong)</p>
     * </li>
     * <li><p>ap-southeast-1: assets outside China</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID that the administrator uses to switch to the perspective of a member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type.</p>
     * <ul>
     * <li><p>0: the view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: the view of all accounts in the enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The rule name. The name can contain only letters, digits, underscores (_), and periods (.).</p>
     * 
     * <strong>example:</strong>
     * <p>waf_scan</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The rule type. Valid values:</p>
     * <ul>
     * <li><p>predefine: predefined</p>
     * </li>
     * <li><p>customize: custom</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>customize</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The start of the time range to query. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The rule status. Valid values:</p>
     * <ul>
     * <li><p>0: initial</p>
     * </li>
     * <li><p>10: testing with simulated data</p>
     * </li>
     * <li><p>15: testing with production data</p>
     * </li>
     * <li><p>20: testing with production data is complete</p>
     * </li>
     * <li><p>100: published</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The threat level. The value is a JSON array. Valid values:</p>
     * <ul>
     * <li><p>serious: high</p>
     * </li>
     * <li><p>suspicious: medium</p>
     * </li>
     * <li><p>remind: low</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;serious&quot;,&quot;suspicious&quot;,&quot;remind&quot;]</p>
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
