// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDeliveryTasksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-task</p>
     */
    @NameInMap("keyWords")
    public String keyWords;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>sjC5rekx93Ew7K7VcmI3wkBZBYQ-GphB2ilQu3zJCGxoZuicwyJznfo2riTjr-lq</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>rg-aek2bhocin5e2na</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

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
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("key")
        public String key;

        /**
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
