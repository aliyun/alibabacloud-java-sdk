// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class TagsInParams extends TeaModel {
    @NameInMap("Tag")
    public java.util.List<TagsInParamsTag> tag;

    public static TagsInParams build(java.util.Map<String, ?> map) throws Exception {
        TagsInParams self = new TagsInParams();
        return TeaModel.build(map, self);
    }

    public TagsInParams setTag(java.util.List<TagsInParamsTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagsInParamsTag> getTag() {
        return this.tag;
    }

    public static class TagsInParamsTag extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test-key-value</p>
         */
        @NameInMap("Value")
        public String value;

        public static TagsInParamsTag build(java.util.Map<String, ?> map) throws Exception {
            TagsInParamsTag self = new TagsInParamsTag();
            return TeaModel.build(map, self);
        }

        public TagsInParamsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagsInParamsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
