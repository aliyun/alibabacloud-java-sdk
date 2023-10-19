// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The tag of objects that match the lifecycle rule. You can specify multiple tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DeleteInstanceRequestTag> tag;

    public static DeleteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceRequest self = new DeleteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteInstanceRequest setTag(java.util.List<DeleteInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DeleteInstanceRequestTag> getTag() {
        return this.tag;
    }

    public static class DeleteInstanceRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DeleteInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DeleteInstanceRequestTag self = new DeleteInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public DeleteInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DeleteInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
