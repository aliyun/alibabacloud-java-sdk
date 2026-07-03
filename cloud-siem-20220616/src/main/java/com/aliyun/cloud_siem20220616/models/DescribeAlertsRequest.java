// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertsRequest extends TeaModel {
    /**
     * <p>The name of the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>Try SNMP weak password</p>
     */
    @NameInMap("AlertName")
    public String alertName;

    /**
     * <p>The status of the alert.</p>
     */
    @NameInMap("AlertStatus")
    public java.util.List<String> alertStatus;

    /**
     * <p>The title of the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>Unusual Logon-login_common_account</p>
     */
    @NameInMap("AlertTitle")
    public String alertTitle;

    /**
     * <p>The type of the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>Scan</p>
     */
    @NameInMap("AlertType")
    public String alertType;

    /**
     * <p>The unique ID of the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>sas_71e24437d2797ce8fc59692905a4****</p>
     */
    @NameInMap("AlertUuid")
    public String alertUuid;

    /**
     * <p>The ID of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>F3385128-69A5-3EE8-BD05-FBEE7DB2****</p>
     */
    @NameInMap("AssetId")
    public String assetId;

    /**
     * <p>The name of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>hostname-****</p>
     */
    @NameInMap("AssetName")
    public String assetName;

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
     * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>f366e287ea530e7a324cbe987993****</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The name of the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>launch-advisor-*****</p>
     */
    @NameInMap("EntityName")
    public String entityName;

    /**
     * <p>Specifies whether the threat is defended. Valid values:</p>
     * <ul>
     * <li><p><code>0</code>: detected</p>
     * </li>
     * <li><p><code>1</code>: blocked</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsDefend")
    public String isDefend;

    /**
     * <p>The alert type. Valid values:</p>
     * <ul>
     * <li><p><code>system</code>: An alert generated from aggregated analysis</p>
     * </li>
     * <li><p><code>custom</code>: An alert generated from custom analysis</p>
     * </li>
     * <li><p><code>cfw</code>: firewall</p>
     * </li>
     * <li><p><code>waf</code>: web application firewall</p>
     * </li>
     * <li><p><code>edr</code>: endpoint detection and response</p>
     * </li>
     * <li><p><code>other</code>: other</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("LabelType")
    public String labelType;

    /**
     * <p>The threat levels. This parameter is a JSON array. Valid values:</p>
     * <ul>
     * <li><p><code>serious</code>: high</p>
     * </li>
     * <li><p><code>suspicious</code>: medium</p>
     * </li>
     * <li><p><code>remind</code>: low</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;serious&quot;,&quot;suspicious&quot;,&quot;remind&quot;]</p>
     */
    @NameInMap("Level")
    public java.util.List<String> level;

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
     * <p>The region where the data management center of the threat analysis feature resides. You are required to specify this parameter based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li><p><code>cn-hangzhou</code>: Your assets reside in the Chinese mainland or Hong Kong (China).</p>
     * </li>
     * <li><p><code>ap-southeast-1</code>: Your assets reside outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user who is used to switch the account to view the data of the member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type of the alert. Valid values:</p>
     * <ul>
     * <li><p><code>0</code>: current account</p>
     * </li>
     * <li><p><code>1</code>: all accounts</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The source of the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The ID of the Alibaba Cloud account that is associated with the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>176555323***</p>
     */
    @NameInMap("SubUserId")
    public String subUserId;

    public static DescribeAlertsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertsRequest self = new DescribeAlertsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertsRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public DescribeAlertsRequest setAlertStatus(java.util.List<String> alertStatus) {
        this.alertStatus = alertStatus;
        return this;
    }
    public java.util.List<String> getAlertStatus() {
        return this.alertStatus;
    }

    public DescribeAlertsRequest setAlertTitle(String alertTitle) {
        this.alertTitle = alertTitle;
        return this;
    }
    public String getAlertTitle() {
        return this.alertTitle;
    }

    public DescribeAlertsRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public DescribeAlertsRequest setAlertUuid(String alertUuid) {
        this.alertUuid = alertUuid;
        return this;
    }
    public String getAlertUuid() {
        return this.alertUuid;
    }

    public DescribeAlertsRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public DescribeAlertsRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public DescribeAlertsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAlertsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAlertsRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public DescribeAlertsRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public DescribeAlertsRequest setIsDefend(String isDefend) {
        this.isDefend = isDefend;
        return this;
    }
    public String getIsDefend() {
        return this.isDefend;
    }

    public DescribeAlertsRequest setLabelType(String labelType) {
        this.labelType = labelType;
        return this;
    }
    public String getLabelType() {
        return this.labelType;
    }

    public DescribeAlertsRequest setLevel(java.util.List<String> level) {
        this.level = level;
        return this;
    }
    public java.util.List<String> getLevel() {
        return this.level;
    }

    public DescribeAlertsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlertsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAlertsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeAlertsRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public DescribeAlertsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeAlertsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeAlertsRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

}
