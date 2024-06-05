// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelRecycleBinJobRequest extends TeaModel {
    /**
     * <p>The job ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static CancelRecycleBinJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelRecycleBinJobRequest self = new CancelRecycleBinJobRequest();
        return TeaModel.build(map, self);
    }

    public CancelRecycleBinJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
