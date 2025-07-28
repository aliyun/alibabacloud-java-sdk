// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CancelAutoSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>RAM用户的虚拟账号ID。</p>
     * 
     * <strong>example:</strong>
     * <p>155780923770</p>
     */
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>资源主账号的账号名称。</p>
     * 
     * <strong>example:</strong>
     * <p>ECSforCloud</p>
     */
    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>资源主账号的ID，亦即UID。</p>
     * 
     * <strong>example:</strong>
     * <p>155780923770</p>
     */
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("autoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    /**
     * <p>The IDs of the disks for which you want to disable the automatic snapshot policy. To disable the automatic snapshot policy for multiple disks, you can set this parameter to a JSON array that consists of multiple disk IDs, such as [&quot;dxxxxxxxxx&quot;, &quot;dyyyyyyyyy&quot;, … &quot;dzzzzzzzzz&quot;]. Separate the disk IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;d-bp14k9cxvr5uzy54****&quot;, &quot;d-bp1dtj8v7x6u08iw****&quot;, &quot;d-bp1c0tyj9tfli2r8****&quot;]</p>
     */
    @NameInMap("diskIds")
    public String diskIds;

    /**
     * <p>The region ID of the automatic snapshot policy and the disks. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static CancelAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAutoSnapshotPolicyRequest self = new CancelAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CancelAutoSnapshotPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CancelAutoSnapshotPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CancelAutoSnapshotPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CancelAutoSnapshotPolicyRequest setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        return this;
    }
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public CancelAutoSnapshotPolicyRequest setDiskIds(String diskIds) {
        this.diskIds = diskIds;
        return this;
    }
    public String getDiskIds() {
        return this.diskIds;
    }

    public CancelAutoSnapshotPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
