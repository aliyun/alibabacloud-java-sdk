// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class RunUserPoolSyncJobResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the created synchronization task. You can call GetUserPoolSyncJob to query the execution details of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>sync_job_xxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    public static RunUserPoolSyncJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunUserPoolSyncJobResponseBody self = new RunUserPoolSyncJobResponseBody();
        return TeaModel.build(map, self);
    }

    public RunUserPoolSyncJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunUserPoolSyncJobResponseBody setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

}
