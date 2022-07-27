// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListVariableGroupsRequest extends TeaModel {
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("pageOrder")
    public String pageOrder;

    @NameInMap("pageSort")
    public String pageSort;

    public static ListVariableGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVariableGroupsRequest self = new ListVariableGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListVariableGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVariableGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVariableGroupsRequest setPageOrder(String pageOrder) {
        this.pageOrder = pageOrder;
        return this;
    }
    public String getPageOrder() {
        return this.pageOrder;
    }

    public ListVariableGroupsRequest setPageSort(String pageSort) {
        this.pageSort = pageSort;
        return this;
    }
    public String getPageSort() {
        return this.pageSort;
    }

}
