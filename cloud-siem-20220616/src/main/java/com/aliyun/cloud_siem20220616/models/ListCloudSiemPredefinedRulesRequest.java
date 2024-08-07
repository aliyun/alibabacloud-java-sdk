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
     * <p>The ATT\&amp;CK information.</p>
     * 
     * <strong>example:</strong>
     * <p>T1595.002 Vulnerability Scanning</p>
     */
    @NameInMap("AttCk")
    public String attCk;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end of the time range to query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The method that is used to generate an event. Valid values:</p>
     * <ul>
     * <li>default: built-in method.</li>
     * <li>singleToSingle: The system generates an event for each alert.</li>
     * <li>allToSingle: The system generates an event for alerts within a period of time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>allToSingle</p>
     */
    @NameInMap("EventTransferType")
    public String eventTransferType;

    /**
     * <p>The ID of the rule.</p>
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
     * <p>cloud_siem_aegis_sas_alert</p>
     */
    @NameInMap("LogSource")
    public String logSource;

    /**
     * <p>The sort method. Valid values:</p>
     * <ul>
     * <li>desc: descending order.</li>
     * <li>asc: ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The field that is used to sort the rules. Valid values:</p>
     * <ul>
     * <li>GmtModified: The rules are sorted based on the modification time.</li>
     * <li>Id (default): The rules are sorted based on the rule ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Id</p>
     */
    @NameInMap("OrderField")
    public String orderField;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions in China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the destination account to which you switch the view from the management account.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view.</p>
     * <ul>
     * <li>0: view of the current Alibaba Cloud account.</li>
     * <li>1: view of all accounts for the enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The name of the rule. The name can contain letters, digits, underscores (_), and periods (.).</p>
     * 
     * <strong>example:</strong>
     * <p>waf_scan</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The type of the rule. Valid values:</p>
     * <ul>
     * <li>predefine</li>
     * <li>customize</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>customize</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The beginning of the time range to query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The status of the rule. Valid values:</p>
     * <ul>
     * <li>0: The rule is in the initial state.</li>
     * <li>10: The simulation data is tested.</li>
     * <li>15: The business data is being tested.</li>
     * <li>20: The business data test ends.</li>
     * <li>100: The rule takes effect.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The risk level. The value is a JSON array. Valid values:</p>
     * <ul>
     * <li>serious: high</li>
     * <li>suspicious: medium</li>
     * <li>remind: low</li>
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
