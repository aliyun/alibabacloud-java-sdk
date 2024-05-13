// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ResumeCampaignRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ResumeCampaignRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeCampaignRequest self = new ResumeCampaignRequest();
        return TeaModel.build(map, self);
    }

    public ResumeCampaignRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public ResumeCampaignRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
