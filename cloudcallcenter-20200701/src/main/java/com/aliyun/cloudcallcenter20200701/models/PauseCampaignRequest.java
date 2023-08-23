// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class PauseCampaignRequest extends TeaModel {
    @NameInMap("CampaignId")
    public String campaignId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static PauseCampaignRequest build(java.util.Map<String, ?> map) throws Exception {
        PauseCampaignRequest self = new PauseCampaignRequest();
        return TeaModel.build(map, self);
    }

    public PauseCampaignRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public PauseCampaignRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
