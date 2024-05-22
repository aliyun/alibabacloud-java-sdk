// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveTranscodeJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static DeleteLiveTranscodeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveTranscodeJobRequest self = new DeleteLiveTranscodeJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveTranscodeJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
