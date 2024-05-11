// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyModelRequest extends TeaModel {
    /**
     * <p>The description of the new model definition.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the API group to which the model belongs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the model.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The new name of the model.</p>
     */
    @NameInMap("NewModelName")
    public String newModelName;

    /**
     * <p>The new definition of the model.</p>
     */
    @NameInMap("Schema")
    public String schema;

    public static ModifyModelRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyModelRequest self = new ModifyModelRequest();
        return TeaModel.build(map, self);
    }

    public ModifyModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyModelRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ModifyModelRequest setNewModelName(String newModelName) {
        this.newModelName = newModelName;
        return this;
    }
    public String getNewModelName() {
        return this.newModelName;
    }

    public ModifyModelRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

}
