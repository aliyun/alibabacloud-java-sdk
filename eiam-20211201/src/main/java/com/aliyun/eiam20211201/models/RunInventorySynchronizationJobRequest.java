// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RunInventorySynchronizationJobRequest extends TeaModel {
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
     * <p>The ID of the synchronization target.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sync_xxxxxx</p>
     */
    @NameInMap("InventorySourceId")
    public String inventorySourceId;

    /**
     * <p>The resource types.</p>
     */
    @NameInMap("InventoryTypes")
    public java.util.List<String> inventoryTypes;

    public static RunInventorySynchronizationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        RunInventorySynchronizationJobRequest self = new RunInventorySynchronizationJobRequest();
        return TeaModel.build(map, self);
    }

    public RunInventorySynchronizationJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RunInventorySynchronizationJobRequest setInventorySourceId(String inventorySourceId) {
        this.inventorySourceId = inventorySourceId;
        return this;
    }
    public String getInventorySourceId() {
        return this.inventorySourceId;
    }

    public RunInventorySynchronizationJobRequest setInventoryTypes(java.util.List<String> inventoryTypes) {
        this.inventoryTypes = inventoryTypes;
        return this;
    }
    public java.util.List<String> getInventoryTypes() {
        return this.inventoryTypes;
    }

}
