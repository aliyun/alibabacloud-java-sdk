// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListPublicDatasetTagsRequest extends TeaModel {
    // 标签名中搜索的关键字
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

    public static ListPublicDatasetTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublicDatasetTagsRequest self = new ListPublicDatasetTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListPublicDatasetTagsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListPublicDatasetTagsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListPublicDatasetTagsRequest setIsReversed(Boolean isReversed) {
        this.isReversed = isReversed;
        return this;
    }
    public Boolean getIsReversed() {
        return this.isReversed;
    }

    public ListPublicDatasetTagsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicDatasetTagsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

}
