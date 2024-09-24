// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class RemoveTagsRequest extends TeaModel {
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
    public java.util.List<RemoveTagsRequestTag> tag;

    public static RemoveTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagsRequest self = new RemoveTagsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTagsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public RemoveTagsRequest setTag(java.util.List<RemoveTagsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<RemoveTagsRequestTag> getTag() {
        return this.tag;
    }

    public static class RemoveTagsRequestTag extends TeaModel {
        /**
         * <p>The key of each tag. Each tag that you want to remove consists of a tag key and a tag value. You can specify 1 to 10 tags at a time. The tag key cannot be empty. The tag value can be left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>keyN</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of each tag. Each tag that you want to remove consists of a tag key and a tag value. You can specify a maximum of five tags at a time. The tag key cannot be empty. The tag value can be left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>valueN</p>
         */
        @NameInMap("Value")
        public String value;

        public static RemoveTagsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            RemoveTagsRequestTag self = new RemoveTagsRequestTag();
            return TeaModel.build(map, self);
        }

        public RemoveTagsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RemoveTagsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
