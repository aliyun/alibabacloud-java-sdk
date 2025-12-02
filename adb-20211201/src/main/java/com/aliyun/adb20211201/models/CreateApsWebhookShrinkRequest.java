// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsWebhookShrinkRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The type of the task. Valid value: Task type. SLS or OSS Export Task: ResultExport.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ResultExport</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The ID of the region in which to create the dedicated block storage cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The array of webhooks.</p>
     */
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
