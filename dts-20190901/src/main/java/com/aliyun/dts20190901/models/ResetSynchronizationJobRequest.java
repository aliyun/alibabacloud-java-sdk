// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20190901.models;

import com.aliyun.tea.*;

public class ResetSynchronizationJobRequest extends TeaModel {
    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    public static ResetSynchronizationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetSynchronizationJobRequest self = new ResetSynchronizationJobRequest();
        return TeaModel.build(map, self);
    }

    public ResetSynchronizationJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ResetSynchronizationJobRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public ResetSynchronizationJobRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

}
