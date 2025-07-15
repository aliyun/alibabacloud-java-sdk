// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserTagsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6B0256B6-2442-5BEF-B8D6-A0C28A801DFC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeLiveUserTagsResponseBodyTags> tags;

    public static DescribeLiveUserTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUserTagsResponseBody self = new DescribeLiveUserTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUserTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveUserTagsResponseBody setTags(java.util.List<DescribeLiveUserTagsResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeLiveUserTagsResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class DescribeLiveUserTagsResponseBodyTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeLiveUserTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUserTagsResponseBodyTags self = new DescribeLiveUserTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUserTagsResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLiveUserTagsResponseBodyTags setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
