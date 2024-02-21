// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetDeliveryHistoryJobRequest extends TeaModel {
    /**
     * <p>The ID of the historical event delivery task.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    public static GetDeliveryHistoryJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryHistoryJobRequest self = new GetDeliveryHistoryJobRequest();
        return TeaModel.build(map, self);
    }

    public GetDeliveryHistoryJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
