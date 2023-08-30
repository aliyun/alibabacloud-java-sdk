// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20190901.models;

import com.aliyun.tea.*;

public class DeleteSynchronizationJobRequest extends TeaModel {
    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    public static DeleteSynchronizationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSynchronizationJobRequest self = new DeleteSynchronizationJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSynchronizationJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DeleteSynchronizationJobRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

}
