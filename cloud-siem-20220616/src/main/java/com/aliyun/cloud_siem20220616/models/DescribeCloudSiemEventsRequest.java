// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCloudSiemEventsRequest extends TeaModel {
    @NameInMap("AssetId")
    public String assetId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("EventName")
    public String eventName;

    @NameInMap("IncidentUuid")
    public String incidentUuid;

    @NameInMap("Order")
    public String order;

    @NameInMap("OrderField")
    public String orderField;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Status")
    public Integer status;

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
