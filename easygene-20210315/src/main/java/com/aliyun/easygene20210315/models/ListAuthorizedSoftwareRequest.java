// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListAuthorizedSoftwareRequest extends TeaModel {
    // 是否反转
    @NameInMap("IsReversed")
    public Boolean isReversed;

    // 区域
    @NameInMap("Location")
    public String location;

    // 分页数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 翻页Token用来标记当前开始读取的位置，置空表示从头开始
    @NameInMap("NextToken")
    public String nextToken;

    // 排序字段
    @NameInMap("OrderBy")
    public String orderBy;

    // 软件名称、软件长名称中搜索的关键字
    @NameInMap("Search")
    public String search;

    public static ListAuthorizedSoftwareRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedSoftwareRequest self = new ListAuthorizedSoftwareRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedSoftwareRequest setIsReversed(Boolean isReversed) {
        this.isReversed = isReversed;
        return this;
    }
    public Boolean getIsReversed() {
        return this.isReversed;
    }

    public ListAuthorizedSoftwareRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public ListAuthorizedSoftwareRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAuthorizedSoftwareRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuthorizedSoftwareRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListAuthorizedSoftwareRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

}
