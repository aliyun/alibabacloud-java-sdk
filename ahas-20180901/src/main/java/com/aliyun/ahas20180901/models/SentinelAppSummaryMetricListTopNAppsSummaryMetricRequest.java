// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppSummaryMetricListTopNAppsSummaryMetricRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppType")
    public Integer appType;

    @NameInMap("Desc")
    public Boolean desc;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("MinHeartBeat")
    public Long minHeartBeat;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("StartTime")
    public Long startTime;

    public static SentinelAppSummaryMetricListTopNAppsSummaryMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppSummaryMetricListTopNAppsSummaryMetricRequest self = new SentinelAppSummaryMetricListTopNAppsSummaryMetricRequest();
        return TeaModel.build(map, self);
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricRequest setAppType(Integer appType) {
        this.appType = appType;
        return this;
    }
    public Integer getAppType() {
        return this.appType;
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricRequest setDesc(Boolean desc) {
        this.desc = desc;
        return this;
    }
    public Boolean getDesc() {
        return this.desc;
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricRequest setMinHeartBeat(Long minHeartBeat) {
        this.minHeartBeat = minHeartBeat;
        return this;
    }
    public Long getMinHeartBeat() {
        return this.minHeartBeat;
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
