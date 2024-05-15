// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteKeyPairsRequest extends TeaModel {
    /**
     * <p>The names of SSH key pairs. The value can be a JSON array that consists of up to 100 SSH key pair names. Separate the names with commas (,).</p>
     * <br>
     * <p>>  Before you delete an SSH key pair, you can call the [DescribeKeyPairs](https://help.aliyun.com/document_detail/51773.html) operation to query existing key pairs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyPairNames")
    public String keyPairNames;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent list of regions.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteKeyPairsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeyPairsRequest self = new DeleteKeyPairsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKeyPairsRequest setKeyPairNames(String keyPairNames) {
        this.keyPairNames = keyPairNames;
        return this;
    }
    public String getKeyPairNames() {
        return this.keyPairNames;
    }

    public DeleteKeyPairsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteKeyPairsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteKeyPairsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteKeyPairsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
