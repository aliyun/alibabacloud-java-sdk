// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class AddTagsRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("Tag")
    public java.util.List<AddTagsRequestTag> tag;

    public static AddTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTagsRequest self = new AddTagsRequest();
        return TeaModel.build(map, self);
    }

    public AddTagsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public AddTagsRequest setTag(java.util.List<AddTagsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<AddTagsRequestTag> getTag() {
        return this.tag;
    }

    public static class AddTagsRequestTag extends TeaModel {
        /**
         * <p>The key of each tag. The tag includes a TagKey and TagValue. You can add a maximum of 10 tags at a time. You must specify a TagKey. You can leave a TagValue empty.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of each tag. The tag includes a TagKey and TagValue. You can add a maximum of 10 tags at a time. You must specify a TagKey. You can leave a TagValue empty.</p>
         */
        @NameInMap("Value")
        public String value;

        public static AddTagsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AddTagsRequestTag self = new AddTagsRequestTag();
            return TeaModel.build(map, self);
        }

        public AddTagsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddTagsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
