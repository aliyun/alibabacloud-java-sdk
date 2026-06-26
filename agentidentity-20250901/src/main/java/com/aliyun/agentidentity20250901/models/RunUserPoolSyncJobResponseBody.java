// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class RunUserPoolSyncJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
