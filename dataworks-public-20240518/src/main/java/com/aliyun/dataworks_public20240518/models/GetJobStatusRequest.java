// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetJobStatusRequest extends TeaModel {
    /**
     * <p>The ID of the asynchronous task that is generated after you call an asynchronous operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>70ecdaec-bf21-4c11-8ecb-4f77453ceea8</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobStatusRequest self = new GetJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetJobStatusRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
