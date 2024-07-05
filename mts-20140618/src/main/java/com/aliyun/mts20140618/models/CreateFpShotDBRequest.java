// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CreateFpShotDBRequest extends TeaModel {
    /**
     * <p>The configurations of the media fingerprint library. By default, this parameter is left empty. You can customize the configurations based on your business requirements. The value must be a string in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The description of the media fingerprint library.</p>
     * 
     * <strong>example:</strong>
     * <p>The library is a text fingerprint library.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The model ID of the media fingerprint library. To create a text fingerprint library, set the parameter to <strong>11</strong>. To create a video fingerprint library, set the parameter to <strong>12</strong>. To create an audio fingerprint library, set the parameter to <strong>13</strong>. To create an image fingerprint library, set the parameter to <strong>14</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("ModelId")
    public Integer modelId;

    /**
     * <p>The name of the media fingerprint library.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example name</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateFpShotDBRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFpShotDBRequest self = new CreateFpShotDBRequest();
        return TeaModel.build(map, self);
    }

    public CreateFpShotDBRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateFpShotDBRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFpShotDBRequest setModelId(Integer modelId) {
        this.modelId = modelId;
        return this;
    }
    public Integer getModelId() {
        return this.modelId;
    }

    public CreateFpShotDBRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFpShotDBRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateFpShotDBRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateFpShotDBRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateFpShotDBRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
