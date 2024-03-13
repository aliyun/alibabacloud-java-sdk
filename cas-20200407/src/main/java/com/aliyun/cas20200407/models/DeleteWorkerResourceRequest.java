// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteWorkerResourceRequest extends TeaModel {
    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("WorkerId")
    public Long workerId;

    public static DeleteWorkerResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkerResourceRequest self = new DeleteWorkerResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkerResourceRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public DeleteWorkerResourceRequest setWorkerId(Long workerId) {
        this.workerId = workerId;
        return this;
    }
    public Long getWorkerId() {
        return this.workerId;
    }

}
