// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoSyncTaskRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the synchronization task.</p>
     */
    @NameInMap("SyncTaskId")
    public String syncTaskId;

    public static GetRepoSyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepoSyncTaskRequest self = new GetRepoSyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetRepoSyncTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRepoSyncTaskRequest setSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
        return this;
    }
    public String getSyncTaskId() {
        return this.syncTaskId;
    }

}
