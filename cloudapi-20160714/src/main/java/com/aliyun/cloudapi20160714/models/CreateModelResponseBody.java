// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateModelResponseBody extends TeaModel {
    /**
     * <p>The time when the model was created.</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The description of the created model.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the API group to which the created model belongs.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the created model.</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>The name of the created model.</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The URI of the created model.</p>
     */
    @NameInMap("ModelRef")
    public String modelRef;

    /**
     * <p>The time when the model is last modified.</p>
     */
    @NameInMap("ModifiedTime")
    public String modifiedTime;

    /**
     * <p>The region to which the created model belongs.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The definition of the created model.</p>
     */
    @NameInMap("Schema")
    public String schema;

    public static CreateModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelResponseBody self = new CreateModelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
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

    public CreateModelResponseBody setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CreateModelResponseBody setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateModelResponseBody setModelRef(String modelRef) {
        this.modelRef = modelRef;
        return this;
    }
    public String getModelRef() {
        return this.modelRef;
    }

    public CreateModelResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public CreateModelResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateModelResponseBody setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

}
