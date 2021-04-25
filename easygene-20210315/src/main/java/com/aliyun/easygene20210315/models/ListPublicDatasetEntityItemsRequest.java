// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListPublicDatasetEntityItemsRequest extends TeaModel {
    // 数据集名称
    @NameInMap("DatasetName")
    public String datasetName;

    // 实体类型
    @NameInMap("EntityType")
    public String entityType;

    // 实体名中搜索的关键字
    @NameInMap("Search")
    public String search;

    // 排序字段
    @NameInMap("OrderBy")
    public String orderBy;

    // 是否反转
    @NameInMap("IsReversed")
    public Boolean isReversed;

    // 翻页Token
    @NameInMap("NextToken")
    public String nextToken;

    // 分页数量
    @NameInMap("MaxResults")
    public Integer maxResults;

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

    public ListPublicDatasetEntityItemsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListPublicDatasetEntityItemsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListPublicDatasetEntityItemsRequest setIsReversed(Boolean isReversed) {
        this.isReversed = isReversed;
        return this;
    }
    public Boolean getIsReversed() {
        return this.isReversed;
    }

    public ListPublicDatasetEntityItemsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicDatasetEntityItemsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

}
