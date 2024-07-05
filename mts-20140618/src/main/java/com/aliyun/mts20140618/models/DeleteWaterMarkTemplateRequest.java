// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteWaterMarkTemplateRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the watermark template that you want to delete. To obtain the template ID, you can log on to the <strong>ApsaraVideo Media Processing (MPS) console</strong> and choose <strong>Global Settings</strong> &gt; <strong>Watermark Templates</strong> in the left-side navigation pane.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3780bd69b2b74540bc7b1096f564****</p>
     */
    @NameInMap("WaterMarkTemplateId")
    public String waterMarkTemplateId;

    public static DeleteWaterMarkTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWaterMarkTemplateRequest self = new DeleteWaterMarkTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWaterMarkTemplateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteWaterMarkTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteWaterMarkTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteWaterMarkTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteWaterMarkTemplateRequest setWaterMarkTemplateId(String waterMarkTemplateId) {
        this.waterMarkTemplateId = waterMarkTemplateId;
        return this;
    }
    public String getWaterMarkTemplateId() {
        return this.waterMarkTemplateId;
    }

}
