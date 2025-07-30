// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetSynchronizationJobRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the synchronization job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sync_0000347vjovtcf41li0fgsd98gn24q9njxxxxx</p>
     */
    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    public static GetSynchronizationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSynchronizationJobRequest self = new GetSynchronizationJobRequest();
        return TeaModel.build(map, self);
    }

    public GetSynchronizationJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSynchronizationJobRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

}
