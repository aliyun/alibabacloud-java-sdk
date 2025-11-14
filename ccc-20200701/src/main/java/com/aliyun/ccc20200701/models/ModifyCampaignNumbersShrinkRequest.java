// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyCampaignNumbersShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6badb397-<strong><strong>-</strong></strong>-21019d382a09</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <strong>example:</strong>
     * <p>3971876649-<strong><strong>-</strong></strong>-098763a382a09</p>
     */
    @NameInMap("InstGroupId")
    public String instGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NumberList")
    public String numberListShrink;

    public static ModifyCampaignNumbersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCampaignNumbersShrinkRequest self = new ModifyCampaignNumbersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCampaignNumbersShrinkRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public ModifyCampaignNumbersShrinkRequest setInstGroupId(String instGroupId) {
        this.instGroupId = instGroupId;
        return this;
    }
    public String getInstGroupId() {
        return this.instGroupId;
    }

    public ModifyCampaignNumbersShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyCampaignNumbersShrinkRequest setNumberListShrink(String numberListShrink) {
        this.numberListShrink = numberListShrink;
        return this;
    }
    public String getNumberListShrink() {
        return this.numberListShrink;
    }

}
