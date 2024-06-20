// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetRealtimeCampaignStatsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>skillgroup@ccc-test</p>
     */
    @NameInMap("QueueId")
    public String queueId;

    public static GetRealtimeCampaignStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeCampaignStatsRequest self = new GetRealtimeCampaignStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetRealtimeCampaignStatsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRealtimeCampaignStatsRequest setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }
    public String getQueueId() {
        return this.queueId;
    }

}
