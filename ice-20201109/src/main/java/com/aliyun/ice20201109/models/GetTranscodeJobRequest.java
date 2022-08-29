// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetTranscodeJobRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    public static GetTranscodeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeJobRequest self = new GetTranscodeJobRequest();
        return TeaModel.build(map, self);
    }

    public GetTranscodeJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
