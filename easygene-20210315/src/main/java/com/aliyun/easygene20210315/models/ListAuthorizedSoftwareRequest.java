// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListAuthorizedSoftwareRequest extends TeaModel {
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
