// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetBatchMediaProducingJobRequest extends TeaModel {
    /**
     * <p>The ID of the quick video production job.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>b4549d46c88681030f6e</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetBatchMediaProducingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBatchMediaProducingJobRequest self = new GetBatchMediaProducingJobRequest();
        return TeaModel.build(map, self);
    }

    public GetBatchMediaProducingJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
