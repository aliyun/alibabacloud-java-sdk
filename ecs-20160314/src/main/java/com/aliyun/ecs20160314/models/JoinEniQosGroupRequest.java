// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class JoinEniQosGroupRequest extends TeaModel {
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

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

    public static JoinEniQosGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinEniQosGroupRequest self = new JoinEniQosGroupRequest();
        return TeaModel.build(map, self);
    }

    public JoinEniQosGroupRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public JoinEniQosGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public JoinEniQosGroupRequest setQosGroupName(String qosGroupName) {
        this.qosGroupName = qosGroupName;
        return this;
    }
    public String getQosGroupName() {
        return this.qosGroupName;
    }

    public JoinEniQosGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public JoinEniQosGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public JoinEniQosGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
