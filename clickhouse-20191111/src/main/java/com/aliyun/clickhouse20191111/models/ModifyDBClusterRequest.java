// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterRequest extends TeaModel {
    /**
     * <p>The specifications of the cluster.</p>
     * <br>
     * <p>*   Valid values when the cluster is of Single-replica Edition:</p>
     * <br>
     * <p>    *   **S4-NEW**</p>
     * <p>    *   **S8**</p>
     * <p>    *   **S16**</p>
     * <p>    *   **S32**</p>
     * <p>    *   **S64**</p>
     * <p>    *   **S104**</p>
     * <br>
     * <p>*   Valid values when the cluster is of Double-replica Edition:</p>
     * <br>
     * <p>    *   **C4-NEW**</p>
     * <p>    *   **C8**</p>
     * <p>    *   **C16**</p>
     * <p>    *   **C32**</p>
     * <p>    *   **C64**</p>
     * <p>    *   **C104**</p>
     */
    @NameInMap("DBClusterClass")
    public String DBClusterClass;

    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The number of nodes in the cluster.</p>
     * <br>
     * <p>*   If the cluster is of Single-replica Edition, the value must be an integer that ranges from 1 to 48.</p>
     * <p>*   If the cluster is of Double-replica Edition, the value must be an integer that ranges from 1 to 24.</p>
     */
    @NameInMap("DBNodeGroupCount")
    public String DBNodeGroupCount;

    /**
     * <p>The storage capacity of a single node of the cluster. Unit: GB.</p>
     * <br>
     * <p>Valid values: 100 to 32000.</p>
     * <br>
     * <p>>  This value is a multiple of 100.</p>
     */
    @NameInMap("DBNodeStorage")
    public String DBNodeStorage;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~170875~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterRequest self = new ModifyDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterRequest setDBClusterClass(String DBClusterClass) {
        this.DBClusterClass = DBClusterClass;
        return this;
    }
    public String getDBClusterClass() {
        return this.DBClusterClass;
    }

    public ModifyDBClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterRequest setDBNodeGroupCount(String DBNodeGroupCount) {
        this.DBNodeGroupCount = DBNodeGroupCount;
        return this;
    }
    public String getDBNodeGroupCount() {
        return this.DBNodeGroupCount;
    }

    public ModifyDBClusterRequest setDBNodeStorage(String DBNodeStorage) {
        this.DBNodeStorage = DBNodeStorage;
        return this;
    }
    public String getDBNodeStorage() {
        return this.DBNodeStorage;
    }

    public ModifyDBClusterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBClusterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
