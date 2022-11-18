// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListPublicDatasetEntityItemsRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("EntityType")
    public String entityType;

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

    public static ListPublicDatasetEntityItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublicDatasetEntityItemsRequest self = new ListPublicDatasetEntityItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListPublicDatasetEntityItemsRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public ListPublicDatasetEntityItemsRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListPublicDatasetEntityItemsRequest setIsReversed(Boolean isReversed) {
        this.isReversed = isReversed;
        return this;
    }
    public Boolean getIsReversed() {
        return this.isReversed;
    }

    public ListPublicDatasetEntityItemsRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public ListPublicDatasetEntityItemsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicDatasetEntityItemsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicDatasetEntityItemsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListPublicDatasetEntityItemsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

}
