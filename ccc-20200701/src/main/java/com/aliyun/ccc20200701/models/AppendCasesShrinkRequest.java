// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AppendCasesShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>78cf6864-9a22-4ea8-a59d-5adc2d747b0e</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("body")
    public String bodyShrink;

    public static AppendCasesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AppendCasesShrinkRequest self = new AppendCasesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AppendCasesShrinkRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public AppendCasesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AppendCasesShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
