// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class StartSynchronizationJobRequest extends TeaModel {
    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    public static StartSynchronizationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSynchronizationJobRequest self = new StartSynchronizationJobRequest();
        return TeaModel.build(map, self);
    }

    public StartSynchronizationJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public StartSynchronizationJobRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

}
