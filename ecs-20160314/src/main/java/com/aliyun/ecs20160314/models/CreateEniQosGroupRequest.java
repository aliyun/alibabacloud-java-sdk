// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateEniQosGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("QosGroupName")
    public String qosGroupName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Rx")
    public Integer rx;

    @NameInMap("RxPps")
    public Integer rxPps;

    @NameInMap("Tx")
    public Integer tx;

    @NameInMap("TxPps")
    public Integer txPps;

    public static CreateEniQosGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEniQosGroupRequest self = new CreateEniQosGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateEniQosGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateEniQosGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateEniQosGroupRequest setQosGroupName(String qosGroupName) {
        this.qosGroupName = qosGroupName;
        return this;
    }
    public String getQosGroupName() {
        return this.qosGroupName;
    }

    public CreateEniQosGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEniQosGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateEniQosGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateEniQosGroupRequest setRx(Integer rx) {
        this.rx = rx;
        return this;
    }
    public Integer getRx() {
        return this.rx;
    }

    public CreateEniQosGroupRequest setRxPps(Integer rxPps) {
        this.rxPps = rxPps;
        return this;
    }
    public Integer getRxPps() {
        return this.rxPps;
    }

    public CreateEniQosGroupRequest setTx(Integer tx) {
        this.tx = tx;
        return this;
    }
    public Integer getTx() {
        return this.tx;
    }

    public CreateEniQosGroupRequest setTxPps(Integer txPps) {
        this.txPps = txPps;
        return this;
    }
    public Integer getTxPps() {
        return this.txPps;
    }

}
