// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateModelResponseBody extends TeaModel {
    /**
     * <p>The time when the model was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-29T09:33:01Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The description of the created model.</p>
     * 
     * <strong>example:</strong>
     * <p>Model Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the API group to which the created model belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>30e792398d6c4569b04c0e53a3494381</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the created model.</p>
     * 
     * <strong>example:</strong>
     * <p>766c0b9538a04bdf974953b5576783ba</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>The name of the created model.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The URI of the created model.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://apigateway.aliyun.com/models/30e792398d6c4569b04c0e53a3494381/766c0b9538a04bdf974953b5576783ba">https://apigateway.aliyun.com/models/30e792398d6c4569b04c0e53a3494381/766c0b9538a04bdf974953b5576783ba</a></p>
     */
    @NameInMap("ModelRef")
    public String modelRef;

    /**
     * <p>The time when the model is last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-29T09:33:01Z</p>
     */
    @NameInMap("ModifiedTime")
    public String modifiedTime;

    /**
     * <p>The region to which the created model belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4173F95B-360C-460C-9F6C-4A960B904411</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The definition of the created model.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;type\&quot;:\&quot;object\&quot;,\&quot;properties\&quot;:{\&quot;id\&quot;:{\&quot;format\&quot;:\&quot;int64\&quot;,\&quot;maximum\&quot;:100,\&quot;exclusiveMaximum\&quot;:true,\&quot;type\&quot;:\&quot;integer\&quot;},\&quot;name\&quot;:{\&quot;maxLength\&quot;:10,\&quot;type\&quot;:\&quot;string\&quot;}}}</p>
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
