// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeTagsResponseBody extends TeaModel {
    // The token used to start the next query.
    // 
    // >  If not all results are returned in the first query, this parameter is returned. You can pass in the value of this parameter in the next query.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Details about the tags.
    @NameInMap("Tags")
    public java.util.List<DescribeTagsResponseBodyTags> tags;

    public static DescribeTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsResponseBody self = new DescribeTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagsResponseBody setTags(java.util.List<DescribeTagsResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeTagsResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class DescribeTagsResponseBodyTags extends TeaModel {
        // The key of the tag.
        @NameInMap("TagKey")
        public String tagKey;

        // The values of the tags.
        @NameInMap("TagValues")
        public java.util.List<String> tagValues;

        public static DescribeTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyTags self = new DescribeTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeTagsResponseBodyTags setTagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

    }

}
