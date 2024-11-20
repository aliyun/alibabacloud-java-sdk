// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAvatarTrainingJobRequest extends TeaModel {
    /**
     * <p>The ID of the digital human training job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
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
