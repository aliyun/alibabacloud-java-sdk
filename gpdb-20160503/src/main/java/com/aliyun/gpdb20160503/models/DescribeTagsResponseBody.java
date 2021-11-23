// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public java.util.List<DescribeTagsResponseBodyTags> tags;

    public static DescribeTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsResponseBody self = new DescribeTagsResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

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

        public DescribeTagsResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
