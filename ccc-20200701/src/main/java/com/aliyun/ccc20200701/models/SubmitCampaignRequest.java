// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SubmitCampaignRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6badb397-a8b5-40b6-21019d382a09</p>
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

    public static SubmitCampaignRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCampaignRequest self = new SubmitCampaignRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCampaignRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public SubmitCampaignRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
