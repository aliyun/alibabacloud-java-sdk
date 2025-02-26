// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class EndCoordinationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>lina</p>
     */
    @NameInMap("CoordinatorUserId")
    public String coordinatorUserId;

    /**
     * <strong>example:</strong>
     * <p>acp-2zecay9ponatdc4m****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>xiaoming</p>
     */
    @NameInMap("OwnerUserId")
    public String ownerUserId;

    public static EndCoordinationRequest build(java.util.Map<String, ?> map) throws Exception {
        EndCoordinationRequest self = new EndCoordinationRequest();
        return TeaModel.build(map, self);
    }

    public EndCoordinationRequest setCoordinatorUserId(String coordinatorUserId) {
        this.coordinatorUserId = coordinatorUserId;
        return this;
    }
    public String getCoordinatorUserId() {
        return this.coordinatorUserId;
    }

    public EndCoordinationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EndCoordinationRequest setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

}
