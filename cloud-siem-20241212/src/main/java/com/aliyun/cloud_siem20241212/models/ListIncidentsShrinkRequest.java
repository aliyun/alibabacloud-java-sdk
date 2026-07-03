// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListIncidentsShrinkRequest extends TeaModel {
    /**
     * <p>The alert ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sas_71e24437d2797ce8fc59692905a4****</p>
     */
    @NameInMap("AlertUuid")
    public String alertUuid;

    /**
     * <p>The end time as a timestamp in milliseconds (ms).</p>
     * 
     * <strong>example:</strong>
     * <p>1749090526055</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The name of the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS unusual log in</p>
     */
    @NameInMap("IncidentName")
    public String incidentName;

    /**
     * <p>The status of the incident. Valid values:</p>
     * <ul>
     * <li>0: unhandled.</li>
     * <li>1: handling.</li>
     * <li>5: handling failed.</li>
     * <li>10: handled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IncidentStatus")
    public Integer incidentStatus;

    /**
     * <p>The tags of the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;data_source\&quot;:[\&quot;sas\&quot;]}]</p>
     */
    @NameInMap("IncidentTags")
    public String incidentTags;

    /**
     * <p>The list of incident UUIDs, separated by commas (,).</p>
     */
    @NameInMap("IncidentUuids")
    public String incidentUuidsShrink;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query. Leave this parameter empty for the first query or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAASLVeIxed4466E0LVmGkzwS6hJKd9DGVGMDRM6Lu****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort direction. Valid values:</p>
     * <ul>
     * <li><strong>desc</strong> (default): descending order.</li>
     * <li><strong>asc</strong>: ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("OrderDirection")
    public String orderDirection;

    /**
     * <p>The field name used to sort the list. Valid values:</p>
     * <ul>
     * <li>GmtModified: sorts by incident update time (default).</li>
     * <li>ThreatScore: sorts by threat score.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtModified</p>
     */
    @NameInMap("OrderFieldName")
    public String orderFieldName;

    /**
     * <p>The UID of the account that owns the incident.</p>
     */
    @NameInMap("Owners")
    public java.util.List<String> owners;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: Your assets reside outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the asset associated with the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>6c740667-80b2-476d-8924-2e706feb****</p>
     */
    @NameInMap("RelateAssetId")
    public String relateAssetId;

    /**
     * <p>The ID of the entity associated with the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>b920ed22259f5412099e97dfda96****</p>
     */
    @NameInMap("RelateEntityId")
    public String relateEntityId;

    /**
     * <p>The user ID of the member to which the administrator switches the view.</p>
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
     * <p>The start time as a timestamp in milliseconds (ms).</p>
     * 
     * <strong>example:</strong>
     * <p>1690102943000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The threat level. Valid values:</p>
     * <ul>
     * <li>5: critical.</li>
     * <li>4: high.</li>
     * <li>3: medium.</li>
     * <li>2: low.</li>
     * <li>1: informational.</li>
     * </ul>
     */
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

    public ListIncidentsShrinkRequest setOwners(java.util.List<String> owners) {
        this.owners = owners;
        return this;
    }
    public java.util.List<String> getOwners() {
        return this.owners;
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
