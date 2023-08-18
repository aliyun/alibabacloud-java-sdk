// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetCustomizedVoiceJobRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    public static GetCustomizedVoiceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomizedVoiceJobRequest self = new GetCustomizedVoiceJobRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomizedVoiceJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
