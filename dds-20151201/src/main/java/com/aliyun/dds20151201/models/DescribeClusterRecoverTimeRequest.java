// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeClusterRecoverTimeRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp18f7d6b6a7****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The region where the geo-redundancy backup set is stored.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when you query geo-redundancy backups.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestRegion")
    public String destRegion;

    /**
     * <p>Specifies whether to query only the restorable time ranges that support database and table restoration. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: returns only the restorable time ranges that support database and table restoration.</li>
     * <li><strong>false</strong> (default): returns all restorable time ranges.</li>
     * </ul>
     */
    @NameInMap("OnlyDbTableRecovery")
    public Boolean onlyDbTableRecovery;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The region of the source instance for geo-redundancy backups.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when you query geo-redundancy backups.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("SrcRegion")
    public String srcRegion;

    public static DescribeClusterRecoverTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterRecoverTimeRequest self = new DescribeClusterRecoverTimeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterRecoverTimeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeClusterRecoverTimeRequest setDestRegion(String destRegion) {
        this.destRegion = destRegion;
        return this;
    }
    public String getDestRegion() {
        return this.destRegion;
    }

    public DescribeClusterRecoverTimeRequest setOnlyDbTableRecovery(Boolean onlyDbTableRecovery) {
        this.onlyDbTableRecovery = onlyDbTableRecovery;
        return this;
    }
    public Boolean getOnlyDbTableRecovery() {
        return this.onlyDbTableRecovery;
    }

    public DescribeClusterRecoverTimeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeClusterRecoverTimeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeClusterRecoverTimeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeClusterRecoverTimeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeClusterRecoverTimeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeClusterRecoverTimeRequest setSrcRegion(String srcRegion) {
        this.srcRegion = srcRegion;
        return this;
    }
    public String getSrcRegion() {
        return this.srcRegion;
    }

}
