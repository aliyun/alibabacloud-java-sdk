// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteCustomizedVoiceJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static DeleteCustomizedVoiceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizedVoiceJobRequest self = new DeleteCustomizedVoiceJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizedVoiceJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
