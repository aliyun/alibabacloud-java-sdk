// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DeleteDeliveryHistoryJobRequest extends TeaModel {
    /**
     * <p>The ID of the historical event delivery task to be deleted.</p>
     * <br>
     * <p>You can call the [ListDeliveryHistoryJobs](~~188101~~) operation to query task IDs.</p>
     */
    @NameInMap("JobId")
    public Integer jobId;

    public static DeleteDeliveryHistoryJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeliveryHistoryJobRequest self = new DeleteDeliveryHistoryJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeliveryHistoryJobRequest setJobId(Integer jobId) {
        this.jobId = jobId;
        return this;
    }
    public Integer getJobId() {
        return this.jobId;
    }

}
