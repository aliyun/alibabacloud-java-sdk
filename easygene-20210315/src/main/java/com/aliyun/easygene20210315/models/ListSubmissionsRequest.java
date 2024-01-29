// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListSubmissionsRequest extends TeaModel {
    @NameInMap("IsReversed")
    public Boolean isReversed;

    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Next Token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("Search")
    public String search;

    @NameInMap("Status")
    public String status;

    @NameInMap("Workspace")
    public String workspace;

    public static ListSubmissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubmissionsRequest self = new ListSubmissionsRequest();
        return TeaModel.build(map, self);
    }

    public ListSubmissionsRequest setIsReversed(Boolean isReversed) {
        this.isReversed = isReversed;
        return this;
    }
    public Boolean getIsReversed() {
        return this.isReversed;
    }

    public ListSubmissionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSubmissionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSubmissionsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListSubmissionsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListSubmissionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListSubmissionsRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
