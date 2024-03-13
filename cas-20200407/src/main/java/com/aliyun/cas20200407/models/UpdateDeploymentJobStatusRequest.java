// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateDeploymentJobStatusRequest extends TeaModel {
    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("Status")
    public String status;

    public static UpdateDeploymentJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentJobStatusRequest self = new UpdateDeploymentJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentJobStatusRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public UpdateDeploymentJobStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
