// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListResourceTagsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4162a6af-bc99-40b3-a552-89dcc8aaf7c8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tags of the CMK.</p>
     */
    @NameInMap("Tags")
    public ListResourceTagsResponseBodyTags tags;

    public static ListResourceTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTagsResponseBody self = new ListResourceTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceTagsResponseBody setTags(ListResourceTagsResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public ListResourceTagsResponseBodyTags getTags() {
        return this.tags;
    }

    public static class ListResourceTagsResponseBodyTagsTag extends TeaModel {
        /**
         * <p>The globally unique ID of the CMK.</p>
         * 
         * <strong>example:</strong>
         * <p>33caea95-c3e5-4b3e-a9c6-cec76e4e****</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Project</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListResourceTagsResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTagsResponseBodyTagsTag self = new ListResourceTagsResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public ListResourceTagsResponseBodyTagsTag setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public ListResourceTagsResponseBodyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListResourceTagsResponseBodyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListResourceTagsResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ListResourceTagsResponseBodyTagsTag> tag;

        public static ListResourceTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTagsResponseBodyTags self = new ListResourceTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public ListResourceTagsResponseBodyTags setTag(java.util.List<ListResourceTagsResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListResourceTagsResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
