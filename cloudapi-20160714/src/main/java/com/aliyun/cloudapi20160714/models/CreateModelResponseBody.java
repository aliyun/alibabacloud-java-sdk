// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateModelResponseBody extends TeaModel {
    @NameInMap("ModifiedTime")
    public String modifiedTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Schema")
    public String schema;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ModelRef")
    public String modelRef;

    public static CreateModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelResponseBody self = new CreateModelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public CreateModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateModelResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateModelResponseBody setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public CreateModelResponseBody setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateModelResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public CreateModelResponseBody setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CreateModelResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateModelResponseBody setModelRef(String modelRef) {
        this.modelRef = modelRef;
        return this;
    }
    public String getModelRef() {
        return this.modelRef;
    }

}
