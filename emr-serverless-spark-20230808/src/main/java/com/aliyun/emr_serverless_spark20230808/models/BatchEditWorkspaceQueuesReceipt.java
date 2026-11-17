// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class BatchEditWorkspaceQueuesReceipt extends TeaModel {
    /**
     * <p>The target states of these queues are progressively written during the workflow.</p>
     */
    @NameInMap("acceptedQueues")
    public java.util.List<String> acceptedQueues;

    /**
     * <p>The current values are already equal to the target values, so no write operations are required.</p>
     */
    @NameInMap("skippedQueues")
    public java.util.List<String> skippedQueues;

    /**
     * <p>A null value indicates that all queues in this request are already in the target state and no workflow is started (idempotent no-op).</p>
     * 
     * <strong>example:</strong>
     * <p>9527</p>
     */
    @NameInMap("workflowInstanceId")
    public Long workflowInstanceId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>w-1234abcd</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static BatchEditWorkspaceQueuesReceipt build(java.util.Map<String, ?> map) throws Exception {
        BatchEditWorkspaceQueuesReceipt self = new BatchEditWorkspaceQueuesReceipt();
        return TeaModel.build(map, self);
    }

    public BatchEditWorkspaceQueuesReceipt setAcceptedQueues(java.util.List<String> acceptedQueues) {
        this.acceptedQueues = acceptedQueues;
        return this;
    }
    public java.util.List<String> getAcceptedQueues() {
        return this.acceptedQueues;
    }

    public BatchEditWorkspaceQueuesReceipt setSkippedQueues(java.util.List<String> skippedQueues) {
        this.skippedQueues = skippedQueues;
        return this;
    }
    public java.util.List<String> getSkippedQueues() {
        return this.skippedQueues;
    }

    public BatchEditWorkspaceQueuesReceipt setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    public BatchEditWorkspaceQueuesReceipt setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
