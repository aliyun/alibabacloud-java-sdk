// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateWaterMarkTemplateRequest extends TeaModel {
    /**
     * <p>The updated configuration of the watermark template. The value is a JSON object. For more information, see [Watermark template configuration](~~29253~~).</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The new name of the watermark template. The value can contain letters and digits and can be up to 128 bytes in size.</p>
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

    /**
     * <p>The ID of the watermark template that you want to update. To obtain the ID of the watermark template, you can log on to the **ApsaraVideo Media Processing (MPS) console** and choose **Global Settings** > **Watermark Templates** in the left-side navigation pane.</p>
     */
    @NameInMap("WaterMarkTemplateId")
    public String waterMarkTemplateId;

    public static UpdateWaterMarkTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaterMarkTemplateRequest self = new UpdateWaterMarkTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWaterMarkTemplateRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateWaterMarkTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWaterMarkTemplateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
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

}
