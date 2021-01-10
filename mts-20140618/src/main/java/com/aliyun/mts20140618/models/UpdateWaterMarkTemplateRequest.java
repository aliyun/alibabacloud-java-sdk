// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateWaterMarkTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("WaterMarkTemplateId")
    public String waterMarkTemplateId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Config")
    public String config;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static UpdateWaterMarkTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaterMarkTemplateRequest self = new UpdateWaterMarkTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWaterMarkTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateWaterMarkTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateWaterMarkTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateWaterMarkTemplateRequest setWaterMarkTemplateId(String waterMarkTemplateId) {
        this.waterMarkTemplateId = waterMarkTemplateId;
        return this;
    }
    public String getWaterMarkTemplateId() {
        return this.waterMarkTemplateId;
    }

    public UpdateWaterMarkTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWaterMarkTemplateRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateWaterMarkTemplateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
