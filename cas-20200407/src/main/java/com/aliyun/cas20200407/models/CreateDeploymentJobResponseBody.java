// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateDeploymentJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDeploymentJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentJobResponseBody self = new CreateDeploymentJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentJobResponseBody setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public CreateDeploymentJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
