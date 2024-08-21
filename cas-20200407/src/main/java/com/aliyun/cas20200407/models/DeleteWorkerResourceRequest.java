// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteWorkerResourceRequest extends TeaModel {
    /**
     * <p>The ID of the deployment task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8888</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The ID of the worker for the deployment task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
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
