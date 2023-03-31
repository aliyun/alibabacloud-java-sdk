// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListTemplateRequest extends TeaModel {
    /**
     * <p>The keyword that is used to search for templates.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("NextToken")
    public Integer nextToken;

    /**
     * <p>The criterion by which the templates are sorted. Valid values:</p>
     * <br>
     * <p>*   1: modification time</p>
     * <p>*   2: creation time</p>
     */
    @NameInMap("OrderType")
    public Long orderType;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tag of the template.</p>
     */
    @NameInMap("TagList")
    public Integer tagList;

    /**
     * <p>The type of the template.</p>
     */
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
