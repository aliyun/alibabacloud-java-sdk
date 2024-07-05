// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryWaterMarkTemplateListRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IDs of the watermark templates that you want to query. To obtain the IDs of the watermark templates, you can log on to the <strong>ApsaraVideo Media Processing (MPS) console</strong> and choose <strong>Global Settings</strong> &gt; <strong>Watermark Templates</strong> in the left-side navigation pane. You can query up to 10 watermark templates at a time. Separate multiple IDs of watermark templates with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3780bd69b2b74540bc7b1096f564****</p>
     */
    @NameInMap("WaterMarkTemplateIds")
    public String waterMarkTemplateIds;

    public static QueryWaterMarkTemplateListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWaterMarkTemplateListRequest self = new QueryWaterMarkTemplateListRequest();
        return TeaModel.build(map, self);
    }

    public QueryWaterMarkTemplateListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QueryWaterMarkTemplateListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryWaterMarkTemplateListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryWaterMarkTemplateListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryWaterMarkTemplateListRequest setWaterMarkTemplateIds(String waterMarkTemplateIds) {
        this.waterMarkTemplateIds = waterMarkTemplateIds;
        return this;
    }
    public String getWaterMarkTemplateIds() {
        return this.waterMarkTemplateIds;
    }

}
