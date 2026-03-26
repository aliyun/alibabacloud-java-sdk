// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ResumeYikeStoryboardJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static ResumeYikeStoryboardJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeYikeStoryboardJobRequest self = new ResumeYikeStoryboardJobRequest();
        return TeaModel.build(map, self);
    }

    public ResumeYikeStoryboardJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
