// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachKeyPairRequest extends TeaModel {
    /**
     * <p>The IDs of instances from which you want to unbind the SSH key pair. The value can be a JSON array that consists of up to 50 instance IDs. Separate multiple instance IDs with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The name of the SSH key pair.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the SSH key pair. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DetachKeyPairRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachKeyPairRequest self = new DetachKeyPairRequest();
        return TeaModel.build(map, self);
    }

    public DetachKeyPairRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DetachKeyPairRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public DetachKeyPairRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetachKeyPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachKeyPairRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DetachKeyPairRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
