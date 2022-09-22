// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyEniQosGroupRequest extends TeaModel {
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

    public static ModifyEniQosGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEniQosGroupRequest self = new ModifyEniQosGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEniQosGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyEniQosGroupRequest setQosGroupName(String qosGroupName) {
        this.qosGroupName = qosGroupName;
        return this;
    }
    public String getQosGroupName() {
        return this.qosGroupName;
    }

    public ModifyEniQosGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyEniQosGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyEniQosGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyEniQosGroupRequest setRx(Integer rx) {
        this.rx = rx;
        return this;
    }
    public Integer getRx() {
        return this.rx;
    }

    public ModifyEniQosGroupRequest setRxPps(Integer rxPps) {
        this.rxPps = rxPps;
        return this;
    }
    public Integer getRxPps() {
        return this.rxPps;
    }

    public ModifyEniQosGroupRequest setTx(Integer tx) {
        this.tx = tx;
        return this;
    }
    public Integer getTx() {
        return this.tx;
    }

    public ModifyEniQosGroupRequest setTxPps(Integer txPps) {
        this.txPps = txPps;
        return this;
    }
    public Integer getTxPps() {
        return this.txPps;
    }

}
