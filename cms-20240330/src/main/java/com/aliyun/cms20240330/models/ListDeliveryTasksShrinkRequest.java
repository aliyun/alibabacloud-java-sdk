// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDeliveryTasksShrinkRequest extends TeaModel {
    /**
     * <p>The keywords for a fuzzy search by task name or task ID. The search uses <code>LIKE</code> semantics.</p>
     * 
     * <strong>example:</strong>
     * <p>test-task</p>
     */
    @NameInMap("keyWords")
    public String keyWords;

    /**
     * <p>The number of entries to return on each page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used to retrieve the next page of results. You do not need to specify this parameter for the first request. For subsequent requests, set this parameter to the <code>nextToken</code> value that is returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>sjC5rekx93Ew7K7VcmI3wkBZBYQ-GphB2ilQu3zJCGxoZuicwyJznfo2riTjr-lq</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2bhocin5e2na</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>A list of tags.</p>
     */
    @NameInMap("tag")
    public String tagShrink;

    public static ListDeliveryTasksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryTasksShrinkRequest self = new ListDeliveryTasksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDeliveryTasksShrinkRequest setKeyWords(String keyWords) {
        this.keyWords = keyWords;
        return this;
    }
    public String getKeyWords() {
        return this.keyWords;
    }

    public ListDeliveryTasksShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDeliveryTasksShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDeliveryTasksShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListDeliveryTasksShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
