// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelListTopNAppsSummaryMetricOfAppTypeRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppTypes")
    public String appTypes;

    @NameInMap("Desc")
    public Boolean desc;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Lang")
    public String lang;

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

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("StartTime")
    public Long startTime;

    public static SentinelListTopNAppsSummaryMetricOfAppTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelListTopNAppsSummaryMetricOfAppTypeRequest self = new SentinelListTopNAppsSummaryMetricOfAppTypeRequest();
        return TeaModel.build(map, self);
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeRequest setAppTypes(String appTypes) {
        this.appTypes = appTypes;
        return this;
    }
    public String getAppTypes() {
        return this.appTypes;
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeRequest setDesc(Boolean desc) {
        this.desc = desc;
        return this;
    }
    public Boolean getDesc() {
        return this.desc;
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeRequest setMinHeartBeat(Long minHeartBeat) {
        this.minHeartBeat = minHeartBeat;
        return this;
    }
    public Long getMinHeartBeat() {
        return this.minHeartBeat;
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
