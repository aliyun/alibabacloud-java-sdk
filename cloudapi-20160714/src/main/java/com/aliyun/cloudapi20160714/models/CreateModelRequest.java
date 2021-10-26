// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateModelRequest extends TeaModel {
    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Schema")
    public String schema;

    @NameInMap("Description")
    public String description;

    public static CreateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelRequest self = new CreateModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateModelRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateModelRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public CreateModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
