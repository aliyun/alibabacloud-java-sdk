// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAvatarTrainingJobRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    public static SubmitAvatarTrainingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAvatarTrainingJobRequest self = new SubmitAvatarTrainingJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAvatarTrainingJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
