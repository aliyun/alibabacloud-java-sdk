// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateRollbackTaskRequest extends TeaModel {
    /**
     * <p>The ID of the deployment task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>436493</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The ID of the deployment worker.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4197913</p>
     */
    @NameInMap("WorkerId")
    public Long workerId;

    public static CreateRollbackTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRollbackTaskRequest self = new CreateRollbackTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRollbackTaskRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public CreateRollbackTaskRequest setWorkerId(Long workerId) {
        this.workerId = workerId;
        return this;
    }
    public Long getWorkerId() {
        return this.workerId;
    }

}
