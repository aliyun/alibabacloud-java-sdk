// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class BatchEditWorkspaceQueuesBody extends TeaModel {
    /**
     * <p>The list of queues to update. Each entry independently specifies the absolute target state of a queue. Queue names must be unique within the same request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("queues")
    public java.util.List<BatchEditQueueSpec> queues;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>w-1234abcd</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static BatchEditWorkspaceQueuesBody build(java.util.Map<String, ?> map) throws Exception {
        BatchEditWorkspaceQueuesBody self = new BatchEditWorkspaceQueuesBody();
        return TeaModel.build(map, self);
    }

    public BatchEditWorkspaceQueuesBody setQueues(java.util.List<BatchEditQueueSpec> queues) {
        this.queues = queues;
        return this;
    }
    public java.util.List<BatchEditQueueSpec> getQueues() {
        return this.queues;
    }

    public BatchEditWorkspaceQueuesBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
