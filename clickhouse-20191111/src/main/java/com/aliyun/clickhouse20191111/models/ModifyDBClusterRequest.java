// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterRequest extends TeaModel {
    /**
     * <p>The cluster specifications.</p>
     * <ul>
     * <li><p>For single-replica editions, valid values are:</p>
     * <ul>
     * <li><p><strong>S8</strong></p>
     * </li>
     * <li><p><strong>S16</strong></p>
     * </li>
     * <li><p><strong>S32</strong></p>
     * </li>
     * <li><p><strong>S64</strong></p>
     * </li>
     * <li><p><strong>S104</strong></p>
     * </li>
     * </ul>
     * </li>
     * <li><p>For dual-replica editions, valid values are:</p>
     * <ul>
     * <li><p><strong>C8</strong></p>
     * </li>
     * <li><p><strong>C16</strong></p>
     * </li>
     * <li><p><strong>C32</strong></p>
     * </li>
     * <li><p><strong>C64</strong></p>
     * </li>
     * <li><p><strong>C104</strong></p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>S8</p>
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
     * <p>The number of nodes.</p>
     * <ul>
     * <li><p>For single-replica editions, the valid values are integers from 1 to 48.</p>
     * </li>
     * <li><p>For dual-replica editions, the valid values are integers from 1 to 24.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DBNodeGroupCount")
    public String DBNodeGroupCount;

    /**
     * <p>The storage space of a single node. Unit: GB.</p>
     * <p>Valid values: 100 to 32000.</p>
     * <blockquote>
     * <p>The step size is 100 GB.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DBNodeStorage")
    public String DBNodeStorage;

    /**
     * <p>The storage class. Valid values:</p>
     * <ul>
     * <li><p><strong>CloudESSD</strong>: ESSD PL1 disk.</p>
     * </li>
     * <li><p><strong>CloudESSD_PL2</strong>: ESSD PL2 disk.</p>
     * </li>
     * <li><p><strong>CloudESSD_PL3</strong>: ESSD PL3 disk.</p>
     * </li>
     * <li><p><strong>CloudEfficiency</strong>: ultra disk.</p>
     * </li>
     * <li><p><strong>CloudSSD</strong>: standard SSD.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CloudESSD</p>
     */
    @NameInMap("DbNodeStorageType")
    public String dbNodeStorageType;

    /**
     * <p>The write-inaccessible window. Separate the start time and the end time with a comma. Use the ISO 8601 format for the time.</p>
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
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the region ID.</p>
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
