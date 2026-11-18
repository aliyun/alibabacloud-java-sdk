// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInventorySynchronizationJobRequest extends TeaModel {
    /**
     * <p>The ID of the IDaaS EIAM instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the synchronization task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sync_xxxxxxx</p>
     */
    @NameInMap("InventorySynchronizationJobId")
    public String inventorySynchronizationJobId;

    public static GetInventorySynchronizationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInventorySynchronizationJobRequest self = new GetInventorySynchronizationJobRequest();
        return TeaModel.build(map, self);
    }

    public GetInventorySynchronizationJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInventorySynchronizationJobRequest setInventorySynchronizationJobId(String inventorySynchronizationJobId) {
        this.inventorySynchronizationJobId = inventorySynchronizationJobId;
        return this;
    }
    public String getInventorySynchronizationJobId() {
        return this.inventorySynchronizationJobId;
    }

}
