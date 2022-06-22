// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelMacTopNResourcesRequest extends TeaModel {
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

    @NameInMap("ProcessConfigurationId")
    public String processConfigurationId;

    @NameInMap("ResourceType")
    public Integer resourceType;

    @NameInMap("SearchKey")
    public String searchKey;

    public static SentinelMacTopNResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelMacTopNResourcesRequest self = new SentinelMacTopNResourcesRequest();
        return TeaModel.build(map, self);
    }

    public SentinelMacTopNResourcesRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelMacTopNResourcesRequest setAhasTimestamp(Long ahasTimestamp) {
        this.ahasTimestamp = ahasTimestamp;
        return this;
    }
    public Long getAhasTimestamp() {
        return this.ahasTimestamp;
    }

    public SentinelMacTopNResourcesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelMacTopNResourcesRequest setDesc(Boolean desc) {
        this.desc = desc;
        return this;
    }
    public Boolean getDesc() {
        return this.desc;
    }

    public SentinelMacTopNResourcesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelMacTopNResourcesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelMacTopNResourcesRequest setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public Integer getOrderBy() {
        return this.orderBy;
    }

    public SentinelMacTopNResourcesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public SentinelMacTopNResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SentinelMacTopNResourcesRequest setProcessConfigurationId(String processConfigurationId) {
        this.processConfigurationId = processConfigurationId;
        return this;
    }
    public String getProcessConfigurationId() {
        return this.processConfigurationId;
    }

    public SentinelMacTopNResourcesRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public SentinelMacTopNResourcesRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
