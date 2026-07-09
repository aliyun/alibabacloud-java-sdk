// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDeliveryTasksRequest extends TeaModel {
    /**
     * <p>The keyword used to perform a fuzzy match by task name or task ID.</p>
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
     * <p>The pagination token. Leave this parameter empty for the first request. For subsequent requests, set this parameter to the nextToken value returned in the previous response.</p>
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
     * <p>The tags.</p>
     */
    @NameInMap("tag")
    public java.util.List<ListDeliveryTasksRequestTag> tag;

    public static ListDeliveryTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryTasksRequest self = new ListDeliveryTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListDeliveryTasksRequest setKeyWords(String keyWords) {
        this.keyWords = keyWords;
        return this;
    }
    public String getKeyWords() {
        return this.keyWords;
    }

    public ListDeliveryTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDeliveryTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDeliveryTasksRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListDeliveryTasksRequest setTag(java.util.List<ListDeliveryTasksRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListDeliveryTasksRequestTag> getTag() {
        return this.tag;
    }

    public static class ListDeliveryTasksRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("value")
        public String value;

        public static ListDeliveryTasksRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryTasksRequestTag self = new ListDeliveryTasksRequestTag();
            return TeaModel.build(map, self);
        }

        public ListDeliveryTasksRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDeliveryTasksRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
