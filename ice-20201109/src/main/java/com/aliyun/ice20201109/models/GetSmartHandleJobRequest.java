// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSmartHandleJobRequest extends TeaModel {
    // 任务Id
    @NameInMap("JobId")
    public String jobId;

    public static GetSmartHandleJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSmartHandleJobRequest self = new GetSmartHandleJobRequest();
        return TeaModel.build(map, self);
    }

    public GetSmartHandleJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
