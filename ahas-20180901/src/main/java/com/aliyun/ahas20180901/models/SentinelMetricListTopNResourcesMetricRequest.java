// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelMetricListTopNResourcesMetricRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Desc")
    public Boolean desc;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("MetricType")
    public Integer metricType;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OrderBy")
    public Integer orderBy;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("StartTime")
    public Long startTime;

    public static SentinelMetricListTopNResourcesMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelMetricListTopNResourcesMetricRequest self = new SentinelMetricListTopNResourcesMetricRequest();
        return TeaModel.build(map, self);
    }

    public SentinelMetricListTopNResourcesMetricRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelMetricListTopNResourcesMetricRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelMetricListTopNResourcesMetricRequest setDesc(Boolean desc) {
        this.desc = desc;
        return this;
    }
    public Boolean getDesc() {
        return this.desc;
    }

    public SentinelMetricListTopNResourcesMetricRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SentinelMetricListTopNResourcesMetricRequest setMetricType(Integer metricType) {
        this.metricType = metricType;
        return this;
    }
    public Integer getMetricType() {
        return this.metricType;
    }

    public SentinelMetricListTopNResourcesMetricRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelMetricListTopNResourcesMetricRequest setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public Integer getOrderBy() {
        return this.orderBy;
    }

    public SentinelMetricListTopNResourcesMetricRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public SentinelMetricListTopNResourcesMetricRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SentinelMetricListTopNResourcesMetricRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public SentinelMetricListTopNResourcesMetricRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
