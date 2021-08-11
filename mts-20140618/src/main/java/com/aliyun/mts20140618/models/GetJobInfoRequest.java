// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class GetJobInfoRequest extends TeaModel {
    @NameInMap("jobId")
    public String jobId;

    public static GetJobInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobInfoRequest self = new GetJobInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetJobInfoRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
