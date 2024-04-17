// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCloudSiemEventsRequest extends TeaModel {
    /**
     * <p>The ID of the asset that is associated with the event.</p>
     */
    @NameInMap("AssetId")
    public String assetId;

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

    /**
     * <p>The name of the event.</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The ID of the event.</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    /**
     * <p>The sort order. Valid values:</p>
     * <br>
     * <p>*   desc: descending order</p>
     * <p>*   asc: ascending order</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The sort field. Valid values:</p>
     * <br>
     * <p>*   GmtModified: sorts the events by creation time. This is the default value.</p>
     * <p>*   ThreatScore: sorts the events by risk score.</p>
     */
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
     * <p>The beginning of the time range to query. Unit: milliseconds.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The status of the event. Valid values:</p>
     * <br>
     * <p>*   0: unhandled</p>
     * <p>*   1: handling</p>
     * <p>*   5: handling failed</p>
     * <p>*   10: handled</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The risk levels of the events. The value is a JSON array. Valid values:</p>
     * <br>
     * <p>*   serious: high</p>
     * <p>*   suspicious: medium</p>
     * <p>*   remind: low</p>
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
