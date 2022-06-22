// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelResourceTopNMacsRequest extends TeaModel {
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

    @NameInMap("Resource")
    public String resource;

    @NameInMap("SearchKey")
    public String searchKey;

    public static SentinelResourceTopNMacsRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelResourceTopNMacsRequest self = new SentinelResourceTopNMacsRequest();
        return TeaModel.build(map, self);
    }

    public SentinelResourceTopNMacsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelResourceTopNMacsRequest setAhasTimestamp(Long ahasTimestamp) {
        this.ahasTimestamp = ahasTimestamp;
        return this;
    }
    public Long getAhasTimestamp() {
        return this.ahasTimestamp;
    }

    public SentinelResourceTopNMacsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelResourceTopNMacsRequest setDesc(Boolean desc) {
        this.desc = desc;
        return this;
    }
    public Boolean getDesc() {
        return this.desc;
    }

    public SentinelResourceTopNMacsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelResourceTopNMacsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelResourceTopNMacsRequest setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public Integer getOrderBy() {
        return this.orderBy;
    }

    public SentinelResourceTopNMacsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public SentinelResourceTopNMacsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SentinelResourceTopNMacsRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public SentinelResourceTopNMacsRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
