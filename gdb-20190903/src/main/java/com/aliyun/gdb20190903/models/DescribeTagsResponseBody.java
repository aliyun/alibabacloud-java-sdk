// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gdb20190903.models;

import com.aliyun.tea.*;

public class DescribeTagsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public DescribeTagsResponseBodyTags tags;

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

    public DescribeTagsResponseBody setTags(DescribeTagsResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeTagsResponseBodyTags getTags() {
        return this.tags;
    }

    public static class DescribeTagsResponseBodyTagsTagTagValues extends TeaModel {
        @NameInMap("TagValue")
        public java.util.List<String> tagValue;

        public static DescribeTagsResponseBodyTagsTagTagValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyTagsTagTagValues self = new DescribeTagsResponseBodyTagsTagTagValues();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyTagsTagTagValues setTagValue(java.util.List<String> tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public java.util.List<String> getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeTagsResponseBodyTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValues")
        public DescribeTagsResponseBodyTagsTagTagValues tagValues;

        public static DescribeTagsResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyTagsTag self = new DescribeTagsResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeTagsResponseBodyTagsTag setTagValues(DescribeTagsResponseBodyTagsTagTagValues tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public DescribeTagsResponseBodyTagsTagTagValues getTagValues() {
            return this.tagValues;
        }

    }

    public static class DescribeTagsResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeTagsResponseBodyTagsTag> tag;

        public static DescribeTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyTags self = new DescribeTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyTags setTag(java.util.List<DescribeTagsResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeTagsResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
