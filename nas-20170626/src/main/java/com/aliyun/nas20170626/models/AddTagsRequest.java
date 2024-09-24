// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class AddTagsRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0addcw****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The details about the tags.</p>
     * <p>This parameter is required.</p>
     */
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
         * <p>The key of each tag. A tag consists of a tag key and a tag value. You can add a maximum of 10 tags at a time. The tag key cannot be empty. The tag value can be left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>keyN</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of each tag. A tag consists of a tag key and a tag value. You can add a maximum of 10 tags at a time. The tag key cannot be empty. The tag value can be left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>valueN</p>
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
