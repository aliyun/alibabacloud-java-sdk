// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListHostGroupsRequest extends TeaModel {
    // 主机组id，多个逗号分割
    @NameInMap("ids")
    public String ids;

    // 主机组创建时间
    @NameInMap("createStartTime")
    public Long createStartTime;

    // 主机组结束时间
    @NameInMap("createEndTime")
    public Long createEndTime;

    // 主机组名称
    @NameInMap("name")
    public String name;

    // 创建阿里云账号id，多个逗号分割
    @NameInMap("creatorAccountIds")
    public String creatorAccountIds;

    // 分页token
    @NameInMap("nextToken")
    public String nextToken;

    // 结果返回个数
    @NameInMap("maxResults")
    public Long maxResults;

    // 排序条件ID
    @NameInMap("pageSort")
    public String pageSort;

    // 排序顺序
    @NameInMap("pageOrder")
    public String pageOrder;

    public static ListHostGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupsRequest self = new ListHostGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListHostGroupsRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ListHostGroupsRequest setCreateStartTime(Long createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }
    public Long getCreateStartTime() {
        return this.createStartTime;
    }

    public ListHostGroupsRequest setCreateEndTime(Long createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public Long getCreateEndTime() {
        return this.createEndTime;
    }

    public ListHostGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListHostGroupsRequest setCreatorAccountIds(String creatorAccountIds) {
        this.creatorAccountIds = creatorAccountIds;
        return this;
    }
    public String getCreatorAccountIds() {
        return this.creatorAccountIds;
    }

    public ListHostGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHostGroupsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListHostGroupsRequest setPageSort(String pageSort) {
        this.pageSort = pageSort;
        return this;
    }
    public String getPageSort() {
        return this.pageSort;
    }

    public ListHostGroupsRequest setPageOrder(String pageOrder) {
        this.pageOrder = pageOrder;
        return this;
    }
    public String getPageOrder() {
        return this.pageOrder;
    }

}
