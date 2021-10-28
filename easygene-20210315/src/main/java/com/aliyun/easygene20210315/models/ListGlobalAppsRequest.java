// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListGlobalAppsRequest extends TeaModel {
    // 可见范围
    @NameInMap("AppScope")
    public String appScope;

    // 分类
    @NameInMap("Category")
    public String category;

    // 是否倒序，默认倒序排列
    @NameInMap("IsReversed")
    public Boolean isReversed;

    // 区域Id
    @NameInMap("Location")
    public String location;

    // 分页数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 翻页Token用来标记当前开始读取的位置，置空表示从头开始
    @NameInMap("NextToken")
    public String nextToken;

    // 排序字段:AppName,LastModified,Used
    @NameInMap("OrderBy")
    public String orderBy;

    // 模糊搜索字段：NamesapceName  AppName  Categories AppDescription
    @NameInMap("Search")
    public String search;

    // 工具集
    @NameInMap("Toolkit")
    public String toolkit;

    public static ListGlobalAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGlobalAppsRequest self = new ListGlobalAppsRequest();
        return TeaModel.build(map, self);
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

    public ListGlobalAppsRequest setIsReversed(Boolean isReversed) {
        this.isReversed = isReversed;
        return this;
    }
    public Boolean getIsReversed() {
        return this.isReversed;
    }

    public ListGlobalAppsRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public ListGlobalAppsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGlobalAppsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGlobalAppsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListGlobalAppsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListGlobalAppsRequest setToolkit(String toolkit) {
        this.toolkit = toolkit;
        return this;
    }
    public String getToolkit() {
        return this.toolkit;
    }

}
