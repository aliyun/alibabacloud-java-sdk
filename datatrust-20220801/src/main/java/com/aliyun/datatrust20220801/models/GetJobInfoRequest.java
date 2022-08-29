// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetJobInfoRequest extends TeaModel {
    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("JobInstanceId")
    public Long jobInstanceId;

    public static GetJobInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobInfoRequest self = new GetJobInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetJobInfoRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public GetJobInfoRequest setJobInstanceId(Long jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
        return this;
    }
    public Long getJobInstanceId() {
        return this.jobInstanceId;
    }

}
