// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpdateApsWebhookShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDBClusterId</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleRegionId</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Webhook")
    public String webhookShrink;

    public static UpdateApsWebhookShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApsWebhookShrinkRequest self = new UpdateApsWebhookShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApsWebhookShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UpdateApsWebhookShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateApsWebhookShrinkRequest setWebhookShrink(String webhookShrink) {
        this.webhookShrink = webhookShrink;
        return this;
    }
    public String getWebhookShrink() {
        return this.webhookShrink;
    }

}
