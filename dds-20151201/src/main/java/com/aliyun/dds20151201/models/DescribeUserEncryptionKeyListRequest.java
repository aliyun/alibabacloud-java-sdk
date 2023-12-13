// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeUserEncryptionKeyListRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The zone ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the most recent zone list.</p>
     */
    @NameInMap("TargetRegionId")
    public String targetRegionId;

    public static DescribeUserEncryptionKeyListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserEncryptionKeyListRequest self = new DescribeUserEncryptionKeyListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserEncryptionKeyListRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeUserEncryptionKeyListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeUserEncryptionKeyListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeUserEncryptionKeyListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeUserEncryptionKeyListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeUserEncryptionKeyListRequest setTargetRegionId(String targetRegionId) {
        this.targetRegionId = targetRegionId;
        return this;
    }
    public String getTargetRegionId() {
        return this.targetRegionId;
    }

}
