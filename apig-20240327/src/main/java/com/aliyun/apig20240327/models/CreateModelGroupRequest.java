// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateModelGroupRequest extends TeaModel {
    /**
     * <p>The description of the model group. The description can be up to 1,024 UTF-16 code units in length and can be left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>Model group for service integration</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ID of the AI gateway instance to which the resource belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-d00000000000000000000</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The IDs of the actual or logical model cards within the same instance. The list can be empty and must not contain duplicate values. Model groups are not accepted as members.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("modelCardIds")
    public java.util.List<String> modelCardIds;

    /**
     * <p>The unique name within the instance. The name must be 1 to 128 UTF-8 bytes in length after trimming.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>beta-model-group</p>
     */
    @NameInMap("name")
    public String name;

    public static CreateModelGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelGroupRequest self = new CreateModelGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelGroupRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateModelGroupRequest setModelCardIds(java.util.List<String> modelCardIds) {
        this.modelCardIds = modelCardIds;
        return this;
    }
    public java.util.List<String> getModelCardIds() {
        return this.modelCardIds;
    }

    public CreateModelGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
