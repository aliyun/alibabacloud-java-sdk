// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListHostGroupsRequest extends TeaModel {
    @NameInMap("createEndTime")
    public Long createEndTime;

    @NameInMap("createStartTime")
    public Long createStartTime;

    @NameInMap("creatorAccountIds")
    public String creatorAccountIds;

    @NameInMap("ids")
    public String ids;

    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("name")
    public String name;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("pageOrder")
    public String pageOrder;

    @NameInMap("pageSort")
    public String pageSort;

    public static ListHostGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupsRequest self = new ListHostGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListHostGroupsRequest setCreateEndTime(Long createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public Long getCreateEndTime() {
        return this.createEndTime;
    }

    public ListHostGroupsRequest setCreateStartTime(Long createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }
    public Long getCreateStartTime() {
        return this.createStartTime;
    }

    public ListHostGroupsRequest setCreatorAccountIds(String creatorAccountIds) {
        this.creatorAccountIds = creatorAccountIds;
        return this;
    }
    public String getCreatorAccountIds() {
        return this.creatorAccountIds;
    }

    public ListHostGroupsRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ListHostGroupsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListHostGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListHostGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHostGroupsRequest setPageOrder(String pageOrder) {
        this.pageOrder = pageOrder;
        return this;
    }
    public String getPageOrder() {
        return this.pageOrder;
    }

    public ListHostGroupsRequest setPageSort(String pageSort) {
        this.pageSort = pageSort;
        return this;
    }
    public String getPageSort() {
        return this.pageSort;
    }

}
