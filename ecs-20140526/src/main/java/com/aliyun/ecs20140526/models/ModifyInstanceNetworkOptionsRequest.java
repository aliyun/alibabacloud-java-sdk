// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetworkOptionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Vpc-L1</p>
     */
    @NameInMap("BandwidthWeighting")
    public String bandwidthWeighting;

    /**
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4p****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyInstanceNetworkOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNetworkOptionsRequest self = new ModifyInstanceNetworkOptionsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNetworkOptionsRequest setBandwidthWeighting(String bandwidthWeighting) {
        this.bandwidthWeighting = bandwidthWeighting;
        return this;
    }
    public String getBandwidthWeighting() {
        return this.bandwidthWeighting;
    }

    public ModifyInstanceNetworkOptionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceNetworkOptionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceNetworkOptionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceNetworkOptionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
