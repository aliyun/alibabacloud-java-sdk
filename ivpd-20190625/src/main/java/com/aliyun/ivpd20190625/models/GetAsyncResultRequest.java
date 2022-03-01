// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class GetAsyncResultRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    public static GetAsyncResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncResultRequest self = new GetAsyncResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncResultRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
