// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelMetricListTopNResourceNameRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AhasTimestamp")
    public Long ahasTimestamp;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Desc")
    public Boolean desc;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OrderBy")
    public Integer orderBy;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceType")
    public Integer resourceType;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("TrafficType")
    public Integer trafficType;

    public static SentinelMetricListTopNResourceNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelMetricListTopNResourceNameRequest self = new SentinelMetricListTopNResourceNameRequest();
        return TeaModel.build(map, self);
    }

    public SentinelMetricListTopNResourceNameRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelMetricListTopNResourceNameRequest setAhasTimestamp(Long ahasTimestamp) {
        this.ahasTimestamp = ahasTimestamp;
        return this;
    }
    public Long getAhasTimestamp() {
        return this.ahasTimestamp;
    }

    public SentinelMetricListTopNResourceNameRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelMetricListTopNResourceNameRequest setDesc(Boolean desc) {
        this.desc = desc;
        return this;
    }
    public Boolean getDesc() {
        return this.desc;
    }

    public SentinelMetricListTopNResourceNameRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelMetricListTopNResourceNameRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelMetricListTopNResourceNameRequest setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public Integer getOrderBy() {
        return this.orderBy;
    }

    public SentinelMetricListTopNResourceNameRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public SentinelMetricListTopNResourceNameRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SentinelMetricListTopNResourceNameRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public SentinelMetricListTopNResourceNameRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public SentinelMetricListTopNResourceNameRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public SentinelMetricListTopNResourceNameRequest setTrafficType(Integer trafficType) {
        this.trafficType = trafficType;
        return this;
    }
    public Integer getTrafficType() {
        return this.trafficType;
    }

}
