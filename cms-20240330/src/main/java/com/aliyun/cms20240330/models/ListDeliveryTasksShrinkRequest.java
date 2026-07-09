// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDeliveryTasksShrinkRequest extends TeaModel {
    /**
     * <p>Fuzzy search by task name or task ID (LIKE semantics).</p>
     * 
     * <strong>example:</strong>
     * <p>test-task</p>
     */
    @NameInMap("keyWords")
    public String keyWords;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Leave this parameter empty for the first request. For subsequent requests, pass the nextToken value returned in the previous response.</p>
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
     * <p>The list of tags.</p>
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
