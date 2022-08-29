// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetHistoryFlTrainingJobInstanceByJobIdRequest extends TeaModel {
    @NameInMap("JobId")
    public Long jobId;

    public static GetHistoryFlTrainingJobInstanceByJobIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryFlTrainingJobInstanceByJobIdRequest self = new GetHistoryFlTrainingJobInstanceByJobIdRequest();
        return TeaModel.build(map, self);
    }

    public GetHistoryFlTrainingJobInstanceByJobIdRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
