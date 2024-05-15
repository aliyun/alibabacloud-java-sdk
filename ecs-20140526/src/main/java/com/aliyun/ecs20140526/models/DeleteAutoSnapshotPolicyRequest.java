// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteAutoSnapshotPolicyRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the automatic snapshot policy. You can call the [DescribeAutoSnapshotPolicyEx](https://help.aliyun.com/document_detail/25530.html) operation to query the available automatic snapshot policies.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("autoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    /**
     * <p>The region ID of the automatic snapshot policy. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static DeleteAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoSnapshotPolicyRequest self = new DeleteAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutoSnapshotPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteAutoSnapshotPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteAutoSnapshotPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteAutoSnapshotPolicyRequest setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        return this;
    }
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public DeleteAutoSnapshotPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
