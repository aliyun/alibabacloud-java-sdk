// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListApplicationRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public Integer nextToken;

    // 排序字段
    @NameInMap("OrderType")
    public Long orderType;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // 应用的状态
    @NameInMap("Status")
    public String status;

    public static ListApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationRequest self = new ListApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListApplicationRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationRequest setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListApplicationRequest setOrderType(Long orderType) {
        this.orderType = orderType;
        return this;
    }
    public Long getOrderType() {
        return this.orderType;
    }

    public ListApplicationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListApplicationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
