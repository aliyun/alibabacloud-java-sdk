// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20190901.models;

import com.aliyun.tea.*;

public class ModifySynchronizationObjectRequest extends TeaModel {
    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    @NameInMap("SynchronizationObjects")
    public String synchronizationObjects;

    public static ModifySynchronizationObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySynchronizationObjectRequest self = new ModifySynchronizationObjectRequest();
        return TeaModel.build(map, self);
    }

    public ModifySynchronizationObjectRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifySynchronizationObjectRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public ModifySynchronizationObjectRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public ModifySynchronizationObjectRequest setSynchronizationObjects(String synchronizationObjects) {
        this.synchronizationObjects = synchronizationObjects;
        return this;
    }
    public String getSynchronizationObjects() {
        return this.synchronizationObjects;
    }

}
