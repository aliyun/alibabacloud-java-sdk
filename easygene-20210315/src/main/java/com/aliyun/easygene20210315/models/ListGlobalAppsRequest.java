// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListGlobalAppsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OpenAccess</p>
     */
    @NameInMap("AppScope")
    public String appScope;

    /**
     * <strong>example:</strong>
     * <p>群体变异</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsReversed")
    public Boolean isReversed;

    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>0f2cc944-67db-4fb1-bb10-f136cda74bda</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>AppName, LastModified, Used</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>群体变异</p>
     */
    @NameInMap("Search")
    public String search;

    /**
     * <strong>example:</strong>
     * <p>Sentieon</p>
     */
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
