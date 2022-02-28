// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetHistoricalCampaignReportRequest extends TeaModel {
    // 活动ID
    @NameInMap("CampaignId")
    public String campaignId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetHistoricalCampaignReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHistoricalCampaignReportRequest self = new GetHistoricalCampaignReportRequest();
        return TeaModel.build(map, self);
    }

    public GetHistoricalCampaignReportRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public GetHistoricalCampaignReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
