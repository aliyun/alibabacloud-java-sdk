// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListIncidentsRequest extends TeaModel {
    /**
     * <p>The alert ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sas_71e24437d2797ce8fc59692905a4****</p>
     */
    @NameInMap("AlertUuid")
    public String alertUuid;

    /**
     * <p>The end time as a UNIX timestamp in milliseconds (ms).</p>
     * 
     * <strong>example:</strong>
     * <p>1749090526055</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The event name.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS unusual log in</p>
     */
    @NameInMap("IncidentName")
    public String incidentName;

    /**
     * <p>The event status. Valid values:</p>
     * <ul>
     * <li>0: Unhandled.</li>
     * <li>1: Handling.</li>
     * <li>5: Handling failed.</li>
     * <li>10: Handled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IncidentStatus")
    public Integer incidentStatus;

    /**
     * <strong>example:</strong>
     * <p>[0,1,5]</p>
     */
    @NameInMap("IncidentStatusList")
    public java.util.List<String> incidentStatusList;

    /**
     * <p>The event tags.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;data_source\&quot;:[\&quot;sas\&quot;]}]</p>
     */
    @NameInMap("IncidentTags")
    public String incidentTags;

    /**
     * <p>The list of event UUIDs, separated by commas (,).</p>
     */
    @NameInMap("IncidentUuids")
    public java.util.List<String> incidentUuids;

    /**
     * <p>The language type of the response messages. Valid values:</p>
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
     * <p>The maximum number of entries to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query. Leave this parameter empty for the first query or if no more results exist. If a next page exists, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAASLVeIxed4466E0LVmGkzwS6hJKd9DGVGMDRM6Lu****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort direction. Valid values:</p>
     * <ul>
     * <li><strong>desc</strong> (default): Descending order.</li>
     * <li><strong>asc</strong>: Ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("OrderDirection")
    public String orderDirection;

    /**
     * <p>The name of the field used to sort the list.</p>
     * <ul>
     * <li>GmtModified: Event update time (default).</li>
     * <li>ThreatScore: Threat score.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtModified</p>
     */
    @NameInMap("OrderFieldName")
    public String orderFieldName;

    /**
     * <p>The UID of the account responsible for the event.</p>
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
     * <p>The region where the threat analysis data management center is located. Select the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: Your assets are located outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the asset associated with the event.</p>
     * 
     * <strong>example:</strong>
     * <p>6c740667-80b2-476d-8924-2e706feb****</p>
     */
    @NameInMap("RelateAssetId")
    public String relateAssetId;

    /**
     * <p>The ID of the entity associated with the event.</p>
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
     * <li>0: The view of the current Alibaba Cloud account.</li>
     * <li>1: The view of all accounts in the enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The start time as a UNIX timestamp in milliseconds (ms).</p>
     * 
     * <strong>example:</strong>
     * <p>1690102943000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The threat level. Valid values:</p>
     * <ul>
     * <li>5: Critical.</li>
     * <li>4: High.</li>
     * <li>3: Medium.</li>
     * <li>2: Low.</li>
     * <li>1: Informational.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ThreatLevel")
    public java.util.List<String> threatLevel;

    public static ListIncidentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentsRequest self = new ListIncidentsRequest();
        return TeaModel.build(map, self);
    }

    public ListIncidentsRequest setAlertUuid(String alertUuid) {
        this.alertUuid = alertUuid;
        return this;
    }
    public String getAlertUuid() {
        return this.alertUuid;
    }

    public ListIncidentsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListIncidentsRequest setIncidentName(String incidentName) {
        this.incidentName = incidentName;
        return this;
    }
    public String getIncidentName() {
        return this.incidentName;
    }

    public ListIncidentsRequest setIncidentStatus(Integer incidentStatus) {
        this.incidentStatus = incidentStatus;
        return this;
    }
    public Integer getIncidentStatus() {
        return this.incidentStatus;
    }

    public ListIncidentsRequest setIncidentStatusList(java.util.List<String> incidentStatusList) {
        this.incidentStatusList = incidentStatusList;
        return this;
    }
    public java.util.List<String> getIncidentStatusList() {
        return this.incidentStatusList;
    }

    public ListIncidentsRequest setIncidentTags(String incidentTags) {
        this.incidentTags = incidentTags;
        return this;
    }
    public String getIncidentTags() {
        return this.incidentTags;
    }

    public ListIncidentsRequest setIncidentUuids(java.util.List<String> incidentUuids) {
        this.incidentUuids = incidentUuids;
        return this;
    }
    public java.util.List<String> getIncidentUuids() {
        return this.incidentUuids;
    }

    public ListIncidentsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListIncidentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIncidentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIncidentsRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListIncidentsRequest setOrderFieldName(String orderFieldName) {
        this.orderFieldName = orderFieldName;
        return this;
    }
    public String getOrderFieldName() {
        return this.orderFieldName;
    }

    public ListIncidentsRequest setOwners(java.util.List<String> owners) {
        this.owners = owners;
        return this;
    }
    public java.util.List<String> getOwners() {
        return this.owners;
    }

    public ListIncidentsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIncidentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIncidentsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListIncidentsRequest setRelateAssetId(String relateAssetId) {
        this.relateAssetId = relateAssetId;
        return this;
    }
    public String getRelateAssetId() {
        return this.relateAssetId;
    }

    public ListIncidentsRequest setRelateEntityId(String relateEntityId) {
        this.relateEntityId = relateEntityId;
        return this;
    }
    public String getRelateEntityId() {
        return this.relateEntityId;
    }

    public ListIncidentsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListIncidentsRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public ListIncidentsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListIncidentsRequest setThreatLevel(java.util.List<String> threatLevel) {
        this.threatLevel = threatLevel;
        return this;
    }
    public java.util.List<String> getThreatLevel() {
        return this.threatLevel;
    }

}
