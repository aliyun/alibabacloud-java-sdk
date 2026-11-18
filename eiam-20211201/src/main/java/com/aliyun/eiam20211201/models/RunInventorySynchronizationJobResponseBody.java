// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RunInventorySynchronizationJobResponseBody extends TeaModel {
    /**
     * <p>The synchronization job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sync_xxxxxxxxxx</p>
     */
    @NameInMap("InventorySynchronizationJobId")
    public String inventorySynchronizationJobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunInventorySynchronizationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunInventorySynchronizationJobResponseBody self = new RunInventorySynchronizationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public RunInventorySynchronizationJobResponseBody setInventorySynchronizationJobId(String inventorySynchronizationJobId) {
        this.inventorySynchronizationJobId = inventorySynchronizationJobId;
        return this;
    }
    public String getInventorySynchronizationJobId() {
        return this.inventorySynchronizationJobId;
    }

    public RunInventorySynchronizationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
