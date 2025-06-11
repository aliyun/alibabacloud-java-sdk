// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterRequest extends TeaModel {
    /**
     * <p>The specifications of the cluster.</p>
     * <ul>
     * <li><p>Valid values when the cluster is of Single-replica Edition:</p>
     * <ul>
     * <li><strong>S8</strong></li>
     * <li><strong>S16</strong></li>
     * <li><strong>S32</strong></li>
     * <li><strong>S64</strong></li>
     * <li><strong>S104</strong></li>
     * </ul>
     * </li>
     * <li><p>Valid values when the cluster is of Double-replica Edition:</p>
     * <ul>
     * <li><strong>C8</strong></li>
     * <li><strong>C16</strong></li>
     * <li><strong>C32</strong></li>
     * <li><strong>C64</strong></li>
     * <li><strong>C104</strong></li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>S4-NEW</p>
     */
    @NameInMap("DBClusterClass")
    public String DBClusterClass;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp19lo45sy98x****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The number of nodes in the cluster.</p>
     * <ul>
     * <li>If the cluster is of Single-replica Edition, the value must be an integer that ranges from 1 to 48.</li>
     * <li>If the cluster is of Double-replica Edition, the value must be an integer that ranges from 1 to 24.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DBNodeGroupCount")
    public String DBNodeGroupCount;

    /**
     * <p>The storage capacity of a single node of the cluster. Unit: GB.</p>
     * <p>Valid values: 100 to 32000.</p>
     * <blockquote>
     * <p> This value is a multiple of 100.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DBNodeStorage")
    public String DBNodeStorage;

    /**
     * <p>The storage type of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>CloudESSD</strong>: The cluster uses an Enterprise SSD (ESSD) of performance level 1 (PL1).</li>
     * <li><strong>CloudESSD_PL2</strong>: The cluster uses an ESSD of PL2.</li>
     * <li><strong>CloudESSD_PL3</strong>: The cluster uses an ESSD of PL3.</li>
     * <li><strong>CloudEfficiency</strong>: The cluster uses an ultra disk.</li>
     * <li><strong>CloudSSD</strong>: The cluster uses a standard SSD.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CloudESSD</p>
     */
    @NameInMap("DbNodeStorageType")
    public String dbNodeStorageType;

    /**
     * <p>The time window during which write operations are stopped. Separate the start time and end time with commas (,). Specify the time in the ISO 8601 standard.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-09T20:00:00+08:00,2024-07-09T21:00:00+08:00</p>
     */
    @NameInMap("DisableWriteWindows")
    public String disableWriteWindows;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID You can call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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

    public ModifyDBClusterRequest setDbNodeStorageType(String dbNodeStorageType) {
        this.dbNodeStorageType = dbNodeStorageType;
        return this;
    }
    public String getDbNodeStorageType() {
        return this.dbNodeStorageType;
    }

    public ModifyDBClusterRequest setDisableWriteWindows(String disableWriteWindows) {
        this.disableWriteWindows = disableWriteWindows;
        return this;
    }
    public String getDisableWriteWindows() {
        return this.disableWriteWindows;
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
