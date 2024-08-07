// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListCloudSiemCustomizeRulesRequest extends TeaModel {
    /**
     * <p>The alert type.</p>
     * 
     * <strong>example:</strong>
     * <p>scan</p>
     */
    @NameInMap("AlertType")
    public String alertType;

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
     * <p>The ID of the custom rule.</p>
     * 
     * <strong>example:</strong>
     * <p>10223</p>
     */
    @NameInMap("Id")
    public String id;

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
     * <p>The number of entries per page. The value can be up to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Your assets reside in regions in China.</li>
     * <li><strong>ap-southeast-1</strong>: Your assets reside in regions outside China.</li>
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
     * <p>The type of the view. Valid values:</p>
     * <ul>
     * <li>0: view of the current Alibaba Cloud account.</li>
     * <li>1: view of all accounts for the enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
     * <li><strong>predefine</strong></li>
     * <li><strong>customize</strong></li>
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
     * <li><strong>0</strong>: The rule is in the initial state.</li>
     * <li><strong>10</strong>: The simulation data is tested.</li>
     * <li><strong>15</strong>: The business data is being tested.</li>
     * <li><strong>20</strong>: The business data test is complete.</li>
     * <li><strong>100</strong>: The rule is in effect.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The threat level. The value must be a JSON array. Valid values:</p>
     * <ul>
     * <li><strong>serious</strong>: high-risk.</li>
     * <li><strong>suspicious</strong>: medium-risk.</li>
     * <li><strong>remind</strong>: low-risk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;serious&quot;,&quot;suspicious&quot;,&quot;remind&quot;]</p>
     */
    @NameInMap("ThreatLevel")
    public java.util.List<String> threatLevel;

    public static ListCloudSiemCustomizeRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudSiemCustomizeRulesRequest self = new ListCloudSiemCustomizeRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudSiemCustomizeRulesRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public ListCloudSiemCustomizeRulesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCloudSiemCustomizeRulesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListCloudSiemCustomizeRulesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListCloudSiemCustomizeRulesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListCloudSiemCustomizeRulesRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public ListCloudSiemCustomizeRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCloudSiemCustomizeRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCloudSiemCustomizeRulesRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListCloudSiemCustomizeRulesRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public ListCloudSiemCustomizeRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListCloudSiemCustomizeRulesRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public ListCloudSiemCustomizeRulesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListCloudSiemCustomizeRulesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListCloudSiemCustomizeRulesRequest setThreatLevel(java.util.List<String> threatLevel) {
        this.threatLevel = threatLevel;
        return this;
    }
    public java.util.List<String> getThreatLevel() {
        return this.threatLevel;
    }

}
