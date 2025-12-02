// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteApsWebhookRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-uf63i4ij56b***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the webhook to be deleted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>**<em>1</em>595*</p>
     */
    @NameInMap("WebhookId")
    public String webhookId;

    public static DeleteApsWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApsWebhookRequest self = new DeleteApsWebhookRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApsWebhookRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteApsWebhookRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteApsWebhookRequest setWebhookId(String webhookId) {
        this.webhookId = webhookId;
        return this;
    }
    public String getWebhookId() {
        return this.webhookId;
    }

}
