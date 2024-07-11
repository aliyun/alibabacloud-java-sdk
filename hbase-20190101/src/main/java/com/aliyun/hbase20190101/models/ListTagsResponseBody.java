// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ListTagsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>36D1BE9B-3C4A-425B-947A-69E3D77999C4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public ListTagsResponseBodyTags tags;

    public static ListTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagsResponseBody self = new ListTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagsResponseBody setTags(ListTagsResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public ListTagsResponseBodyTags getTags() {
        return this.tags;
    }

    public static class ListTagsResponseBodyTagsTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListTagsResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListTagsResponseBodyTagsTag self = new ListTagsResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public ListTagsResponseBodyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagsResponseBodyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListTagsResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ListTagsResponseBodyTagsTag> tag;

        public static ListTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            ListTagsResponseBodyTags self = new ListTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public ListTagsResponseBodyTags setTag(java.util.List<ListTagsResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListTagsResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
