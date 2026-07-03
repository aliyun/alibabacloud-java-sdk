// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCloudSiemEventsRequest extends TeaModel {
    /**
     * <p>The ID of the asset that is associated with the event.</p>
     * 
     * <strong>example:</strong>
     * <p>6c740667-80b2-476d-8924-2e706feb****</p>
     */
    @NameInMap("AssetId")
    public String assetId;

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
     * <p>The end time of the query. This value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The UUID of the entity that is associated with the event.</p>
     * 
     * <strong>example:</strong>
     * <p>6c740667-80b2-476d-8924-2e706feb****</p>
     */
    @NameInMap("EntityUuid")
    public String entityUuid;

    /**
     * <p>The name of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS unusual log in</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

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
     * <p>The field to sort the event list by. Valid values:</p>
     * <ul>
     * <li><p>GmtModified: Sorts by modification time. This is the default value.</p>
     * </li>
     * <li><p>ThreatScore: Sorts by threat score.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ThreatScore</p>
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
     * <p>The region where the Data Management center of Threat Analysis &amp; Response is located. Select the region based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland or China (Hong Kong).</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are in regions outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member. The administrator can use this ID to view the data of the member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type.</p>
     * <ul>
     * <li><p>0: The view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: The view of all accounts that are managed by the administrator account.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The start time of the query. This value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The status of the event. Valid values:</p>
     * <ul>
     * <li><p>0: unhandled</p>
     * </li>
     * <li><p>1: in progress</p>
     * </li>
     * <li><p>5: failed</p>
     * </li>
     * <li><p>10: handled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The threat level of the event. The value is a JSON array. Valid values:</p>
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
    @NameInMap("ThreadLevel")
    public java.util.List<String> threadLevel;

    public static DescribeCloudSiemEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudSiemEventsRequest self = new DescribeCloudSiemEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudSiemEventsRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public DescribeCloudSiemEventsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCloudSiemEventsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeCloudSiemEventsRequest setEntityUuid(String entityUuid) {
        this.entityUuid = entityUuid;
        return this;
    }
    public String getEntityUuid() {
        return this.entityUuid;
    }

    public DescribeCloudSiemEventsRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public DescribeCloudSiemEventsRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public DescribeCloudSiemEventsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeCloudSiemEventsRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public DescribeCloudSiemEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudSiemEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCloudSiemEventsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeCloudSiemEventsRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public DescribeCloudSiemEventsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeCloudSiemEventsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeCloudSiemEventsRequest setThreadLevel(java.util.List<String> threadLevel) {
        this.threadLevel = threadLevel;
        return this;
    }
    public java.util.List<String> getThreadLevel() {
        return this.threadLevel;
    }

}
