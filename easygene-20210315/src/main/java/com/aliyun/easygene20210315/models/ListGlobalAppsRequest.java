// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListGlobalAppsRequest extends TeaModel {
    @NameInMap("AppScope")
    public String appScope;

    @NameInMap("Category")
    public String category;

    @NameInMap("IsReversed")
    public Boolean isReversed;

    @NameInMap("Location")
    public String location;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("Search")
    public String search;

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
