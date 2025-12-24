// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GenerateDownloadUrlForSynchronizationJobRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>同步任务ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sync_000036q9p3jd5s18boeo2dvmmanu2086vxxxx</p>
     */
    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    public static GenerateDownloadUrlForSynchronizationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDownloadUrlForSynchronizationJobRequest self = new GenerateDownloadUrlForSynchronizationJobRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDownloadUrlForSynchronizationJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GenerateDownloadUrlForSynchronizationJobRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

}
