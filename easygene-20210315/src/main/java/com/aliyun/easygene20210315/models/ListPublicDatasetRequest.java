// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListPublicDatasetRequest extends TeaModel {
    // 排序是否反转
    @NameInMap("IsReversed")
    public Boolean isReversed;

    // 分页数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 翻页Token用来标记当前开始读取的位置，置空表示从头开始
    @NameInMap("NextToken")
    public String nextToken;

    // 排序字段
    @NameInMap("OrderBy")
    public String orderBy;

    // 名称、描述中搜索的关键字
    @NameInMap("Search")
    public String search;

    // 公共数据集标签名
    @NameInMap("Tag")
    public String tag;

    public static ListPublicDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublicDatasetRequest self = new ListPublicDatasetRequest();
        return TeaModel.build(map, self);
    }

    public ListPublicDatasetRequest setIsReversed(Boolean isReversed) {
        this.isReversed = isReversed;
        return this;
    }
    public Boolean getIsReversed() {
        return this.isReversed;
    }

    public ListPublicDatasetRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicDatasetRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicDatasetRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListPublicDatasetRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListPublicDatasetRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
