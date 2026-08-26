// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateWorkerResourceStatusRequest extends TeaModel {
    /**
     * <p>The deployment task ID. This ID is returned by <a href="https://help.aliyun.com/document_detail/2712234.html">CreateDeploymentJob</a>. You can also obtain it by calling <a href="https://help.aliyun.com/document_detail/2712223.html">ListDeploymentJob</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8888</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The target status. Valid values: &quot;editing&quot;, &quot;pending&quot;, &quot;success&quot;, &quot;rollback&quot;, &quot;rollback_success&quot;, &quot;rollback_error&quot;.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rollback</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The deployment task worker ID. You can obtain this ID by calling <a href="https://help.aliyun.com/document_detail/2712224.html">ListWorkerResource</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
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
