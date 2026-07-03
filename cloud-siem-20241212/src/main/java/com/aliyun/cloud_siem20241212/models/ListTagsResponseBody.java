// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListTagsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of results to return when using NextToken-based pagination. Valid values: 1 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query. Leave this parameter empty for the first query or if no more results exist. If a next query is available, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The entity tags. The value is a JSON array string in the following format:</p>
     * <p><code>&quot;[{&quot;tagKey1&quot;:&quot;tagValue1&quot;},{&quot;tagKey2&quot;:&quot;tagValue2&quot;}]&quot;</code></p>
     */
    @NameInMap("Tags")
    public java.util.List<ListTagsResponseBodyTags> tags;

    public static ListTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagsResponseBody self = new ListTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTagsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagsResponseBody setTags(java.util.List<ListTagsResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListTagsResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class ListTagsResponseBodyTags extends TeaModel {
        /**
         * <p>The number of quick queries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The key of the tag to query. You can specify multiple keys. N is a positive integer.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static ListTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            ListTagsResponseBodyTags self = new ListTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public ListTagsResponseBodyTags setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListTagsResponseBodyTags setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
