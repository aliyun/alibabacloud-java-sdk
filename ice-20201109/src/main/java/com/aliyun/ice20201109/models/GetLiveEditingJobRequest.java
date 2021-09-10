// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveEditingJobRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    public static GetLiveEditingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveEditingJobRequest self = new GetLiveEditingJobRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveEditingJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
