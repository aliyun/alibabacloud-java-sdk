// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListTagKeysResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tag keys.</p>
     */
    @NameInMap("TagKeys")
    public java.util.List<ListTagKeysResponseBodyTagKeys> tagKeys;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTagKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagKeysResponseBody self = new ListTagKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagKeysResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTagKeysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagKeysResponseBody setTagKeys(java.util.List<ListTagKeysResponseBodyTagKeys> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<ListTagKeysResponseBodyTagKeys> getTagKeys() {
        return this.tagKeys;
    }

    public ListTagKeysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTagKeysResponseBodyTagKeys extends TeaModel {
        /**
         * <p>The type of the tag.</p>
         * <p>Valid values: <strong>Custom</strong>, <strong>System</strong>, and <strong>All</strong>.</p>
         * <p>Default value: <strong>All</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The tag that matches all filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        public static ListTagKeysResponseBodyTagKeys build(java.util.Map<String, ?> map) throws Exception {
            ListTagKeysResponseBodyTagKeys self = new ListTagKeysResponseBodyTagKeys();
            return TeaModel.build(map, self);
        }

        public ListTagKeysResponseBodyTagKeys setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListTagKeysResponseBodyTagKeys setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

}
