// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyModelRequest extends TeaModel {
    /**
     * <p>The description of the new model definition.</p>
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
     * <p>The name of the model.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The new name of the model.</p>
     * 
     * <strong>example:</strong>
     * <p>NewTest</p>
     */
    @NameInMap("NewModelName")
    public String newModelName;

    /**
     * <p>The new definition of the model.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;type\&quot;:\&quot;object\&quot;,\&quot;properties\&quot;:{\&quot;id\&quot;:{\&quot;format\&quot;:\&quot;int64\&quot;,\&quot;maximum\&quot;:100,\&quot;exclusiveMaximum\&quot;:true,\&quot;type\&quot;:\&quot;integer\&quot;},\&quot;name\&quot;:{\&quot;maxLength\&quot;:10,\&quot;type\&quot;:\&quot;string\&quot;}}}</p>
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
