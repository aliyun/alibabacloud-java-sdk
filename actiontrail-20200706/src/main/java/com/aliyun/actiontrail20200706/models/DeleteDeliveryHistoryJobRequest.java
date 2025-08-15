// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DeleteDeliveryHistoryJobRequest extends TeaModel {
    /**
     * <p>The ID of the historical event delivery task to be deleted.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/188101.html">ListDeliveryHistoryJobs</a> operation to query task IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>16602</p>
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
