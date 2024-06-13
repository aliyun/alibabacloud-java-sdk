// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateWorkerResourceStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkerId")
    public Long workerId;

    public static UpdateWorkerResourceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkerResourceStatusRequest self = new UpdateWorkerResourceStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkerResourceStatusRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public UpdateWorkerResourceStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateWorkerResourceStatusRequest setWorkerId(Long workerId) {
        this.workerId = workerId;
        return this;
    }
    public Long getWorkerId() {
        return this.workerId;
    }

}
