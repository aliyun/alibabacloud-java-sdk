// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The keyword that is used to search for templates.</p>
     * 
     * <strong>example:</strong>
     * <p>cadt</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public Integer nextToken;

    /**
     * <p>The criterion by which the returned templates are sorted. Valid values:</p>
     * <ul>
     * <li>1: The templates are sorted by the time when they are updated.</li>
     * <li>2: The templates are sorted by the time when they are created.</li>
     * <li>3: The templates are sorted by the system.</li>
     * <li>4: The templates are sorted by the number of times that they are used.</li>
     * <li>If you specify an integer other than 1, 2, 3, and 4 or do not specify any value, the templates are sorted by the system.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrderType")
    public Long orderType;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyjt3c5om3hi</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public String tagShrink;

    /**
     * <p>The tag that you want to use to query templates.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TagList")
    @Deprecated
    public Integer tagList;

    /**
     * <p>The type of the templates to be returned. Valid values: public and private</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateShrinkRequest self = new ListTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplateShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListTemplateShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTemplateShrinkRequest setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListTemplateShrinkRequest setOrderType(Long orderType) {
        this.orderType = orderType;
        return this;
    }
    public Long getOrderType() {
        return this.orderType;
    }

    public ListTemplateShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListTemplateShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    @Deprecated
    public ListTemplateShrinkRequest setTagList(Integer tagList) {
        this.tagList = tagList;
        return this;
    }
    public Integer getTagList() {
        return this.tagList;
    }

    public ListTemplateShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
