// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class GetAsyncJobResultRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Async")
    public String async;

    public static GetAsyncJobResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncJobResultRequest self = new GetAsyncJobResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncJobResultRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetAsyncJobResultRequest setAsync(String async) {
        this.async = async;
        return this;
    }
    public String getAsync() {
        return this.async;
    }

}
