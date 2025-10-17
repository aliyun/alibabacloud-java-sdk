// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsWebhookShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ResultExport</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Webhook")
    public String webhookShrink;

    public static CreateApsWebhookShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApsWebhookShrinkRequest self = new CreateApsWebhookShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateApsWebhookShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateApsWebhookShrinkRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public CreateApsWebhookShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApsWebhookShrinkRequest setWebhookShrink(String webhookShrink) {
        this.webhookShrink = webhookShrink;
        return this;
    }
    public String getWebhookShrink() {
        return this.webhookShrink;
    }

}
