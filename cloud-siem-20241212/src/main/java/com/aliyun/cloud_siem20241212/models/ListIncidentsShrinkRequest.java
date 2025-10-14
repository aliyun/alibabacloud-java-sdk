// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListIncidentsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sas_71e24437d2797ce8fc59692905a4****</p>
     */
    @NameInMap("AlertUuid")
    public String alertUuid;

    /**
     * <strong>example:</strong>
     * <p>1749090526055</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>ECS unusual log in</p>
     */
    @NameInMap("IncidentName")
    public String incidentName;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IncidentStatus")
    public Integer incidentStatus;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;data_source\&quot;:[\&quot;sas\&quot;]}]</p>
     */
    @NameInMap("IncidentTags")
    public String incidentTags;

    @NameInMap("IncidentUuids")
    public String incidentUuidsShrink;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAASLVeIxed4466E0LVmGkzwS6hJKd9DGVGMDRM6Lu****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("OrderDirection")
    public String orderDirection;

    /**
     * <strong>example:</strong>
     * <p>GmtModified</p>
     */
    @NameInMap("OrderFieldName")
    public String orderFieldName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>6c740667-80b2-476d-8924-2e706feb****</p>
     */
    @NameInMap("RelateAssetId")
    public String relateAssetId;

    @NameInMap("RelateEntityId")
    public String relateEntityId;

    /**
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <strong>example:</strong>
     * <p>1690102943000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("ThreatLevel")
    public java.util.List<String> threatLevel;

    public static ListIncidentsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentsShrinkRequest self = new ListIncidentsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListIncidentsShrinkRequest setAlertUuid(String alertUuid) {
        this.alertUuid = alertUuid;
        return this;
    }
    public String getAlertUuid() {
        return this.alertUuid;
    }

    public ListIncidentsShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListIncidentsShrinkRequest setIncidentName(String incidentName) {
        this.incidentName = incidentName;
        return this;
    }
    public String getIncidentName() {
        return this.incidentName;
    }

    public ListIncidentsShrinkRequest setIncidentStatus(Integer incidentStatus) {
        this.incidentStatus = incidentStatus;
        return this;
    }
    public Integer getIncidentStatus() {
        return this.incidentStatus;
    }

    public ListIncidentsShrinkRequest setIncidentTags(String incidentTags) {
        this.incidentTags = incidentTags;
        return this;
    }
    public String getIncidentTags() {
        return this.incidentTags;
    }

    public ListIncidentsShrinkRequest setIncidentUuidsShrink(String incidentUuidsShrink) {
        this.incidentUuidsShrink = incidentUuidsShrink;
        return this;
    }
    public String getIncidentUuidsShrink() {
        return this.incidentUuidsShrink;
    }

    public ListIncidentsShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListIncidentsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIncidentsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIncidentsShrinkRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListIncidentsShrinkRequest setOrderFieldName(String orderFieldName) {
        this.orderFieldName = orderFieldName;
        return this;
    }
    public String getOrderFieldName() {
        return this.orderFieldName;
    }

    public ListIncidentsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIncidentsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIncidentsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListIncidentsShrinkRequest setRelateAssetId(String relateAssetId) {
        this.relateAssetId = relateAssetId;
        return this;
    }
    public String getRelateAssetId() {
        return this.relateAssetId;
    }

    public ListIncidentsShrinkRequest setRelateEntityId(String relateEntityId) {
        this.relateEntityId = relateEntityId;
        return this;
    }
    public String getRelateEntityId() {
        return this.relateEntityId;
    }

    public ListIncidentsShrinkRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListIncidentsShrinkRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public ListIncidentsShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListIncidentsShrinkRequest setThreatLevel(java.util.List<String> threatLevel) {
        this.threatLevel = threatLevel;
        return this;
    }
    public java.util.List<String> getThreatLevel() {
        return this.threatLevel;
    }

}
