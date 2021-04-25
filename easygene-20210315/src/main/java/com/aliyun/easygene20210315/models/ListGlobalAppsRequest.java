// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListGlobalAppsRequest extends TeaModel {
    // 模糊查询字段：NamesapceName  AppName  Categories AppDescription
    @NameInMap("Search")
    public String search;

    // 排序
    @NameInMap("OrderBy")
    public String orderBy;

    // 是否倒序，默认倒序排列
    @NameInMap("IsReversed")
    public Boolean isReversed;

    // 用来标记当前开始读取的位置，置空表示从头开始。
    @NameInMap("NextToken")
    public String nextToken;

    // 一批返回的最大数据量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 可见范围
    @NameInMap("AppScope")
    public String appScope;

    // 分类
    @NameInMap("Category")
    public String category;

    // 工具集
    @NameInMap("Toolkit")
    public String toolkit;

    // 区域Id
    @NameInMap("Region")
    public String region;

    public static ListGlobalAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGlobalAppsRequest self = new ListGlobalAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListGlobalAppsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListGlobalAppsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListGlobalAppsRequest setIsReversed(Boolean isReversed) {
        this.isReversed = isReversed;
        return this;
    }
    public Boolean getIsReversed() {
        return this.isReversed;
    }

    public ListGlobalAppsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGlobalAppsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGlobalAppsRequest setAppScope(String appScope) {
        this.appScope = appScope;
        return this;
    }
    public String getAppScope() {
        return this.appScope;
    }

    public ListGlobalAppsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListGlobalAppsRequest setToolkit(String toolkit) {
        this.toolkit = toolkit;
        return this;
    }
    public String getToolkit() {
        return this.toolkit;
    }

    public ListGlobalAppsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
