// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateWorkerResourceStatusRequest extends TeaModel {
    /**
     * <p>The ID of the deployment task. You can call the <a href="https://help.aliyun.com/document_detail/2712234.html">CreateDeploymentJob</a> operation to obtain the ID of a deployment task from the <strong>JobId</strong> parameter. You can also call the <a href="https://help.aliyun.com/document_detail/2712223.html">ListDeploymentJob</a> operation to obtain the ID of a deployment task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8888</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The desired status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>rollback</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rollback</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the worker task. You can call the <a href="https://help.aliyun.com/document_detail/2712224.html">ListWorkerResource</a> operation to obtain the ID of a worker task.</p>
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
