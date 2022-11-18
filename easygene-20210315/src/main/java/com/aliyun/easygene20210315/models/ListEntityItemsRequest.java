// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListEntityItemsRequest extends TeaModel {
    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("IsReversed")
    public Boolean isReversed;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("Search")
    public String search;

    @NameInMap("Workspace")
    public String workspace;

    public static ListEntityItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEntityItemsRequest self = new ListEntityItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListEntityItemsRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListEntityItemsRequest setIsReversed(Boolean isReversed) {
        this.isReversed = isReversed;
        return this;
    }
    public Boolean getIsReversed() {
        return this.isReversed;
    }

    public ListEntityItemsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEntityItemsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEntityItemsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListEntityItemsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListEntityItemsRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
