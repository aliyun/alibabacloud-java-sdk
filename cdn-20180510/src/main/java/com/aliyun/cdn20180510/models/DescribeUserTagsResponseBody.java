// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserTagsResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The list of tags returned.
    @NameInMap("Tags")
    public java.util.List<DescribeUserTagsResponseBodyTags> tags;

    public static DescribeUserTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTagsResponseBody self = new DescribeUserTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserTagsResponseBody setTags(java.util.List<DescribeUserTagsResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeUserTagsResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class DescribeUserTagsResponseBodyTags extends TeaModel {
        // The key of the tag.
        @NameInMap("Key")
        public String key;

        // The list of tag value.
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeUserTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserTagsResponseBodyTags self = new DescribeUserTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeUserTagsResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeUserTagsResponseBodyTags setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
