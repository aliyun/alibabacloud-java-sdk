// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetAivppAlgoJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5854bfa6-f002-43c2-8e1d-e9b2c28f9384</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetAivppAlgoJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAivppAlgoJobRequest self = new GetAivppAlgoJobRequest();
        return TeaModel.build(map, self);
    }

    public GetAivppAlgoJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
