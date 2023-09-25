// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class SuspendSynchronizationJobRequest extends TeaModel {
    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    public static SuspendSynchronizationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendSynchronizationJobRequest self = new SuspendSynchronizationJobRequest();
        return TeaModel.build(map, self);
    }

    public SuspendSynchronizationJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SuspendSynchronizationJobRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

}
