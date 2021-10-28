// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListEntitiesRequest extends TeaModel {
    // 是否逆序
    @NameInMap("IsReversed")
    public Boolean isReversed;

    // 最大返回数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 起始查询位置
    @NameInMap("NextToken")
    public String nextToken;

    // 排序条件
    @NameInMap("OrderBy")
    public String orderBy;

    // 工作空间
    @NameInMap("Workspace")
    public String workspace;

    public static ListEntitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesRequest self = new ListEntitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListEntitiesRequest setIsReversed(Boolean isReversed) {
        this.isReversed = isReversed;
        return this;
    }
    public Boolean getIsReversed() {
        return this.isReversed;
    }

    public ListEntitiesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEntitiesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEntitiesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListEntitiesRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
