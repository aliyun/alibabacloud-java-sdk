// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListTemplateRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("OrderType")
    public Long orderType;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("TagList")
    public Integer tagList;

    @NameInMap("Type")
    public String type;

    public static ListTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateRequest self = new ListTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplateRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListTemplateRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTemplateRequest setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListTemplateRequest setOrderType(Long orderType) {
        this.orderType = orderType;
        return this;
    }
    public Long getOrderType() {
        return this.orderType;
    }

    public ListTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListTemplateRequest setTagList(Integer tagList) {
        this.tagList = tagList;
        return this;
    }
    public Integer getTagList() {
        return this.tagList;
    }

    public ListTemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
