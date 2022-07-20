// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaInfoJobRequest extends TeaModel {
    // 任务 id
    @NameInMap("JobId")
    public String jobId;

    public static GetMediaInfoJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaInfoJobRequest self = new GetMediaInfoJobRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaInfoJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
