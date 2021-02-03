// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSmartHandleJobRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("WithAiResult")
    public String withAiResult;

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

    public GetSmartHandleJobRequest setWithAiResult(String withAiResult) {
        this.withAiResult = withAiResult;
        return this;
    }
    public String getWithAiResult() {
        return this.withAiResult;
    }

}
