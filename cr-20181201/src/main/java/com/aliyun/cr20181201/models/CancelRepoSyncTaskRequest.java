// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CancelRepoSyncTaskRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xkx6vujuhay0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the replication task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rst-biu4u4pm4it5****</p>
     */
    @NameInMap("SyncTaskId")
    public String syncTaskId;

    public static CancelRepoSyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelRepoSyncTaskRequest self = new CancelRepoSyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelRepoSyncTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CancelRepoSyncTaskRequest setSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
        return this;
    }
    public String getSyncTaskId() {
        return this.syncTaskId;
    }

}
