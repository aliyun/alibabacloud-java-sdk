// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertsWithEventRequest extends TeaModel {
    /**
     * <p>The alert name.</p>
     * 
     * <strong>example:</strong>
     * <p>Try SNMP weak password</p>
     */
    @NameInMap("AlertName")
    public String alertName;

    /**
     * <p>The alert title.</p>
     * 
     * <strong>example:</strong>
     * <p>Scan-Try SNMP weak password</p>
     */
    @NameInMap("AlertTitle")
    public String alertTitle;

    /**
     * <p>The alert type.</p>
     * 
     * <strong>example:</strong>
     * <p>Scan</p>
     */
    @NameInMap("AlertType")
    public String alertType;

    /**
     * <p>The asset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>09414e9ebaa9c19b84d851abb91d****</p>
     */
    @NameInMap("AssetId")
    public String assetId;

    /**
     * <p>The asset name.</p>
     * 
     * <strong>example:</strong>
     * <p>hostname-****</p>
     */
    @NameInMap("AssetName")
    public String assetName;

    /**
     * <p>The current page number. The value must be greater than or equal to 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end time of the query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The entity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>21034e803f492b926cea9e5beab4****</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The entity name.</p>
     * 
     * <strong>example:</strong>
     * <p>launch-advisor-*****</p>
     */
    @NameInMap("EntityName")
    public String entityName;

    /**
     * <p>The incident ID.</p>
     * 
     * <strong>example:</strong>
     * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    /**
     * <p>Specifies whether the alert has been defended. Valid values:</p>
     * <ul>
     * <li>0: detected</li>
     * <li>1: blocked</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsDefend")
    public String isDefend;

    /**
     * <p>The threat level in JSON array format. Valid values:</p>
     * <ul>
     * <li>serious: High.</li>
     * <li>suspicious: Medium.</li>
     * <li>remind: Low.</li>
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
     * <p>The region where the threat analysis data management center resides. Specify the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in Chinese mainland or China (Hong Kong).</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The member account ID of the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type. Valid values:</p>
     * <ul>
     * <li>0: the view of the current Alibaba Cloud account.</li>
     * <li>1: the view of all accounts in the enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The alert data source.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The start time of the query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The ID of the account associated with the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>176555323***</p>
     */
    @NameInMap("SubUserId")
    public Long subUserId;

    public static DescribeAlertsWithEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertsWithEventRequest self = new DescribeAlertsWithEventRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertsWithEventRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public DescribeAlertsWithEventRequest setAlertTitle(String alertTitle) {
        this.alertTitle = alertTitle;
        return this;
    }
    public String getAlertTitle() {
        return this.alertTitle;
    }

    public DescribeAlertsWithEventRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public DescribeAlertsWithEventRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public DescribeAlertsWithEventRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public DescribeAlertsWithEventRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAlertsWithEventRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAlertsWithEventRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public DescribeAlertsWithEventRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public DescribeAlertsWithEventRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public DescribeAlertsWithEventRequest setIsDefend(String isDefend) {
        this.isDefend = isDefend;
        return this;
    }
    public String getIsDefend() {
        return this.isDefend;
    }

    public DescribeAlertsWithEventRequest setLevel(java.util.List<String> level) {
        this.level = level;
        return this;
    }
    public java.util.List<String> getLevel() {
        return this.level;
    }

    public DescribeAlertsWithEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlertsWithEventRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAlertsWithEventRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeAlertsWithEventRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public DescribeAlertsWithEventRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeAlertsWithEventRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeAlertsWithEventRequest setSubUserId(Long subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public Long getSubUserId() {
        return this.subUserId;
    }

}
