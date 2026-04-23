// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CheckInventoryJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    public static CheckInventoryJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckInventoryJobRequest self = new CheckInventoryJobRequest();
        return TeaModel.build(map, self);
    }

    public CheckInventoryJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
