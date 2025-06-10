// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class GetAsyncJobResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7CB9B663-3EF8-4C9C-A464-FDA2B5F1E3A4</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetAsyncJobResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncJobResultRequest self = new GetAsyncJobResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncJobResultRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
