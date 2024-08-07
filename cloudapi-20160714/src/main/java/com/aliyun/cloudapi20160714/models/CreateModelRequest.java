// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateModelRequest extends TeaModel {
    /**
     * <p>The description of the model definition.</p>
     * 
     * <strong>example:</strong>
     * <p>Model Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the API group to which the model belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30e792398d6c4569b04c0e53a3494381</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the model. The name must be unique within the group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The definition of the model in JSON Schema.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;id&quot;:{&quot;format&quot;:&quot;int64&quot;,&quot;maximum&quot;:100,&quot;exclusiveMaximum&quot;:true,&quot;type&quot;:&quot;integer&quot;},&quot;name&quot;:{&quot;maxLength&quot;:10,&quot;type&quot;:&quot;string&quot;}}}</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>The object tags that match the lifecycle rule. You can specify multiple tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateModelRequestTag> tag;

    public static CreateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelRequest self = new CreateModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateModelRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public CreateModelRequest setTag(java.util.List<CreateModelRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateModelRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateModelRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateModelRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateModelRequestTag self = new CreateModelRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateModelRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateModelRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
